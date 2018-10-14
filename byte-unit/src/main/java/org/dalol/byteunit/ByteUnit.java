package org.dalol.byteunit;

/**
 * @author Filippo
 * @version 1.0.0
 * @since Sun, 14/10/2018 at 19:28.
 */
public enum ByteUnit {

//    BITS("b")

    BYTES("B") {
        @Override
        public double convert(double value, ByteUnit unit) {
            return unit.toBytes(value);
        }

        @Override
        public Double toBytes(double value) {
            return value * 1.0f;
        }

        @Override
        public Double toKiloBytes(double value) {
            return value * 1.0f / KB;
        }

        @Override
        public Double toMegaBytes(double value) {
            return value * 1.0f / MB;
        }

        @Override
        public Double toGigaBytes(double value) {
            return value * 1.0f / GB;
        }

        @Override
        public Double toTeraBytes(double value) {
            return value * 1.0f / TB;
        }

        @Override
        public Double toPetaBytes(double value) {
            return value * 1.0f / PB;
        }

        @Override
        public Double toExaBytes(double value) {
            return value * 1.0f / EB;
        }

        @Override
        public Double toZettaBytes(double value) {
            return value * 1.0f / ZB;
        }

        @Override
        public Double toYottaBytes(double value) {
            return value * 1.0f / YB;
        }
    },
    KILOBYTES("KB") {
        @Override
        public double convert(double value, ByteUnit unit) {
            return unit.toKiloBytes(value);
        }

        @Override
        public Double toBytes(double value) {
            return value * KB;
        }

        @Override
        public Double toKiloBytes(double value) {
            return value * 1.0f;
        }

        @Override
        public Double toMegaBytes(double value) {
            return value * 1.0f / (MB / KB);
        }

        @Override
        public Double toGigaBytes(double value) {
            return value * 1.0f / (GB / KB);
        }

        @Override
        public Double toTeraBytes(double value) {
            return value * 1.0f / (TB / KB);
        }

        @Override
        public Double toPetaBytes(double value) {
            return value * 1.0f / (PB / KB);
        }

        @Override
        public Double toExaBytes(double value) {
            return value * 1.0f / (EB / KB);
        }

        @Override
        public Double toZettaBytes(double value) {
            return value * 1.0f / (ZB / KB);
        }

        @Override
        public Double toYottaBytes(double value) {
            return value * 1.0f / (YB / KB);
        }
    },
    MEGABYTES("MB") {
        @Override
        public double convert(double value, ByteUnit unit) {
            return unit.toMegaBytes(value);
        }

        @Override
        public Double toBytes(double value) {
            return value * MB;
        }

        @Override
        public Double toKiloBytes(double value) {
            return value * KB;
        }

        @Override
        public Double toMegaBytes(double value) {
            return value * 1.0f;
        }

        @Override
        public Double toGigaBytes(double value) {
            return value * 1.0f / (GB / MB);
        }

        @Override
        public Double toTeraBytes(double value) {
            return value * 1.0f / (TB / MB);
        }

        @Override
        public Double toPetaBytes(double value) {
            return value * 1.0f / (TB / MB);
        }

        @Override
        public Double toExaBytes(double value) {
            return value * 1.0f / (EB / MB);
        }

        @Override
        public Double toZettaBytes(double value) {
            return value * 1.0f / (ZB / MB);
        }

        @Override
        public Double toYottaBytes(double value) {
            return value * 1.0f / (YB / MB);
        }
    },
    GIGABYTES("GB") {
        @Override
        public double convert(double value, ByteUnit unit) {
            return unit.toGigaBytes(value);
        }

        @Override
        public Double toBytes(double value) {
            return value * GB;
        }

        @Override
        public Double toKiloBytes(double value) {
            return value * MB;
        }

        @Override
        public Double toMegaBytes(double value) {
            return value * KB;
        }

        @Override
        public Double toGigaBytes(double value) {
            return value * B;
        }

        @Override
        public Double toTeraBytes(double value) {
            return value * 1.0f / (TB / GB);
        }

        @Override
        public Double toPetaBytes(double value) {
            return value * 1.0f / (PB / GB);
        }

        @Override
        public Double toExaBytes(double value) {
            return value * 1.0f / (EB / GB);
        }

        @Override
        public Double toZettaBytes(double value) {
            return value * 1.0f / (ZB / GB);
        }

        @Override
        public Double toYottaBytes(double value) {
            return value * 1.0f / (YB / GB);
        }
    },
    TERABYTES("TB") {
        @Override
        public double convert(double value, ByteUnit unit) {
            return unit.toTeraBytes(value);
        }

        @Override
        public Double toBytes(double value) {
            return value * TB;
        }

        @Override
        public Double toKiloBytes(double value) {
            return value * GB;
        }

        @Override
        public Double toMegaBytes(double value) {
            return value * MB;
        }

        @Override
        public Double toGigaBytes(double value) {
            return value * KB;
        }

        @Override
        public Double toTeraBytes(double value) {
            return value * B;
        }

        @Override
        public Double toPetaBytes(double value) {
            return value * 1.0f / (PB / TB);
        }

        @Override
        public Double toExaBytes(double value) {
            return value * 1.0f / (EB / TB);
        }

        @Override
        public Double toZettaBytes(double value) {
            return value * 1.0f / (ZB / TB);
        }

        @Override
        public Double toYottaBytes(double value) {
            return value * 1.0f / (YB / TB);
        }
    },
    PETABYTES("PB") {
        @Override
        public double convert(double value, ByteUnit unit) {
            return unit.toPetaBytes(value);
        }

        @Override
        public Double toBytes(double value) {
            return value * PB;
        }

        @Override
        public Double toKiloBytes(double value) {
            return value * TB;
        }

        @Override
        public Double toMegaBytes(double value) {
            return value * GB;
        }

        @Override
        public Double toGigaBytes(double value) {
            return value * MB;
        }

        @Override
        public Double toTeraBytes(double value) {
            return value * KB;
        }

        @Override
        public Double toPetaBytes(double value) {
            return value * B;
        }

        @Override
        public Double toExaBytes(double value) {
            return value * 1.0f / (EB / PB);
        }

        @Override
        public Double toZettaBytes(double value) {
            return value * 1.0f / (ZB / PB);
        }

        @Override
        public Double toYottaBytes(double value) {
            return value * 1.0f / (YB / PB);
        }
    },
    EXABYTE("EB") {
        @Override
        public double convert(double value, ByteUnit unit) {
            return unit.toExaBytes(value);
        }

        @Override
        public Double toBytes(double value) {
            return value * EB;
        }

        @Override
        public Double toKiloBytes(double value) {
            return value * PB;
        }

        @Override
        public Double toMegaBytes(double value) {
            return value * TB;
        }

        @Override
        public Double toGigaBytes(double value) {
            return value * GB;
        }

        @Override
        public Double toTeraBytes(double value) {
            return value * MB;
        }

        @Override
        public Double toPetaBytes(double value) {
            return value * KB;
        }

        @Override
        public Double toExaBytes(double value) {
            return value * B;
        }

        @Override
        public Double toZettaBytes(double value) {
            return value * 1.0f / (ZB / EB);
        }

        @Override
        public Double toYottaBytes(double value) {
            return value * 1.0f / (YB / EB);
        }
    },
    ZETTABYTES("ZB") {
        @Override
        public double convert(double value, ByteUnit unit) {
            return unit.toZettaBytes(value);
        }

        @Override
        public Double toBytes(double value) {
            return value * ZB;
        }

        @Override
        public Double toKiloBytes(double value) {
            return value * EB;
        }

        @Override
        public Double toMegaBytes(double value) {
            return value * PB;
        }

        @Override
        public Double toGigaBytes(double value) {
            return value * TB;
        }

        @Override
        public Double toTeraBytes(double value) {
            return value * GB;
        }

        @Override
        public Double toPetaBytes(double value) {
            return value * MB;
        }

        @Override
        public Double toExaBytes(double value) {
            return value * KB;
        }

        @Override
        public Double toZettaBytes(double value) {
            return value * B;
        }

        @Override
        public Double toYottaBytes(double value) {
            return value * 1.0f / (YB / ZB);
        }
    },
    YOTTABYTE("YB") {
        @Override
        public double convert(double value, ByteUnit unit) {
            return unit.toYottaBytes(value);
        }

        @Override
        public Double toBytes(double value) {
            return value * YB;
        }

        @Override
        public Double toKiloBytes(double value) {
            return value * ZB;
        }

        @Override
        public Double toMegaBytes(double value) {
            return value * EB;
        }

        @Override
        public Double toGigaBytes(double value) {
            return value * PB;
        }

        @Override
        public Double toTeraBytes(double value) {
            return value * TB;
        }

        @Override
        public Double toPetaBytes(double value) {
            return value * GB;
        }

        @Override
        public Double toExaBytes(double value) {
            return value * MB;
        }

        @Override
        public Double toZettaBytes(double value) {
            return value * KB;
        }

        @Override
        public Double toYottaBytes(double value) {
            return value * B;
        }
    };

    private static final double b = 1 / 8L;
    private static final double B = 1L;
    private static final double KB = B * 1024L;
    private static final double MB = KB * 1024L;
    private static final double GB = MB * 1024L;
    private static final double TB = GB * 1024L;
    private static final double PB = TB * 1024L;
    private static final double EB = PB * 1024L;
    private static final double ZB = EB * 1024L;
    private static final double YB = ZB * 1024L;

    private final String mAbbreviation;

    ByteUnit(String abbreviation) {
        mAbbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return mAbbreviation;
    }

    public abstract double convert(double value, ByteUnit unit);

//    public abstract double toBits(double value);

    public abstract Double toBytes(double value);

    public abstract Double toKiloBytes(double value);

    public abstract Double toMegaBytes(double value);

    public abstract Double toGigaBytes(double value);

    public abstract Double toTeraBytes(double value);

    public abstract Double toPetaBytes(double value);

    public abstract Double toExaBytes(double value);

    public abstract Double toZettaBytes(double value);

    public abstract Double toYottaBytes(double value);

    public class ByteUnitValue {

        public long decimalValue;  //ex 1MB = 1000KB
        public double binaryValue; //ex 1MB = 1024KB
        public String formattedValue;
    }
}
