public class Tv {
    public int volume;
	public int canal;
    public void aumentarVolume() {
		if (volume < 100) {
			volume++;
		}
	}
	public void reduzirVolume(){
		if (volume > 0) {
			volume--;
		}
	}

    public void trocarCanal(int canal) {
		this.canal = canal;
		
	}
    public int getVolume(){
		return volume;
	}
    public int getCanal(){
		return canal;
	}
    public void mostrar(){
		System.out.println("Volume: " + getVolume() + " Canal: " + getCanal());
	}
}