package classes;

import java.util.List;

public interface PessoaDAO {
	public void save(Pessoa p);
	public List<String> isValidToInclude(Pessoa p);
}
