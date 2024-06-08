package grupo10.hive.model;

public class Usuario {
  private String nome;
  private int matricula;
  private String lattes;

  public Usuario(String nome, int matricula, String lattes) {
    this.nome = nome;
    this.matricula = matricula;
    this.lattes = lattes;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getLattes() {
    return lattes;
  }

  public void setLattes(String lattes) {
    this.lattes = lattes;
  }
}
