package sistemasdeinformacao.db.dao_testes;

import java.util.Calendar;

import sistemasdeinformacao.db.dao.EmailDAO;
import sistemasdeinformacao.db.dao.UsuarioDAO;
import sistemasdeinformacao.db.entity.Email;
import sistemasdeinformacao.db.entity.Usuario;

public class Teste3 {

	public static void main(String[] args) {
		//Cria dois usuarios e envia um email. Edita o nome de um usuario e o conteudo de um email
		

		//Cria duas contas, envia dois emails e busca todos emails
		
		UsuarioDAO usrDao = new UsuarioDAO();
		EmailDAO emailDao = new EmailDAO();
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(1999, 07, 15);
		
		Usuario usr1 = new Usuario();
		
		usr1.setEndereco("luiza12ll@gmail.com");
		usr1.setNome("Luiza");
		usr1.setPais("Brasil");
		usr1.setDataNascimento(calendar.getTime());
		usr1.setEnderecoRecuperacao("lluiza31@hotmail.com");
		
		Usuario usr2 = new Usuario();
		
		usr2.setEndereco("robertorr13@hotmail.com");
		usr2.setNome("Roberto");
		usr2.setPais("Mexico");
		usr2.setDataNascimento(calendar.getTime());
		usr2.setEnderecoRecuperacao("rroberto321@gmail.com");
		
		Email email = new Email();
		email.setAssunto("Esse é um email de teste");
		email.setConteudo("Isso sera alterado");
		email.setEnderecoRemetente(usr1);
		email.setEnderecoDestino(usr2);
		email.setDataEnvio(Calendar.getInstance().getTime());
		
		usrDao.create(usr1);
		usrDao.create(usr2);
		emailDao.create(email);
		
		usr1.setNome("Luiz");
		email.setConteudo("Isso foi alterado");
		
		usrDao.update(usr1);
		emailDao.update(email);
	}
}
