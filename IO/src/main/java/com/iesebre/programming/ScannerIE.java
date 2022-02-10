package com.iesebre.programming;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Santi Sabaté 2021
 * @version 1.1 modular
 */
public class ScannerIE {

    private Scanner in;

    /**
     * Constructs a new {@code Scanner} that produces values scanned
     * from the specified input stream. Bytes from the stream are converted
     * into characters using the underlying platform's
     * {@linkplain java.nio.charset.Charset#defaultCharset() default charset}.
     *
     * @param  source An input stream to be scanned
     */
    public ScannerIE(InputStream source) {
        in = new Scanner(source);
    }

    /**
     * Constructs a new {@code Scanner} that produces values scanned
     * from the system default input stream. Bytes from the stream are converted
     * into characters using the underlying platform's
     * {@linkplain java.nio.charset.Charset#defaultCharset() default charset}.
     *
     */
    public ScannerIE() {
        in = new Scanner(System.in);
    }

    /**
     * Scans the next token of the input as an {@code int}.
     *
     * <p> An invocation of this method of the form
     * {@code nextInt()} behaves in exactly the same way as the
     * invocation {@code nextInt(radix)}, where {@code radix}
     * is the default radix of this scanner.
     *
     * @return the {@code int} scanned from the input
     * @throws java.util.InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @throws java.util.NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
    public int nextInt() {
        return Integer.parseInt(in.nextLine());
    }

    /**
     * Scans the next token of the input as a {@code byte}.
     *
     * <p> An invocation of this method of the form
     * {@code nextByte()} behaves in exactly the same way as the
     * invocation {@code nextByte(radix)}, where {@code radix}
     * is the default radix of this scanner.
     *
     * @return the {@code byte} scanned from the input
     * @throws java.util.InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @throws java.util.NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
    public byte nextByte() {
        return Byte.parseByte(in.nextLine());
    }

    /**
     * Scans the next token of the input as a {@code short}.
     *
     * <p> An invocation of this method of the form
     * {@code nextShort()} behaves in exactly the same way as the
     * invocation nextShort(int) nextShort(radix), where {@code radix}
     * is the default radix of this scanner.
     *
     * @return the {@code short} scanned from the input
     * @throws java.util.InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @throws java.util.NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
    public short nextShort() {
        return Short.parseShort(in.nextLine());
    }

    /**
     * Scans the next token of the input as a {@code long}.
     *
     * <p> An invocation of this method of the form
     * {@code nextLong()} behaves in exactly the same way as the
     * invocation {@code nextLong(radix)}, where {@code radix}
     * is the default radix of this scanner.
     *
     * @return the {@code long} scanned from the input
     * @throws java.util.InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @throws java.util.NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
    public long nextLong() {
        return Long.parseLong(in.nextLine());
    }

    /**
     * Scans the next token of the input as a {@code double}.
     * This method will throw {@code InputMismatchException}
     * if the next token cannot be translated into a valid double value.
     * If the translation is successful, the scanner advances past the input
     * that matched.
     *
     * <p> If the next token matches the <a
     * href="#Float-regex"><i>Float</i></a> regular expression defined above
     * then the token is converted into a {@code double} value as if by
     * removing all locale specific prefixes, group separators, and locale
     * specific suffixes, then mapping non-ASCII digits into ASCII
     * digits via {@link Character#digit Character.digit}, prepending a
     * negative sign (-) if the locale specific negative prefixes and suffixes
     * were present, and passing the resulting string to
     * {@link Double#parseDouble Double.parseDouble}. If the token matches
     * the localized NaN or infinity strings, then either "Nan" or "Infinity"
     * is passed to {@link Double#parseDouble(String) Double.parseDouble} as
     * appropriate.
     *
     * @return the {@code double} scanned from the input
     * @throws java.util.InputMismatchException
     *         if the next token does not match the <i>Float</i>
     *         regular expression, or is out of range
     * @throws java.util.NoSuchElementException if the input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
    public double nextDouble() {
        return Double.parseDouble(in.nextLine());
    }

    /**
     * Scans the next token of the input as a {@code float}.
     * This method will throw {@code InputMismatchException}
     * if the next token cannot be translated into a valid float value as
     * described below. If the translation is successful, the scanner advances
     * past the input that matched.
     *
     * <p> If the next token matches the <a
     * href="#Float-regex"><i>Float</i></a> regular expression defined above
     * then the token is converted into a {@code float} value as if by
     * removing all locale specific prefixes, group separators, and locale
     * specific suffixes, then mapping non-ASCII digits into ASCII
     * digits via {@link Character#digit Character.digit}, prepending a
     * negative sign (-) if the locale specific negative prefixes and suffixes
     * were present, and passing the resulting string to
     * {@link Float#parseFloat Float.parseFloat}. If the token matches
     * the localized NaN or infinity strings, then either "Nan" or "Infinity"
     * is passed to {@link Float#parseFloat(String) Float.parseFloat} as
     * appropriate.
     *
     * @return the {@code float} scanned from the input
     * @throws java.util.InputMismatchException
     *         if the next token does not match the <i>Float</i>
     *         regular expression, or is out of range
     * @throws java.util.NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
    public float nextFloat() {
        return Float.parseFloat(in.nextLine());
    }

    /**
     * Scans the next token of the input into a boolean value and returns
     * that value. This method will throw {@code InputMismatchException}
     * if the next token cannot be translated into a valid boolean value.
     * If the match is successful, the scanner advances past the input that
     * matched.
     *
     * @return the boolean scanned from the input
     * @throws java.util.InputMismatchException if the next token is not a valid boolean
     * @throws java.util.NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
    public boolean nextBoolean() {
        return Boolean.parseBoolean(in.nextLine());
    }

    /**
     * Advances this scanner past the current line and returns the input
     * that was skipped.
     *
     * This method returns the rest of the current line, excluding any line
     * separator at the end. The position is set to the beginning of the next
     * line.
     *
     * <p>Since this method continues to search through the input looking
     * for a line separator, it may buffer all of the input searching for
     * the line to skip if no line separators are present.
     *
     * @return the line that was skipped
     * @throws java.util.NoSuchElementException if no line was found
     * @throws IllegalStateException if this scanner is closed
     */
    public String nextLine() {
        return in.nextLine();
    }

    /**
     * Finds and returns the next complete token from this scanner.
     * A complete token is preceded and followed by input that matches
     * the delimiter pattern. This method may block while waiting for input
     * to scan, even if a previous invocation of hasNext returned
     * {@code true}.
     *
     * @return the next token
     * @throws java.util.NoSuchElementException if no more tokens are available
     * @throws IllegalStateException if this scanner is closed
     * @see java.util.Iterator
     */
    public String next() {
        return in.next();
    }

    /**
     * Generic method that finds and returns the next complete token from this scanner.
     * A complete token is preceded and followed by input that matches
     * the delimiter pattern. This method may block while waiting for input
     * to scan, even if a previous invocation of hasNext returned
     * {@code true}.
     * @param <T> The type of the token supposed to be read. Can be any class that extends
     *           java.lang.Number, Boolean or String. In case of Boolean only "true" and
     *           "false" constants are allowed.
     * @return the value read by the scanner cast to type T
     */
    public <T> T nextValue() {
        T resultat = null;
        String numero = in.nextLine();
        try {
            resultat = (T) Integer.valueOf(numero);
        } catch (NumberFormatException | NullPointerException e1) {
            try {
                resultat = (T) Double.valueOf(numero);
            } catch (NumberFormatException | NullPointerException e2) {
                try {
                    resultat = (T) Long.valueOf(numero);
                } catch (NumberFormatException | NullPointerException e3) {
                    try {
                        resultat = (T) Float.valueOf(numero);
                    } catch (NumberFormatException | NullPointerException e4) {
                        try {
                            resultat = (T) Byte.valueOf(numero);
                        } catch (NumberFormatException | NullPointerException e5) {
                            try {
                                resultat = (T) Short.valueOf(numero);
                            } catch (NumberFormatException | NullPointerException e6) {
                                try {
                                    boolean cert = Boolean.valueOf(numero);
                                    //Als booleans el valueOf dóna false per qualsevol text diferent de true, per tant
                                    //en cas de false comprovo que l'usuari havia escrit false i no un altre text.
                                    //En este últim cas retornem el text escrit forçant a anar a l'últim catch
                                    if (!cert && !numero.equalsIgnoreCase("false"))
                                        throw new ClassCastException();
                                    resultat = (T) Boolean.valueOf(numero);
                                } catch (ClassCastException | NumberFormatException | NullPointerException e7) {
                                    resultat = (T) numero;
                                }
                            }
                        }
                    }
                }
            }
        }
        return resultat;
    }

    /**
     * Closes this scanner.
     *
     * <p> If this scanner has not yet been closed then if its underlying
     * {@linkplain java.lang.Readable readable} also implements the {@link
     * java.io.Closeable} interface then the readable's {@code close} method
     * will be invoked.  If this scanner is already closed then invoking this
     * method will have no effect.
     *
     * <p>Attempting to perform search operations after a scanner has
     * been closed will result in an {@link IllegalStateException}.
     *
     */
    public void close() {
        in.close();
    }
}


