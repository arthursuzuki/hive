package grupo10.hive.dao;

public interface GenericDAO<T> {
  T buscar(String id);
  boolean incluir(T objeto);
  boolean alterar(T objeto);
  boolean excluir(String id);
}
