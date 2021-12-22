import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CatStatus {
    ALIVE("Жива"),
    DEAD("Мертва"),
    EXPLODED("Взорвалась"),
    SLEEP("Спит");

    private final String localisation;

  /*  CatStatus(String localisation){
        this.localisation = localisation;

    }
*/

}
