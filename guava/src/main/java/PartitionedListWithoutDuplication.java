import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class PartitionedListWithoutDuplication {
	public static void main(String... args) {
		List<String> favBands = Lists.newArrayList("Lotus","STS9","Disco Biscuits","New Deal","Flying Lotus","STS9");
		System.out.println(favBands);

		// without duplicate
		List<String> favBandWithoutDups = Lists.newArrayList(Sets.newHashSet(favBands));
		System.out.println(favBandWithoutDups);

		// partitioned
		List<List<String>> partitionedLists = Lists.partition(favBandWithoutDups, 2);
		System.out.println(partitionedLists);
	}
}
