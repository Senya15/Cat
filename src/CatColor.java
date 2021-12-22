import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CatColor {
    BLACK("Чёрная"),
    WHITE("Белая"),
    GREY("Серая"),
    RED("Рыжая");

    private final String localisation;
}
