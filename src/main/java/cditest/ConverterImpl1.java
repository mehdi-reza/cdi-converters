package cditest;


public class ConverterImpl1 implements IConverter<SomeModel, SomeDto> {

	public SomeDto convert(SomeModel source) {
		System.out.println("Converting... "+this);
		return null;
	}

}
