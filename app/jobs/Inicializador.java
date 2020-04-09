package jobs;

import models.Administrador;
import models.Bolsa;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Inicializador extends Job {
	

	@Override
	public void doJob() throws Exception{
		if(Bolsa.count()==0) {
			Bolsa bolsa = new Bolsa();
			bolsa.nome="Assistencia";
			bolsa.turno="Vespertino";
			bolsa.setor="Assistencia Social";
			bolsa.detalhes="Trabalhar no setor de assistencia social do campus";
			bolsa.save();
			
			Bolsa bolsa2 = new Bolsa();
			bolsa2.nome="COMULT";
			bolsa2.turno="Matutino";
			bolsa2.setor="COMULT IFRN";
			bolsa2.detalhes="Trabalhar no setor da COMULT imprimindo coisas";
			bolsa2.save();
			
			Administrador adm = new Administrador();
			adm.nome = "ADM-01";
			adm.matricula= "202001";
			adm.senha = "adm202001";
			
			Administrador adm2 = new Administrador();
			adm2.nome = "ADM-02";
			adm2.matricula = "202002";
			adm2.senha = "adm202002";
		}
		
		
	}
	
	
}
