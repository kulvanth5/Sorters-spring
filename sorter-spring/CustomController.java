import annotations.*;

@SortController(list={1,3,-5,-9,0},strategy =  "MERGE")
public class CustomController {

	@RequestMapping(invoke = true)
	public int[] sorter(){
		int[] list = {1,3,-5,-9,0};
		System.out.println(list);
		return list;
	}
	@RequestMapping
	public String method() {
		System.out.println("Sairam0");
		return "Sairam";
	}

	@RequestMapping (invoke = true)
	public String method1() {
		System.out.println("Sairam1");
		return "Sairam";
	}

	@RequestMapping
	public String method2() {
		System.out.println("Sairam2");
		return "Sairam";
	}

	@RequestMapping (invoke = true)
	public String method3() {
		System.out.println("Sairam3");
		return "Sairam";
	}

}