package cditest;


public class ConverterImpl2 implements IConverter<SomeDto, SomeModel> {

	public SomeModel convert(SomeDto source) {
		System.out.println("Converting... "+this);
		return null;
	}

}
