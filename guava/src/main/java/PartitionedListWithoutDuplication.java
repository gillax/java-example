import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class PartitionedListWithoutDuplication {
	public static void main(String... args) {
		List<String> favBands = Lists.newArrayList("Lotus","STS9","Disco Biscuits","New Deal","Flying Lotus","STS9");
		System.out.println(favBands);

		// without duplicate(HashSet)
		List<String> favBandWithoutDups = Lists.newArrayList(Sets.newHashSet(favBands));
		System.out.println(favBandWithoutDups);

		// without duplicate and keep order(LinkedHashSet)
		List<String> favBandWithoutDupsKeepOrder = Lists.newArrayList(Sets.newLinkedHashSet(favBands));
		System.out.println(favBandWithoutDupsKeepOrder);

		// partitioned
		List<List<String>> partitionedLists = Lists.partition(favBandWithoutDupsKeepOrder, 2);
		System.out.println(partitionedLists);
	}
}
