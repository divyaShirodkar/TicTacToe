import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Board {
    Map<Coordinate, Symbol> coordinateMap;

    public Board() {
        this.coordinateMap = new HashMap<>();
        Coordinate coordinate1 = new Coordinate(0, 0);
        Coordinate coordinate2 = new Coordinate(0, 1);
        Coordinate coordinate3 = new Coordinate(0, 2);
        Coordinate coordinate4 = new Coordinate(1, 0);
        Coordinate coordinate5 = new Coordinate(1, 1);
        Coordinate coordinate6 = new Coordinate(1, 2);
        Coordinate coordinate7 = new Coordinate(2, 0);
        Coordinate coordinate8 = new Coordinate(2, 1);
        Coordinate coordinate9 = new Coordinate(2, 2);

        coordinateMap.put(coordinate1, null);
        coordinateMap.put(coordinate2, null);
        coordinateMap.put(coordinate3, null);
        coordinateMap.put(coordinate4, null);
        coordinateMap.put(coordinate5, null);
        coordinateMap.put(coordinate6, null);
        coordinateMap.put(coordinate7, null);
        coordinateMap.put(coordinate8, null);
        coordinateMap.put(coordinate9, null);

    }

    public Boolean validateWinner() {
        List<Coordinate> allXs = coordinateMap
                .entrySet()
                .stream().
                        filter(cm -> cm.getValue() == Symbol.X)
                .map(e -> e.getKey())
                .collect(Collectors.toList());

        List<Coordinate> allOs = coordinateMap
                .entrySet()
                .stream().
                        filter(cm -> cm.getValue() == Symbol.O)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
        if (allXs.size() >= 3 || allOs.size() >= 3) {
            if (checkDiagonal(allOs) || checkDiagonal(allXs)) {
                return true;
            }
            if (checkHorizontal(allOs) || checkHorizontal(allXs)) {
                return true;
            }
            if (checkVertical(allOs) || checkVertical(allXs)) {
                return true;
            }
            if(checkHorizontal(allOs) || checkHorizontal(allXs)){
                return true;
            }

        }
        return false;
    }

    private boolean checkHorizontal(List<Coordinate> coordinateSubset) {

        if (coordinateSubset.stream().
                filter(coordinate -> coordinate.getxCoordinate() == 0)
                .collect(Collectors.toList())
                .size() == 3) {
            return true;
        }

        if (coordinateSubset.stream().
                filter(coordinate -> coordinate.getxCoordinate() == 1)
                .collect(Collectors.toList())
                .size() == 3) {
            return true;
        }

        if (coordinateSubset.stream().
                filter(coordinate -> coordinate.getxCoordinate() == 2)
                .collect(Collectors.toList())
                .size() == 3) {
            return true;
        }




        return false;
    }

    private boolean checkVertical(List<Coordinate> coordinateSubset) {
        if (coordinateSubset.stream().
                filter(coordinate -> coordinate.getyCoordinate() == 0)
                .collect(Collectors.toList())
                .size() == 3) {
            return true;
        }

        if (coordinateSubset.stream().
                filter(coordinate -> coordinate.getyCoordinate() == 1)
                .collect(Collectors.toList())
                .size() == 3) {
            return true;
        }

        if (coordinateSubset.stream().
                filter(coordinate -> coordinate.getyCoordinate() == 2)
                .collect(Collectors.toList())
                .size() == 3) {
            return true;
        }
        return false;
    }

    private boolean checkDiagonal(List<Coordinate> allOs) {
        if (allOs.stream().
                filter(coordinate -> coordinate.getxCoordinate() == coordinate.getyCoordinate())
                .count() == 3) {
            return true;
        }
        if (allOs.stream().
                filter(coordinate -> coordinate.getxCoordinate() + coordinate.getyCoordinate() == 2).count() == 3) {
            return true;
        }
        return false;

    }
}

