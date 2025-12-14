import java.util.List;
import java.util.stream.Collectors;

public class CodingBatFunctionalProblems {
    /*
    Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
    noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
    noZ(["hziz", "hzello", "hi"]) → ["hi"]
    noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
     */
    public List<String> noz(List<String> strings) {
        return strings.stream()
                .filter(s->!s.contains("z"))
                .collect(Collectors.toList());
    }
    /*Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.
    noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
    noYY(["a", "b", "cy"]) → ["ay", "by"]
    noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]*/
    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(str -> str + "y")
                .filter(str -> !str.contains("yy"))
                .collect(Collectors.toList());
    }

}
