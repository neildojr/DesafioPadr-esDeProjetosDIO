package one.digitalinnovation.gof.singleton;

/**
  * Singleton "preguiçoso"
  * 
  * @see <a href="http://stackoverflow.com/a/24018148"> Referencia LazyHolder</a>
  * 
  * @author neildojr
  */
public class SingletonLazyHolder {
	
	private static class InstanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder(); 
	}

	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
