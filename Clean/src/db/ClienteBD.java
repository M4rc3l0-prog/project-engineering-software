package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import entities.Cliente;


public class ClienteBD
{

    Connection connection = null;

    public boolean inserirPessoa(Cliente cliente) 
    {
        System.out.println("Inserir Pessoa");
       
        connection = Conexao.getInstance().getConnection();
        
        System.out.println("Conectado e pronto para inserir");
        Statement stmt = null;
        
        try 
        {
            stmt = connection.createStatement();

            String sql = "INSERT INTO cliente(nome_cliente,email_cliente,telefone_cliente,endereco_cliente,complemento_cliente,dtnascimento_cliente,sexo_cliente,senha_cliente) "
            		   + "VALUES ('"+ cliente.getNome() + "','" + cliente.getEmail()+ "','"+ cliente.getTelefone()+"','"+ cliente.getEndereco() + "', '" 
            		   + cliente.getComplemento() + "', '" +cliente.getData()+"','"+cliente.getSexo()+"','"+cliente.getSenha() +"')";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
           
            return true;
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        } 
        finally 
        {
            try 
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    } 

    
    public boolean atualizarPessoa(Cliente cliente, String nomeAlterar) 
    {
        System.out.println("Atualizar Pessoa");
        
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;
    
        try
        {
            stmt = connection.createStatement();

            String sql = "UPDATE dados SET nome='"+cliente.getNome()+"'," +
                         "endereco='"+cliente.getEndereco()+"', telefone='"+cliente.getTelefone()+"'," +
                         "email='"+cliente.getEmail()+"' WHERE nome='"+nomeAlterar+"';";
                    
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            
            return true;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        finally
        {
            
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    }
    
    
    public String relatorioPessoas()
    {
    	String dados = "";
    	
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM dados");
            
            while (res.next())
            {
            	dados += "\n"+res.getString("nome");
				dados += "\n"+res.getString("endereco");
				dados += "\n"+res.getString("telefone");
				dados += "\n"+res.getString("email");
				dados += "\n-----------------------------------------";				
            }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        finally
        {
          
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    	
    	return dados;
    }
    
    public void relatorioTabelaPessoas(Cliente cliente, DefaultTableModel modelo)
    {
       connection = Conexao.getInstance().getConnection();
       System.out.println("Conectado!! Preparando a exclusão");
       Statement stm = null;
           
       try
  	   {
    	   stm = connection.createStatement();
    	   ResultSet res = stm.executeQuery("SELECT * FROM dados");
  		   
    	   while(res.next())
  		   {
    		   cliente.setNome(res.getString("nome"));
    		   cliente.setEndereco(res.getString("endereco"));
    		   cliente.setTelefone(res.getString("telefone"));
    		   cliente.setEmail(res.getString("email"));
  			 
  			   modelo.addRow(new Object[] {res.getString("nome"),res.getString("endereco"),
  					   res.getString("telefone"),res.getString("email")});
  		   }
  	   }
       catch(SQLException ex)
  	   {
  		   System.out.println("Erro SQL: " + ex.getMessage());
  	   }
  	   finally 
       {
         try
         {
             stm.close();
             connection.close();
         }
         catch (SQLException e)
         {
             System.out.println("Erro ao desconectar" + e.getMessage());
         }
       }
    	
    }
    
    public boolean excluirPessoa(Cliente cliente) 
    {
    	boolean status = true;
    	
        System.out.println("Excluir Pessoa");
        
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para Excluir");
        Statement stmt = null;
        
        try 
        {
            stmt = connection.createStatement();
            
            String sql = "DELETE FROM dados WHERE nome='"+cliente.getNome()+"'";
            
            System.out.println("SQL: " + sql);
            
            if(stmt.executeUpdate(sql)!=0)
            {
            	status = true;	
            }
            else
            {
            	status = false;
            }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            status = false;
        }
        finally 
        {
            
            try
            {
                stmt.close();
                connection.close();
            } 
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return status;
    }
    
    public boolean procuraPessoa(Cliente cliente, String nomeConsulta)
    {
    	boolean status = true;
		        
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a procura");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM dados");
            
            while(res.next())
			{
			   if(res.getString("nome").compareTo(nomeConsulta)==0)
			   {
				  cliente.setEndereco(res.getString("endereco"));
				  cliente.setTelefone(res.getString("telefone"));
				  cliente.setEmail(res.getString("email"));
				  status = true;						  
			   }					   			   
		    }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            status = false;
        }
        finally
        {
          
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
                status = false;
            }
        }
    	
		return status;
    }
    
}
