package gof;

public interface Participante {

	public void addParticipante(Participante p);
	public void removeParticipante(Participante p);
	public int getQuantidade();
	public boolean temParticipante();
}
