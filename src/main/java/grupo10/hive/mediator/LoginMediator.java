package grupo10.hive.mediator;
import grupo10.hive.model.Usuario;

public class LoginMediator {
  private static LoginMediator instancia;

  private LoginMediator() {}

  public static synchronized LoginMediator obterInstancia() {
      if (instancia == null) {
          instancia = new LoginMediator();
      }
      return instancia;
  }

  public String buscar(String email) {
      return "Detalhes do usuário";
  }

  public String validar(Usuario usuario) {
      return "Validado";
  }
}
