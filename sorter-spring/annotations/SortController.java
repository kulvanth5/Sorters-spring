package annotations;

import java.lang.annotation.*;
import sorters.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SortController{
	int[]  list();
	String strategy();

	if(strategy=="MERGE")
		merge obj = new merge();
		list = obj.sort_strategy(double(list));
		return list;
}