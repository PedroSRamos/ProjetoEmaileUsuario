package sistemasdeinformacao.db.dao_testes;

import java.util.Calendar;
import java.util.List;

import sistemasdeinformacao.db.dao.EmailDAO;
import sistemasdeinformacao.db.dao.UsuarioDAO;
import sistemasdeinformacao.db.entity.Email;
import sistemasdeinformacao.db.entity.Usuario;

public class Teste2 {
	
	public static void main(String[] args) {
	
		//Cria duas contas, envia dois emails e busca todos emails
		
		UsuarioDAO usrDao = new UsuarioDAO();
		EmailDAO emailDao = new EmailDAO();
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(1999, 07, 15);
		
		Usuario usr1 = new Usuario();
		
		usr1.setEndereco("luiza123ll@gmail.com");
		usr1.setNome("Luiza");
		usr1.setPais("Brasil");
		usr1.setDataNascimento(calendar.getTime());
		usr1.setEnderecoRecuperacao("lluiza321@hotmail.com");
		
		Usuario usr2 = new Usuario();
		
		usr2.setEndereco("robertorr123@hotmail.com");
		usr2.setNome("Roberto");
		usr2.setPais("Mexico");
		usr2.setDataNascimento(calendar.getTime());
		usr2.setEnderecoRecuperacao("rroberto321@gmail.com");
		
		Email email = new Email();
		email.setAssunto("Esse é um email de teste");
		email.setConteudo("Espero que de tudo certo");
		email.setEnderecoRemetente(usr1);
		email.setEnderecoDestino(usr2);
		email.setDataEnvio(Calendar.getInstance().getTime());
		
		Email email2 = new Email();
		email2.setAssunto("Esse é um email de teste2");
		email2.setConteudo("Espero que de tudo certo2");
		email2.setEnderecoRemetente(usr1);
		email2.setEnderecoDestino(usr2);
		email2.setDataEnvio(Calendar.getInstance().getTime());
		
		usrDao.create(usr1);
		usrDao.create(usr2);
		emailDao.create(email);
		emailDao.create(email2);
		
		List<Email> emails = usrDao.getAllEmails("luiza123ll@gmail.com");
		
		for(Email e : emails) {
			System.out.println(e.getAssunto() + " : " + "\n " + e.getConteudo());
		}
	}
}
