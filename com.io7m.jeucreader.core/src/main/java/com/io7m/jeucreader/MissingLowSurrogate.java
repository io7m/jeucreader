/*
 * Copyright © 2017 Mark Raynsford <code@io7m.com> https://io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.io7m.jeucreader;

import java.io.IOException;

/**
 * An exception indicating that an end-of-stream was encountered before the low
 * surrogate of a surrogate pair was received.
 */

public final class MissingLowSurrogate extends IOException
{
  private static final long serialVersionUID = -546790757658151513L;

  /**
   * Construct an exception.
   *
   * @param message The message
   */

  public MissingLowSurrogate(
    final String message)
  {
    super(message);
  }
}
