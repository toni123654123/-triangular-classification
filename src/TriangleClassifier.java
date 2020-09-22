public class TriangleClassifier {
        public static String TriangleClassifier1(int sidea, int sideb, int sidec) {
        if (sidea == sideb && sidea == sidec && sideb == sidec) {
            return "Tam giác đều";
        } else if (sidea == sideb && sidea + sideb > sidec ||
                sidea == sidec && sidea + sidec > sideb ||
                sidec == sideb && sidec + sideb > sidea) {
            return "Tam giác cân";
        } else if (sidea < sideb + sidec) {
            return "Tam giác thường";
        } else if (sidea > sideb + sidec || sideb > sidea + sidec || sidec > sidea + sideb) {
            return "Không phải là tam giác";
        }
        return null;
    }

}
