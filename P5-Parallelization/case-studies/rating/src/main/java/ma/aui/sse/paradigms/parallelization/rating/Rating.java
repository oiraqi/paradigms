package ma.aui.sse.paradigms.parallelization.rating;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    private String productId;
    private int stars;
    
}
