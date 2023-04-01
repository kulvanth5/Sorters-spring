// import java.lang.annotation.*;
import java.lang.reflect.Method;

import annotations.*;

public class Main{
	
	public String execute() throws Throwable {
		Class<CustomController> controller = CustomController.class;
		//Annotation[] annotations = controller.getDeclaredAnnotations();
		//boolean restController = controller.isAnnotationPresent(RestController.Class);
		SortController sortController = controller.getAnnotation(SortController.class);

		if (sortController != null){
			Method[] methods = controller.getMethods();
			for(Method method : methods) {
				//boolean requestMapping = method.isAnnotationPresent(ResquestMapping.Class)
				RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
				if (requestMapping.invoke()){
					if(requestMapping != null) {
						method.invoke(controller.newInstance());
					}
				}
			}

		}

		// SortController sort = controller.getAnnotation(annotationClass=SortController.class);
		
		return null;
	}

	public static void main(String... args){
		try{
		new Main().execute();
		} catch (Throwable e){

		}

		
	}
}