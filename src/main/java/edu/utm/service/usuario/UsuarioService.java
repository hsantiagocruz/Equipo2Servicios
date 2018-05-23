package edu.utm.service.usuario;

import java.util.List;
import edu.utm.bd.domain.Usuario;

public interface UsuarioService {
	List<Usuario> findAllUsuarios();
	void updateUsuario(Usuario usuario);
	Usuario findOneUsuario(Usuario usuario);
	void insertUsuario(Usuario usuario);
	void deleteOneUsuario(Usuario usuario);
}
