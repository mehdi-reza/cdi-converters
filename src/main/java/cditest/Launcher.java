package cditest;

import javax.inject.Inject;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Launcher {
	public static void main(String[] args) {
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		Launcher application = container.select(Launcher.class).get();
		application.run();
		weld.shutdown();
	}

	@Inject
	@Converter
	IConverter<SomeDto, SomeModel> converter1;

	@Inject
	@Converter
	IConverter<SomeModel, SomeDto> converter2;
	
	private void run() {
		System.out.println("Running in cdi container");
		converter1.convert(new SomeDto());
		
		converter2.convert(new SomeModel());
	}
}
