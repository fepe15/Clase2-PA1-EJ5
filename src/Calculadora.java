
public class Calculadora implements ICalcular {

	@Override
	public Double sumar(Number numUno, Number numDos) {
		return numUno.doubleValue() + numDos.doubleValue();
	}

	@Override
	public Double restar(Number numUno, Number numDos) {
		
		return numUno.doubleValue() - numDos.doubleValue();
	}

	@Override
	public Double multiplicar(Number numUno, Number numDos) throws MyException {
		
		if(numDos.intValue() == 0 )
		{
			throw new MyException("Se intento multiplicar por cero");
		}
		return numUno.doubleValue() * numDos.doubleValue();
	}

	@Override
	public Double dividir(Number numUno, Number numDos) {
		if(numDos.intValue() == 0)
		{
			throw new RuntimeException("Se intento dividir por cero");
		}
		return numUno.doubleValue() / numDos.doubleValue();
	}
	



}
