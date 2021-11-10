package entities;

import java.util.Date;
import java.util.Objects;

public class Cliente {

	private String nome;
	private String email;
	private String endereco;
	private String sexo;
	private String complemento;
	private Date data;
	private String senha;
	
	
	public Cliente(String nome, String email, String endereco, String sexo, String complemento, Date data,
			String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.sexo = sexo;
		this.complemento = complemento;
		this.data = data;
		this.senha = senha;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(complemento, data, email, endereco, nome, senha, sexo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(complemento, other.complemento) && Objects.equals(data, other.data)
				&& Objects.equals(email, other.email) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(nome, other.nome) && Objects.equals(senha, other.senha)
				&& Objects.equals(sexo, other.sexo);
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", endereco=" + endereco + ", sexo=" + sexo
				+ ", complemento=" + complemento + ", data=" + data + ", senha=" + senha + "]";
	}
	
	
	
	
}
