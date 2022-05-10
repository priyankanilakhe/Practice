package programming;
//import static java.util.Map.entry;
import java.util.Map;

public class MapOfEntries1 {
  public static void main(String[] args) {
	Map<Integer, String> map = Map.ofEntries(
		Map.entry(101, "PP"),
		Map.entry(102, "QQ"),
		Map.entry(103, "RR")
	);
	map.forEach((k, v) -> System.out.println(k + " - " + v));
  }
} 