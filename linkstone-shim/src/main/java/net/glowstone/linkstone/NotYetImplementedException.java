package net.glowstone.linkstone;

/**
 * An exception thrown by methods that exist but do not yet contain logic.
 */
public class NotYetImplementedException extends RuntimeException {
    public NotYetImplementedException() {}

    public NotYetImplementedException(String message) {
        super(message);
    }

    public NotYetImplementedException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotYetImplementedException(Throwable cause) {
        super(cause);
    }
}
