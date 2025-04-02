package brickset;

import javax.swing.text.html.Option;
import java.util.*;

public interface LegoSetInterface {
    /**
     * @return list of 1000 legosets
     */
    public default List<LegoSet> getLegoSets(){
        return new LegoSetRepository().getAll();
    };

    /**
     * Prints ascending order sorted themes where its tag has "Astronomy". Hint: There are tags that may be null
     */
    public void printAllThemesByTag();

    /**
     * Gets statistics according to Theme
     * @param theme is given
     * @return summary statistics by theme
     */
    public LongSummaryStatistics getSummaryStatisticsOfPiecesByTheme(String theme);

    /**
     * @return an average pieces by a theme "Icons"
     */
    public Double getAvgPiecesOfIcons();

    /**
     * Gets sum of pieces by theme
     * @return Map of String(theme) and Integer(sum pieces)
     */
    public Map<String, Integer> getSumOfPiecesByTheme();

    /**
     * @return Map of themes that mapped to sub themes that itself mapped to LegoSet
     */
    public Map<String, Map<String, Set<LegoSet>>> getLegoSetByThemeThenBySubtheme();
}
