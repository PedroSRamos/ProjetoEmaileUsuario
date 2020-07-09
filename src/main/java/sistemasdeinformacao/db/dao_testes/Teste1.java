package sistemasdeinformacao.db.dao_testes;

import java.util.Calendar;

import sistemasdeinformacao.db.dao.EmailDAO;
import sistemasdeinformacao.db.dao.UsuarioDAO;
import sistemasdeinformacao.db.entity.Email;
import sistemasdeinformacao.db.entity.Usuario;

public class Teste1 {
	public static void main(String[] args) {
		UsuarioDAO usrDao = new UsuarioDAO();
		EmailDAO emailDao = new EmailDAO();
		
		//Cria dois usuarios e envia  um email
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(1999, 07, 15);
		
		Usuario usr1 = new Usuario();
		
		usr1.setEndereco("luizall@gmail.com");
		usr1.setNome("Luiza");
		usr1.setPais("Brasil");
		usr1.setDataNascimento(calendar.getTime());
		usr1.setEnderecoRecuperacao("lluiza@hotmail.com");
		
		Usuario usr2 = new Usuario();
		
		usr2.setEndereco("robertorr@hotmail.com");
		usr2.setNome("Roberto");
		usr2.setPais("Mexico");
		usr2.setDataNascimento(calendar.getTime());
		usr2.setEnderecoRecuperacao("rroberto@gmail.com");
		
		Email email = new Email();
		email.setAssunto("Esse é um email de teste");
		email.setConteudo("Espero que de tudo certo");
		email.setEnderecoRemetente(usr1);
		email.setEnderecoDestino(usr2);
		email.setDataEnvio(Calendar.getInstance().getTime());
		
		usrDao.create(usr1);
		usrDao.create(usr2);
		emailDao.create(email);
	}
}
