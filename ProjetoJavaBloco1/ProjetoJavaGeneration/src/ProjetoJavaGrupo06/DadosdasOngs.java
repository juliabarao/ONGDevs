package ProjetoJavaGrupo06;

import java.util.ArrayList;
import java.util.List;

public class DadosdasOngs extends Ong{




	public DadosdasOngs(ArrayList<String> nome, ArrayList<String> contato, ArrayList<String> descricao) {
		super(nome, contato, descricao);
	}

	public DadosdasOngs() {}


	
	
	public List<String> getNomeSaude() {
		nome.add("Tucca");
		nome.add("Sa�de Crian�a");
		nome.add("Lar Teresa de Jesus");
		nome.add("Horas de Vida");
		return nome;
	}
	
	public List<String> getContatoSaude() {
		contato.add("Contato: (11) 2522-5712\r\n" + 
				"https://www.tucca.org.br/");
		contato.add("Telefone: (21) 2512-1123\r\n Site: https://larteresadejesus.org/" + 
				"");
		contato.add("Telefone: (31) 3291-1330\n Site: https://larteresadejesus.org\r\n" + 
				"");
		contato.add("Telefone:(11) 9 9102-1588   \nSite: https://www.horasdavida.org.br\r\n" + 
				"");
		return contato;
	}
	
	public List<String> getDescricaoSaude() {
		descricao.add("A TUCCA (Associa��o para Crian�as e Adolescentes com C�ncer)"
				+ " foi fundada em 1998 por m�dicos, pais de pacientes e representantes da sociedade civil, "
				+ "com a proposta de elevar as taxas de cura e melhorar a qualidade de vida de crian�as");
		
		descricao.add("Fundada em 1991, pela Dra. Vera Cordeiro, m�dica e cl�nica geral, "
				+ "com especializa��o em Psicossom�tica, a Associa��o Sa�de Crian�a (ASC) tem a miss�o de "
				+ "promover a transforma��o de fam�lias em situa��o de vulnerabilidade social.\r\n" + 
				"O trabalho da institui��o, localizada no Rio de Janeiro, � feito de forma multidisciplinar"
				+ " e integrada. Favorecendo o desenvolvimento humano, a institui��o oferece programas que atuam "
				+ "nas 05 �reas: sa�de, moradia, cidadania, renda e educa��o.\r\n" + 
				"");
		
		descricao.add("A ONG de Belo Horizonte, Lar Teresa de Jesus,acolhe e presta atendimento a pacientes "
				+ "\nportadores de c�ncer, que moram no interior de Minas Gerais. A casa de apoio preza pelo bem"
				+ "\n estar, qualidade de vida e amparo integral para os assistidos. Ao longo de 18 anos de exist�ncia, "
				+ "\na ONG j� atendeu mais de 12.000 pacientes e seus acompanhantes. Com 04 unidades em Belo Horizonte (MG),"
				+ "\n a institui��o oferece servi�os como: hospedagem ao acolhido e 01 acompanhante , refei��es, "
				+ "\ntransporte para os hospitais, assist�ncia social, psicol�gica, nutricional e enfermagem.");
		
		descricao.add("Uma rede de voluntariado que atua de forma humanizada com o intuito de diminuir "
				+ "\nas lacunas existentes no sistema de sa�de atual. A institui��o atende casos de baixa "
				+ "\ncomplexidade, com atendimentos e exames com hora marcada nos consult�rios. A Ong Horas "
				+ "\nde Vida atua em S�o Paulo (SP) e Curitiba (PR) e  atende pacientes associados de 12 institui��es."
				+ "\n Entre os servi�os prestados est�o: mapeamento populacional, triagem (para entender as necessidades"
				+ "\n dos pacientes e direcion�-los para as devidas especialidades.");
		
		return descricao;
	}
	
	
	public List<String> getNomeTrabalho() {
		nome.add("Cruzando Hist�rias");
		nome.add("Worldpackers");
		nome.add("Livre de Trabalho Infantil");
		return nome;
	}
	
	public List<String> getContatoTrabalho() {
		contato.add("Telefone: (11) 97033-6229\n   Site: https://www.cruzandohistorias.org/ ");
		contato.add("Telefone: XXXXXXXXXXXXXX                    \nSite: https://www.worldpackers.com/pt-BR/search/south_america/brazil");
		contato.add("Telefone: XXXXXXXXXXXXXXXX    \nhttps://livredetrabalhoinfantil.org.br/institucional/quem-somos/");
		return contato;
	}
	
	public List<String> getDescricaoTrabalho() {
		descricao.add("Uma organiza��o civil que escuta, acolhe e desenvolve mulheres que est�o sem trabalho e renda.");
		descricao.add("A Worldpackers � uma comunidade colaborativa que te conecta com anfitri�es "
				+ "\nacolhedores do mundo inteiro onde voc� pode viajar trocando suas habilidades por hospedagem.");
		descricao.add("O Crian�a Livre de Trabalho Infantil � um projeto idealizado a partir dos debates promovidos "
				+ "\njunto ao Minist�rio P�blico do Trabalho (MPT) no F�rum Paulista de Preven��o e Erradica��o do Trabalho Infantil, "
				+ "\nna perspectiva de an�lise da rela��o entre racismo e trabalho infantil e a compreens�o da educa��o antirracista tamb�m "
				+ "\ncomo uma estrat�gia para o seu enfrentamento.\r\n" + 
				"\r\n" + 
				"Criado em 2016 pela organiza��o da sociedade civil Cidade Escola Aprendiz, o projeto ent�o chamado �Rede Peteca � Chega de Trabalho Infantil" + ", visando a promo��o dos direitos da crian�a e do adolescente a partir da erradica��o do trabalho infantil, acolhe no ano 2021 uma reformula��o e o novo nome. Com isso, foi criada a se��o de educa��o antirracista e o desenvolvimento dos conte�dos e a��es, com apoio do MPT e do F�rum Nacional de Preven��o e Erradica��o do Trabalho Infantil (FNPETI).\r\n" + 
				"");
		return descricao;
	}
	
	public List<String> getNomeEducacao() {
		nome.add("Generation Brazil");
		nome.add("Funda��o Abrinq");
		nome.add("Projeto Urer�");
		nome.add("Associa��o Vaga Lume");
		return nome;
	}
	
	public List<String> getContatoEducacao() {
		contato.add("0800 707 1027\r\n" + 
				"https://brazil.generation.org/");
		contato.add("https://www.fadc.org.br/");
		
		contato.add("Telefone: (21) 3881-6219" + 
		"https://www.projetouere.org.br\r\n" + "");
		
		contato.add("https://vagalume.org.br\r\n" + 
				"Telefone: (11) 3032-6032");
		return contato;
	}
	
	public List<String> getDescricaoEducacao() {
		descricao.add("\nGeneration Brasil - Nossa miss�o � transformar sistemas de educa��o para o emprego de maneira a preparar,\n"
				+ "\n colocar e apoiar pessoas em carreiras transformadoras que, de outra forma, seriam inacess�veis");
		
		descricao.add(" Sede em S�o Paulo, mas realiza trabalho em todo o pa�s\r\n" + 
				"A Funda��o Abrinq pelos Direitos da Crian�a e do Adolescente foi criada em 13 de fevereiro de 1990, "
				+ "\npautada pela Conven��o Internacional dos Direitos da Crian�a (ONU, 1989), "
				+ "\npela Constitui��o Federal Brasileira (1988) e pelo Estatuto da Crian�a e do Adolescente (1990). "
				+ "\nA institui��o promove a implementa��o de a��es p�blicas, fortalecimento de organiza��es"
				+ "\n n�o governamentais e governamentais para presta��o de servi�os ou defesa de direitos, e "
				+ "\narticula��o pol�tica e social em prol dos direitos da crian�a e do adolescente.\r\n" + 
				"");
		
		
		descricao.add("Sede no Rio de Janeiro\r\n" + 
				"O Projeto UER�, localizado no Complexo da Favela da Mar�, na comunidade da Baixa do Sapateiro, "
				+ "\natende 430 crian�as e jovens anualmente e mais de 130 mil crian�as j� t�m contato com a Pedagogia"
				+ "\n UER�-MELLO em diversas cidades do Brasil. A organiza��o � uma escola com uma metodologia desenhada "
				+ "\npara crian�as e jovens com bloqueios cognitivos e emocionais, devido � exposi��o\r\n" + 
				"");
		
		
		descricao.add("Sede em S�o Paulo, mas atende todas as �reas da floresta amaz�nica brasileira"
				+ "\n (estados do Acre, Amap�, Amazonas, Maranh�o, Mato Grosso, Par�, Rond�nia, Roraima e Tocantins)\r\n" + 
				"\nDesde quando foi criada, em 2001, a Associa��o Vaga Lume atua em comunidades rurais da Amaz�nia Legal brasileira,"
				+ "\n desenvolvendo projetos de educa��o, cultura, e estimulando, principalmente, a leitura, escrita e oralidade."
				+ "\n A partir do trabalho volunt�rio em 23 munic�pios na regi�o da Amaz�nia Legal brasileira e na cidade de S�o Paulo,"
				+ "\n a institui��o intensificou seu interc�mbio nas comunidades e ampliou o alcance das suas a��es. Atualmente 22 mil"
				+ "\n crian�as, jovens e adultos participam das atividades da ONG. Al�m disso, 159 bibliotecas foram criadas e quase 100 "
				+ "\nmil livros foram distribu�dos em �reas de dif�cil acesso.\r\n" + 
				"");
		
		return descricao;
	}
	
	public List<String> getNomeCidadao() {
		nome.add("Moradia e Cidadania");
		nome.add("Amigos do Bem");
		nome.add("Tem Gente com Fome");
		nome.add("Ampara�");
		nome.add("Banco de Alimentos");
		return nome;
	}
	
	public List<String> getContatoCidadao() {
		contato = new ArrayList<String>();
		contato.add("Telefone:(61) 3224-8071  \n Site: https://moradiaecidadaniamg.org.br/sobre-nos/"+"Para ajuda-l� basta acessar o site e realizar uma doa��o ");
		contato.add("Telefone: (11) 3019-0100\r\n" + 
				"Site: https://www.amigosdobem.org/\r\n" + 
				"");
		contato.add("Telefone: XXXXXX \n Site: https://www.temgentecomfome.com.br/");
		contato.add("Telefone: XXXXXXXXXX \nSite: https://misturai.com/amparai/");
		contato.add("Telefone: XXXXXXXXX\r\n" + 
				"Site: https://www.bancodealimentos.org.br/\r\n" + 
				"");
		return contato;
	}
	
	public List<String> getDescricaoCidadao() {
		descricao.add("ONG Moradia e Cidadania - teve origem no Comit� da A��o da Cidadania criado em "
				+ "\n1993 pelos empregados da Caixa Econ�mica Federal. � respons�vel por iniciativas como: educa��o, gera��o de trabalho e renda"
				+ "\n e apoio �s a��es de combate � fome e � mis�ria para comunidades de baixa renda");
		
		
		descricao.add("ONG criada h� 27 anos se tornou um dos maiores grupos de volunt�rios ativos no pa�s,"
				+ " ajudando mais de 75 mil pessoas nos estados de Alagoas, "
				+ "Cear� e Pernambuco e servindo mais de 180 mil refei��es todos os meses.");
		
		
		
		descricao.add("A Coaliz�o Negra Por Direitos, em parceria com a Anistia Internacional, Oxfam Brasil, Redes da Mar�,"
				+ " A��o Brasileira de Combate �s Desigualdades, e outros, lan�aram uma campanha para arrecadar "
				+ "fundos e para a��es emergenciais no enfrentamento � fome, � mis�ria e � viol�ncia na pandemia de Covid-19.");
		
		
		descricao.add("Criado em 20 de mar�o de 2020, o Ampara� tem como objetivo distribuir diariamente "
				+ "refei��es para pessoas em situa��o de vulnerabilidade social em Porto Alegre");
		
		
		descricao.add("ONG ajuda a combater o desperd�cio e alimenta milhares de pessoas em situa��o de inseguran�a alimentar."
				+ " Voc� pode ajudar de forma pontual ou recorrente");
		return descricao;
	}
	
	public List<String> getNomeAnimais() {
		 nome.add("AMPARA Animal");
		 nome.add("Arca Brasil ");
		 nome.add("Clube dos Vira-latas");
		 nome.add("C�o sem dono ");
		 return nome;
	}
	
	public List<String> getContatoAnimais() {
		contato.add("Telefone: XXXXXXXX\nSite: https://amparanimal.org.br/");
		contato.add("Telefone: (11) 3031-6991 \nSite: https://arcabrasil.org.b");
		contato.add("Telefone: xxxxxxxxxx\n Site:  https://www.clubedosviralatas.org.br/");
		contato.add("Telefone: TEL. (11) 4970-8010 \n Site: https://nfpet.com.br/blog/ ");
		return contato;
	}
	
	public List<String> getDescricaoAnimais() {
		descricao.add("A AMPARA Animal (Associa��o de Mulheres Protetoras dos Animais Rejeitados e Abandonados) "
				+ "� uma OSCIP sem fins lucrativos que ajuda abrigos e protetores independentes com ra��o, medicamentos "
				+ "e atendimento veterin�rio.");
		descricao.add("Na lista de ONGs de animais est� a Arca Brasil, inaugurada em 1993. Essa entidade"
				+ "\n foi a primeira no pa�s a planejar um programa municipal para conter a prolifera��o de"
				+ "\n c�es e gatos nas ruas. Assim, com esse projeto piloto, ela serviu de modelo para v�rias outras "
				+ "\nassocia��es e �rg�os p�blicos. At� mesmo a capital paulista copiou a ideia.");
		descricao.add("A boa not�cia para quem ama os amigos de quatro patas � que as ONGs de animais s�o muito "
				+ "\nnumerosas mesmo. Nesse sentido, temos tamb�m o Clube dos Vira-latas. Essa associa��o desenvolve"
				+ "\n programas para incentivar a ado��o de pets.\r\n" + 
				"Entre as suas realiza��es est�o campanhas para castra��o, para interven��es cir�rgicas e para vacinar."
				+ "\n Eles s�o da �rea do Grande ABC, regi�o metropolitana de S�o Paulo.\r\n" + 
				"");
		descricao.add("Em Itapecerica da Serra, S�o Paulo, h� mais iniciativas interessantes de ONGs de animais. Desse modo,"
				+ " a institui��o C�o sem Dono � outra op��o para dar aquela for�a.\r\n" + 
				"Afinal, eles focam em bichos v�timas de maus-tratos. No local, a alimenta��o de "
				+ "\nc�es e gatos consome uma quantidade di�ria de ra��o que chega a 200 quilos. Mais um ponto a favor:"
				+ "\n a associa��o fica de portas abertas para o p�blico.\r\n" + 
				"");
		return descricao;
	}
	
}
