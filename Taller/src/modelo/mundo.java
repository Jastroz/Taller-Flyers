package modelo;

public class mundo 
{
	private Bird pajaro;
	private Helicopter helicoptero;
	private SuperMan superHombre;
	private HidroPlano hidrop;
	
	public mundo()
	{
		pajaro = new Bird();
		helicoptero = new Helicopter();
		superHombre = new SuperMan();
		hidrop = new HidroPlano();
	}
	
}
