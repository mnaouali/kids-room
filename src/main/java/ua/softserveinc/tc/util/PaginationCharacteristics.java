package ua.softserveinc.tc.util;

import org.apache.commons.lang3.StringUtils;
import ua.softserveinc.tc.entity.pagination.SortingPagination.*;


import java.util.List;

public final class PaginationCharacteristics {
    public static long searchCount = 0;

    public static long definePage(long start, long paginationLength, long itemsLength) {
        long totalPages = itemsLength / paginationLength;
        return totalPages * start / itemsLength;
    }

//    public static boolean isSearched(List<Search> searches) {
//        return !searches.parallelStream()
//                .map(Search::getColumn)
//                .allMatch(StringUtils::isEmpty);
//    }

}