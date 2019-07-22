package gof;

public class Cliente {

	public static void main(String[] args) {
		
		/*** Instanciando um congresso ***/
		Congresso sbrt = new Congresso("SBrT");
		
		/*** Instanciando participantes membros de uma Instituição ***/
		Participante participante1 = new Individuo("Luana", sbrt.proximoAssentoDisponivel());
		Participante participante2 = new Individuo("Gutierrez", sbrt.proximoAssentoDisponivel());
		
		/*** Instanciando participante IFPB como instituição ***/
		Participante ifpb = new Instituicao("IFPB");
		
		/*** Adicionando participante à instituição IFPB***/
		ifpb.addParticipante(participante1);
		ifpb.addParticipante(participante2);
		
		/*** Adicionando participante sem vínculo a qualquer instituição ***/
		Participante participante3 = new Individuo("Daltro", sbrt.proximoAssentoDisponivel());
		
		/*** Adicionando todos os participantes ao congresso ***/
		sbrt.adicionarParticipante(ifpb);
		sbrt.adicionarParticipante(participante3);
		
		/*** Imprimindo todas as informações do congresso SBrT***/
		System.out.println(sbrt.toString());

	}

}
