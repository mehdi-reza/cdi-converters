package cditest;

public interface IConverter<S, T> {
	
	public T convert(S source);
	
}
