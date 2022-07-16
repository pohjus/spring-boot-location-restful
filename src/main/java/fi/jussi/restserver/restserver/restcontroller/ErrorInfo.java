package fi.jussi.restserver.restserver.restcontroller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Helper POJO for generating error messages.
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorInfo {
    private String errorMsg;
}


