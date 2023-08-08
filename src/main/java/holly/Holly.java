package holly;

import java.util.stream.Stream;

public class Holly {
    public static String stroong = "{\n" +
            "  \"$schema\": \"https://raw.githubusercontent.com/schemastore/schemastore/master/src/schemas/json/sarif-2.1.0-rtm.5.json\",\n" +
            "  \"version\": \"2.1.0\",\n" +
            "  \"runs\": [\n" +
            "    {\n" +
            "      \"tool\": {\n" +
            "        \"driver\": {\n" +
            "          \"name\": \"QDJVM\",\n" +
            "          \"fullName\": \"Qodana for JVM\",\n" +
            "          \"version\": \"232.9147.67\",\n" +
            "          \"rules\": [],\n" +
            "          \"taxa\": [\n" +
            "            {\n" +
            "              \"id\": \"Language injection\",\n" +
            "              \"name\": \"Language injection\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Kotlin\",\n" +
            "              \"name\": \"Kotlin\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Kotlin/Style issues\",\n" +
            "              \"name\": \"Style issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Kotlin\",\n" +
            "                    \"index\": 1,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JVM languages\",\n" +
            "              \"name\": \"JVM languages\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Kotlin/Redundant constructs\",\n" +
            "              \"name\": \"Redundant constructs\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Kotlin\",\n" +
            "                    \"index\": 1,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java\",\n" +
            "              \"name\": \"Java\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Internationalization\",\n" +
            "              \"name\": \"Internationalization\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Performance\",\n" +
            "              \"name\": \"Performance\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Spring\",\n" +
            "              \"name\": \"Spring\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Spring/Spring Core\",\n" +
            "              \"name\": \"Spring Core\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Spring\",\n" +
            "                    \"index\": 8,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Spring/Spring Core/XML\",\n" +
            "              \"name\": \"XML\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Spring/Spring Core\",\n" +
            "                    \"index\": 9,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Code style issues\",\n" +
            "              \"name\": \"Code style issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Declaration redundancy\",\n" +
            "              \"name\": \"Declaration redundancy\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Error handling\",\n" +
            "              \"name\": \"Error handling\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Spring/Spring Core/Code\",\n" +
            "              \"name\": \"Code\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Spring/Spring Core\",\n" +
            "                    \"index\": 9,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Kotlin/Migration\",\n" +
            "              \"name\": \"Migration\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Kotlin\",\n" +
            "                    \"index\": 1,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Probable bugs\",\n" +
            "              \"name\": \"Probable bugs\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Spring/Spring Cloud\",\n" +
            "              \"name\": \"Spring Cloud\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Spring\",\n" +
            "                    \"index\": 8,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript\",\n" +
            "              \"name\": \"JavaScript and TypeScript\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Unit testing\",\n" +
            "              \"name\": \"Unit testing\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Class structure\",\n" +
            "              \"name\": \"Class structure\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Serialization issues\",\n" +
            "              \"name\": \"Serialization issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy\",\n" +
            "              \"name\": \"Groovy\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy/GPath\",\n" +
            "              \"name\": \"GPath\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Groovy\",\n" +
            "                    \"index\": 22,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Imports\",\n" +
            "              \"name\": \"Imports\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JSON and JSON5\",\n" +
            "              \"name\": \"JSON and JSON5\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Maven\",\n" +
            "              \"name\": \"Maven\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"MySQL\",\n" +
            "              \"name\": \"MySQL\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Kotlin/Probable bugs\",\n" +
            "              \"name\": \"Probable bugs\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Kotlin\",\n" +
            "                    \"index\": 1,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Threading issues\",\n" +
            "              \"name\": \"Threading issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Control flow issues\",\n" +
            "              \"name\": \"Control flow issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Numeric issues\",\n" +
            "              \"name\": \"Numeric issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JPA\",\n" +
            "              \"name\": \"JPA\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Initialization\",\n" +
            "              \"name\": \"Initialization\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Sass/SCSS\",\n" +
            "              \"name\": \"Sass/SCSS\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"HTML\",\n" +
            "              \"name\": \"HTML\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Unused symbols\",\n" +
            "              \"name\": \"Unused symbols\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Flow type checker\",\n" +
            "              \"name\": \"Flow type checker\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Security\",\n" +
            "              \"name\": \"Security\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Properties files\",\n" +
            "              \"name\": \"Properties files\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"PostCSS\",\n" +
            "              \"name\": \"PostCSS\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Bitwise operation issues\",\n" +
            "              \"name\": \"Bitwise operation issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy/Naming conventions\",\n" +
            "              \"name\": \"Naming conventions\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Groovy\",\n" +
            "                    \"index\": 22,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/General\",\n" +
            "              \"name\": \"General\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Reactive Streams\",\n" +
            "              \"name\": \"Reactive Streams\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Reactive Streams/Common\",\n" +
            "              \"name\": \"Common\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Reactive Streams\",\n" +
            "                    \"index\": 44,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Packaging issues\",\n" +
            "              \"name\": \"Packaging issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Verbose or redundant code constructs\",\n" +
            "              \"name\": \"Verbose or redundant code constructs\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Gradle\",\n" +
            "              \"name\": \"Gradle\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Gradle/Probable bugs\",\n" +
            "              \"name\": \"Probable bugs\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Gradle\",\n" +
            "                    \"index\": 48,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"General\",\n" +
            "              \"name\": \"General\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"FreeMarker\",\n" +
            "              \"name\": \"FreeMarker\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JVM languages/Logging\",\n" +
            "              \"name\": \"Logging\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JVM languages\",\n" +
            "                    \"index\": 3,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"EditorConfig\",\n" +
            "              \"name\": \"EditorConfig\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Validity issues\",\n" +
            "              \"name\": \"Validity issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Gradle/Validity issues\",\n" +
            "              \"name\": \"Validity issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Gradle\",\n" +
            "                    \"index\": 48,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Code maturity\",\n" +
            "              \"name\": \"Code maturity\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Potentially confusing code constructs\",\n" +
            "              \"name\": \"Potentially confusing code constructs\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"SQL\",\n" +
            "              \"name\": \"SQL\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Spring/Spring Data\",\n" +
            "              \"name\": \"Spring Data\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Spring\",\n" +
            "                    \"index\": 8,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Kotlin/Other problems\",\n" +
            "              \"name\": \"Other problems\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Kotlin\",\n" +
            "                    \"index\": 1,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy/Probable bugs\",\n" +
            "              \"name\": \"Probable bugs\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Groovy\",\n" +
            "                    \"index\": 22,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Try statement issues\",\n" +
            "              \"name\": \"Try statement issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Plugin DevKit\",\n" +
            "              \"name\": \"Plugin DevKit\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Plugin DevKit/Workspace model\",\n" +
            "              \"name\": \"Workspace model\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Plugin DevKit\",\n" +
            "                    \"index\": 63,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Data flow\",\n" +
            "              \"name\": \"Data flow\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"CDI (Contexts and Dependency Injection)\",\n" +
            "              \"name\": \"CDI (Contexts and Dependency Injection)\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Velocity\",\n" +
            "              \"name\": \"Velocity\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Plugin DevKit/Code\",\n" +
            "              \"name\": \"Code\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Plugin DevKit\",\n" +
            "                    \"index\": 63,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Java language level migration aids\",\n" +
            "              \"name\": \"Java language level migration aids\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Java language level migration aids/Java 20\",\n" +
            "              \"name\": \"Java 20\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Java language level migration aids\",\n" +
            "                    \"index\": 69,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Kotlin/Naming conventions\",\n" +
            "              \"name\": \"Naming conventions\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Kotlin\",\n" +
            "                    \"index\": 1,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"CSS\",\n" +
            "              \"name\": \"CSS\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"CSS/Invalid elements\",\n" +
            "              \"name\": \"Invalid elements\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"CSS\",\n" +
            "                    \"index\": 72,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Potentially undesirable code constructs\",\n" +
            "              \"name\": \"Potentially undesirable code constructs\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Finalization\",\n" +
            "              \"name\": \"Finalization\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Logging\",\n" +
            "              \"name\": \"Logging\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Modularization issues\",\n" +
            "              \"name\": \"Modularization issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Javadoc\",\n" +
            "              \"name\": \"Javadoc\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Kotlin/Java interop issues\",\n" +
            "              \"name\": \"Java interop issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Kotlin\",\n" +
            "                    \"index\": 1,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Naming conventions\",\n" +
            "              \"name\": \"Naming conventions\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Naming conventions/Class\",\n" +
            "              \"name\": \"Class\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Naming conventions\",\n" +
            "                    \"index\": 80,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Hibernate\",\n" +
            "              \"name\": \"Hibernate\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Spring/Spring Integration\",\n" +
            "              \"name\": \"Spring Integration\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Spring\",\n" +
            "                    \"index\": 8,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Plugin DevKit/Plugin descriptor\",\n" +
            "              \"name\": \"Plugin descriptor\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Plugin DevKit\",\n" +
            "                    \"index\": 63,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Abstraction issues\",\n" +
            "              \"name\": \"Abstraction issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Assignment issues\",\n" +
            "              \"name\": \"Assignment issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Java language level migration aids/Java 9\",\n" +
            "              \"name\": \"Java 9\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Java language level migration aids\",\n" +
            "                    \"index\": 69,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy/Threading issues\",\n" +
            "              \"name\": \"Threading issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Groovy\",\n" +
            "                    \"index\": 22,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy/Control flow issues\",\n" +
            "              \"name\": \"Control flow issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Groovy\",\n" +
            "                    \"index\": 22,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/JUnit\",\n" +
            "              \"name\": \"JUnit\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"XSLT\",\n" +
            "              \"name\": \"XSLT\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy/Style\",\n" +
            "              \"name\": \"Style\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Groovy\",\n" +
            "                    \"index\": 22,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java EE\",\n" +
            "              \"name\": \"Java EE\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Portability\",\n" +
            "              \"name\": \"Portability\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/TestNG\",\n" +
            "              \"name\": \"TestNG\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Assignment issues\",\n" +
            "              \"name\": \"Assignment issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JSP\",\n" +
            "              \"name\": \"JSP\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Visibility\",\n" +
            "              \"name\": \"Visibility\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"RegExp\",\n" +
            "              \"name\": \"RegExp\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Concurrency annotation issues\",\n" +
            "              \"name\": \"Concurrency annotation issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"CSS/Probable bugs\",\n" +
            "              \"name\": \"Probable bugs\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"CSS\",\n" +
            "                    \"index\": 72,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/TypeScript\",\n" +
            "              \"name\": \"TypeScript\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Lombok\",\n" +
            "              \"name\": \"Lombok\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Lombok/Redundant modifiers\",\n" +
            "              \"name\": \"Redundant modifiers\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Lombok\",\n" +
            "                    \"index\": 103,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"UI form\",\n" +
            "              \"name\": \"UI form\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/ES2015 migration aids\",\n" +
            "              \"name\": \"ES2015 migration aids\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Naming conventions/Method\",\n" +
            "              \"name\": \"Method\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Naming conventions\",\n" +
            "                    \"index\": 80,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/DOM issues\",\n" +
            "              \"name\": \"DOM issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Probable bugs\",\n" +
            "              \"name\": \"Probable bugs\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Code Coverage\",\n" +
            "              \"name\": \"Code Coverage\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy/Annotations\",\n" +
            "              \"name\": \"Annotations\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Groovy\",\n" +
            "                    \"index\": 22,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Proofreading\",\n" +
            "              \"name\": \"Proofreading\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"XML\",\n" +
            "              \"name\": \"XML\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Cloning issues\",\n" +
            "              \"name\": \"Cloning issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Manifest\",\n" +
            "              \"name\": \"Manifest\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy/Potentially confusing code constructs\",\n" +
            "              \"name\": \"Potentially confusing code constructs\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Groovy\",\n" +
            "                    \"index\": 22,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Ant\",\n" +
            "              \"name\": \"Ant\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy/Error handling\",\n" +
            "              \"name\": \"Error handling\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Groovy\",\n" +
            "                    \"index\": 22,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Java language level migration aids/Java 5\",\n" +
            "              \"name\": \"Java 5\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Java language level migration aids\",\n" +
            "                    \"index\": 69,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Java language level migration aids/Java 8\",\n" +
            "              \"name\": \"Java 8\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Java language level migration aids\",\n" +
            "                    \"index\": 69,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy/Assignment issues\",\n" +
            "              \"name\": \"Assignment issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Groovy\",\n" +
            "                    \"index\": 22,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Class metrics\",\n" +
            "              \"name\": \"Class metrics\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"RESTful Web Service (JAX-RS)\",\n" +
            "              \"name\": \"RESTful Web Service (JAX-RS)\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Encapsulation\",\n" +
            "              \"name\": \"Encapsulation\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JVM languages/Test frameworks\",\n" +
            "              \"name\": \"Test frameworks\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JVM languages\",\n" +
            "                    \"index\": 3,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Control flow issues\",\n" +
            "              \"name\": \"Control flow issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Test frameworks\",\n" +
            "              \"name\": \"Test frameworks\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Reflective access\",\n" +
            "              \"name\": \"Reflective access\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Java language level migration aids/Java 15\",\n" +
            "              \"name\": \"Java 15\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Java language level migration aids\",\n" +
            "                    \"index\": 69,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Code quality tools\",\n" +
            "              \"name\": \"Code quality tools\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Spring/Spring AOP\",\n" +
            "              \"name\": \"Spring AOP\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Spring\",\n" +
            "                    \"index\": 8,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Method metrics\",\n" +
            "              \"name\": \"Method metrics\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Resource management\",\n" +
            "              \"name\": \"Resource management\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Switch statement issues\",\n" +
            "              \"name\": \"Switch statement issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Java language level migration aids/Java 14\",\n" +
            "              \"name\": \"Java 14\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Java language level migration aids\",\n" +
            "                    \"index\": 69,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Numeric issues/Cast\",\n" +
            "              \"name\": \"Cast\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Numeric issues\",\n" +
            "                    \"index\": 31,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Plugin DevKit/Description file\",\n" +
            "              \"name\": \"Description file\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Plugin DevKit\",\n" +
            "                    \"index\": 63,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/JavaBeans issues\",\n" +
            "              \"name\": \"JavaBeans issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Pattern validation\",\n" +
            "              \"name\": \"Pattern validation\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Function metrics\",\n" +
            "              \"name\": \"Function metrics\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Code style issues\",\n" +
            "              \"name\": \"Code style issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Dependency issues\",\n" +
            "              \"name\": \"Dependency issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Java language level issues\",\n" +
            "              \"name\": \"Java language level issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"HTML/Accessibility\",\n" +
            "              \"name\": \"Accessibility\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"HTML\",\n" +
            "                    \"index\": 35,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy/Method metrics\",\n" +
            "              \"name\": \"Method metrics\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Groovy\",\n" +
            "                    \"index\": 22,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"XPath\",\n" +
            "              \"name\": \"XPath\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Inheritance issues\",\n" +
            "              \"name\": \"Inheritance issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Security\",\n" +
            "              \"name\": \"Security\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"AOP\",\n" +
            "              \"name\": \"AOP\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Bean Validation\",\n" +
            "              \"name\": \"Bean Validation\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Reactive Streams/Reactor\",\n" +
            "              \"name\": \"Reactor\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Reactive Streams\",\n" +
            "                    \"index\": 44,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Oracle\",\n" +
            "              \"name\": \"Oracle\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Kotlin/Migration/Maven\",\n" +
            "              \"name\": \"Maven\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Kotlin/Migration\",\n" +
            "                    \"index\": 15,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Internationalization\",\n" +
            "              \"name\": \"Internationalization\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Vue\",\n" +
            "              \"name\": \"Vue\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Java language level migration aids/Java 10\",\n" +
            "              \"name\": \"Java 10\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Java language level migration aids\",\n" +
            "                    \"index\": 69,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Java language level migration aids/Java 7\",\n" +
            "              \"name\": \"Java 7\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Java language level migration aids\",\n" +
            "                    \"index\": 69,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Compiler issues\",\n" +
            "              \"name\": \"Compiler issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Version control\",\n" +
            "              \"name\": \"Version control\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"MongoJS\",\n" +
            "              \"name\": \"MongoJS\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Kotlin/Migration/Gradle\",\n" +
            "              \"name\": \"Gradle\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Kotlin/Migration\",\n" +
            "                    \"index\": 15,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Memory\",\n" +
            "              \"name\": \"Memory\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Structural search\",\n" +
            "              \"name\": \"Structural search\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Spring/Spring Security\",\n" +
            "              \"name\": \"Spring Security\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Spring\",\n" +
            "                    \"index\": 8,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"YAML\",\n" +
            "              \"name\": \"YAML\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Performance/Embedded\",\n" +
            "              \"name\": \"Embedded\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Performance\",\n" +
            "                    \"index\": 7,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Imports and dependencies\",\n" +
            "              \"name\": \"Imports and dependencies\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Probable bugs/Nullability problems\",\n" +
            "              \"name\": \"Nullability problems\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Probable bugs\",\n" +
            "                    \"index\": 16,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Spring/Spring Boot\",\n" +
            "              \"name\": \"Spring Boot\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Spring\",\n" +
            "                    \"index\": 8,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"RELAX NG\",\n" +
            "              \"name\": \"RELAX NG\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Spring/Spring Core/Setup\",\n" +
            "              \"name\": \"Setup\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Spring/Spring Core\",\n" +
            "                    \"index\": 9,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Properties files\",\n" +
            "              \"name\": \"Properties files\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Spring/Spring Cloud Stream\",\n" +
            "              \"name\": \"Spring Cloud Stream\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Spring\",\n" +
            "                    \"index\": 8,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Java language level migration aids/Java 11\",\n" +
            "              \"name\": \"Java 11\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Java language level migration aids\",\n" +
            "                    \"index\": 69,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"PostgreSQL\",\n" +
            "              \"name\": \"PostgreSQL\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"SQL server\",\n" +
            "              \"name\": \"SQL server\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy/Data flow\",\n" +
            "              \"name\": \"Data flow\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Groovy\",\n" +
            "                    \"index\": 22,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Async code and promises\",\n" +
            "              \"name\": \"Async code and promises\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Naming conventions\",\n" +
            "              \"name\": \"Naming conventions\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Qodana\",\n" +
            "              \"name\": \"Qodana\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Dependency analysis\",\n" +
            "              \"name\": \"Dependency analysis\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"EL\",\n" +
            "              \"name\": \"EL\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Java language level migration aids/Java 16\",\n" +
            "              \"name\": \"Java 16\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Java language level migration aids\",\n" +
            "                    \"index\": 69,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Shell script\",\n" +
            "              \"name\": \"Shell script\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Data flow\",\n" +
            "              \"name\": \"Data flow\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/React\",\n" +
            "              \"name\": \"React\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Lombok/Redundant definitions\",\n" +
            "              \"name\": \"Redundant definitions\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Lombok\",\n" +
            "                    \"index\": 103,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Spring/Spring MVC\",\n" +
            "              \"name\": \"Spring MVC\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Spring\",\n" +
            "                    \"index\": 8,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"CSS/Code style issues\",\n" +
            "              \"name\": \"Code style issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"CSS\",\n" +
            "                    \"index\": 72,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Java language level migration aids/Java 19\",\n" +
            "              \"name\": \"Java 19\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java/Java language level migration aids\",\n" +
            "                    \"index\": 69,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Less\",\n" +
            "              \"name\": \"Less\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy/Other\",\n" +
            "              \"name\": \"Other\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Groovy\",\n" +
            "                    \"index\": 22,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Reactive Streams/Mutiny\",\n" +
            "              \"name\": \"Mutiny\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Reactive Streams\",\n" +
            "                    \"index\": 44,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/Bitwise operation issues\",\n" +
            "              \"name\": \"Bitwise operation issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy/Validity issues\",\n" +
            "              \"name\": \"Validity issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Groovy\",\n" +
            "                    \"index\": 22,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Kotlin/Logging\",\n" +
            "              \"name\": \"Logging\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Kotlin\",\n" +
            "                    \"index\": 1,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"JavaScript and TypeScript/Node.js\",\n" +
            "              \"name\": \"Node.js\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"JavaScript and TypeScript\",\n" +
            "                    \"index\": 18,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Java/toString() issues\",\n" +
            "              \"name\": \"toString() issues\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Java\",\n" +
            "                    \"index\": 5,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"CSS/Code quality tools\",\n" +
            "              \"name\": \"Code quality tools\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"CSS\",\n" +
            "                    \"index\": 72,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Kotlin/React\",\n" +
            "              \"name\": \"React\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Kotlin\",\n" +
            "                    \"index\": 1,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Kotlin/React/Probable bugs\",\n" +
            "              \"name\": \"Probable bugs\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Kotlin/React\",\n" +
            "                    \"index\": 200,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Gradle/Best practises\",\n" +
            "              \"name\": \"Best practises\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Gradle\",\n" +
            "                    \"index\": 48,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"id\": \"Groovy/Declaration redundancy\",\n" +
            "              \"name\": \"Declaration redundancy\",\n" +
            "              \"relationships\": [\n" +
            "                {\n" +
            "                  \"target\": {\n" +
            "                    \"id\": \"Groovy\",\n" +
            "                    \"index\": 22,\n" +
            "                    \"toolComponent\": {\n" +
            "                      \"name\": \"QDJVM\"\n" +
            "                    }\n" +
            "                  },\n" +
            "                  \"kinds\": [\n" +
            "                    \"superset\"\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ],\n" +
            "          \"language\": \"en-US\",\n" +
            "          \"contents\": [\n" +
            "            \"localizedData\",\n" +
            "            \"nonLocalizedData\"\n" +
            "          ],\n" +
            "          \"isComprehensive\": false\n" +
            "        },\n" +
            "        \"extensions\": [\n" +
            "          {\n" +
            "            \"name\": \"org.intellij.intelliLang\",\n" +
            "            \"version\": \"232.9147\",\n" +
            "            \"rules\": [\n" +
            "              {\n" +
            "                \"id\": \"InjectionNotApplicable\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Injection Annotation not applicable\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports when a '@Language' annotation is applied to an element with a type other than 'String' or 'String[]'. Example: '@Language(\\\"HTML\\\") int i;' After the quick-fix is applied: 'int i;'\",\n" +
            "                  \"markdown\": \"Reports when a `@Language` annotation is applied to an element with a type other than `String` or `String[]`.\\n\\n**Example:**\\n\\n\\n      @Language(\\\"HTML\\\") int i;\\n\\nAfter the quick-fix is applied:\\n\\n\\n      int i;\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"InjectionNotApplicable\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Language injection\",\n" +
            "                      \"index\": 0,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"PatternOverriddenByNonAnnotatedMethod\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Non-annotated Method overrides @Pattern Method\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports when a method without any '@Pattern' annotation overrides a '@Pattern' annotated method. This does not prevent error-highlighting inside the editor, however the overriding method will not be checked at runtime. A quick fix is provided to add a '@Pattern' annotation that matches the one from the superclass method. This ensures the runtime-check instrumentation works correctly. Example: 'abstract class Parent {\\n    abstract @Pattern(\\\"\\\\\\\\d\\\\\\\\d-\\\\\\\\d\\\\\\\\d\\\\\\\\d\\\") String getId();\\n  }\\n  class Child extends Parent {\\n    @Override String getId() { // warning here\\n      return \\\"12-345\\\";\\n    }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports when a method without any `@Pattern` annotation overrides a `@Pattern` annotated method. This does not prevent error-highlighting inside the editor, however the overriding method will not be checked at runtime.\\n\\n\\nA quick fix is provided to add a `@Pattern` annotation that matches the one from the superclass method. This ensures the\\nruntime-check instrumentation works correctly.\\n\\n**Example:**\\n\\n\\n      abstract class Parent {\\n        abstract @Pattern(\\\"\\\\\\\\d\\\\\\\\d-\\\\\\\\d\\\\\\\\d\\\\\\\\d\\\") String getId();\\n      }\\n      class Child extends Parent {\\n        @Override String getId() { // warning here\\n          return \\\"12-345\\\";\\n        }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"PatternOverriddenByNonAnnotatedMethod\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Pattern validation\",\n" +
            "                      \"index\": 139,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"InjectedReferences\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Injected references\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports unresolved references injected by Language Injections. Example: '@Language(\\\"file-reference\\\")\\n    String fileName = \\\"/home/user/nonexistent.file\\\"; // highlighted if file doesn't exist'\",\n" +
            "                  \"markdown\": \"Reports unresolved references injected by [Language Injections](https://www.jetbrains.com/help/idea/using-language-injections.html).\\n\\nExample:\\n\\n\\n        @Language(\\\"file-reference\\\")\\n        String fileName = \\\"/home/user/nonexistent.file\\\"; // highlighted if file doesn't exist\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"InjectedReferences\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"General\",\n" +
            "                      \"index\": 50,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"PatternNotApplicable\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Pattern Annotation not applicable\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports when a '@Pattern' annotation is applied to an element with a type other than 'String'. Example: '@Pattern(\\\"\\\\\\\\d\\\\\\\\d\\\") int i;'\",\n" +
            "                  \"markdown\": \"Reports when a `@Pattern` annotation is applied to an element with a type other than `String`.\\n\\n**Example:**\\n\\n\\n      @Pattern(\\\"\\\\\\\\d\\\\\\\\d\\\") int i;\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"PatternNotApplicable\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Pattern validation\",\n" +
            "                      \"index\": 139,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UnknownLanguage\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unknown Language ID\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports when the ID of the language used in a '@Language' annotation is unknown. Example: '@Language(\\\"HMTL\\\") String html;'\",\n" +
            "                  \"markdown\": \"Reports when the ID of the language used in a `@Language` annotation is unknown.\\n\\n**Example:**\\n\\n\\n      @Language(\\\"HMTL\\\") String html;\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UnknownLanguage\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Language injection\",\n" +
            "                      \"index\": 0,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"PatternValidation\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Validate annotated patterns\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports expressions passed as arguments for '@Pattern' parameters and returned from '@Pattern'-annotated methods that do not match the specified pattern. Example: '@Pattern(\\\"\\\\\\\\d\\\\\\\\d-\\\\\\\\d\\\\\\\\d\\\\\\\\d\\\") String getId() {\\n    return \\\"1\\\";\\n  }' Use the Flag non compile-time constant expressions option to let the inspection report expressions with an unknown value and offer to add a substitution ('@Subst') annotation.\",\n" +
            "                  \"markdown\": \"Reports expressions passed as arguments for `@Pattern` parameters and returned from `@Pattern`-annotated methods that do not match the specified pattern.\\n\\n**Example:**\\n\\n\\n      @Pattern(\\\"\\\\\\\\d\\\\\\\\d-\\\\\\\\d\\\\\\\\d\\\\\\\\d\\\") String getId() {\\n        return \\\"1\\\";\\n      }\\n\\n\\nUse the **Flag non compile-time constant expressions** option to let the inspection report expressions with\\nan unknown value and offer to add a substitution (`@Subst`) annotation.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"PatternValidation\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Pattern validation\",\n" +
            "                      \"index\": 139,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"LanguageMismatch\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Language mismatch\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports when the language of a reference does not match the expected language of the usage context. Example: '@Language(\\\"JavaScript\\\")\\n  String JS_CODE = \\\"var x;\\\";\\n\\n  @Language(\\\"XPath\\\")\\n  String XPATH_CODE = JS_CODE; // warning here'\",\n" +
            "                  \"markdown\": \"Reports when the language of a reference does not match the expected language of the usage context.\\n\\nExample:\\n\\n\\n      @Language(\\\"JavaScript\\\")\\n      String JS_CODE = \\\"var x;\\\";\\n\\n      @Language(\\\"XPath\\\")\\n      String XPATH_CODE = JS_CODE; // warning here\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"LanguageMismatch\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Language injection\",\n" +
            "                      \"index\": 0,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              }\n" +
            "            ],\n" +
            "            \"language\": \"en-US\",\n" +
            "            \"contents\": [\n" +
            "              \"localizedData\",\n" +
            "              \"nonLocalizedData\"\n" +
            "            ],\n" +
            "            \"isComprehensive\": false\n" +
            "          },\n" +
            "          {\n" +
            "            \"name\": \"org.jetbrains.kotlin\",\n" +
            "            \"version\": \"232-1.9.0-IJ9147\",\n" +
            "            \"rules\": [\n" +
            "              {\n" +
            "                \"id\": \"RedundantRunCatching\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant 'runCatching' call\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'runCatching' calls that are immediately followed by 'getOrThrow'. Such calls can be replaced with just 'run'. Example: 'fun foo() = runCatching { doSomething() }.getOrThrow()' After the quick-fix is applied: 'fun foo() = run { doSomething() }'\",\n" +
            "                  \"markdown\": \"Reports `runCatching` calls that are immediately followed by `getOrThrow`. Such calls can be replaced with just `run`.\\n\\n**Example:**\\n\\n\\n      fun foo() = runCatching { doSomething() }.getOrThrow()\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo() = run { doSomething() }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantRunCatching\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SimpleRedundantLet\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant receiver-based 'let' call\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant receiver-based 'let' calls. The quick-fix removes the redundant 'let' call. Example: 'fun test(s: String?): Int? = s?.let { it.length }' After the quick-fix is applied: 'fun test(s: String?): Int? = s?.length'\",\n" +
            "                  \"markdown\": \"Reports redundant receiver-based `let` calls.\\n\\nThe quick-fix removes the redundant `let` call.\\n\\n**Example:**\\n\\n\\n      fun test(s: String?): Int? = s?.let { it.length }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test(s: String?): Int? = s?.length\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SimpleRedundantLet\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveSingleExpressionStringTemplate\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant string template\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports single-expression string templates that can be safely removed. Example: 'val x = \\\"Hello\\\"\\n  val y = \\\"$x\\\"' After the quick-fix is applied: 'val x = \\\"Hello\\\"\\n  val y = x // <== Updated'\",\n" +
            "                  \"markdown\": \"Reports single-expression string templates that can be safely removed.\\n\\n**Example:**\\n\\n      val x = \\\"Hello\\\"\\n      val y = \\\"$x\\\"\\n\\nAfter the quick-fix is applied:\\n\\n      val x = \\\"Hello\\\"\\n      val y = x // <== Updated\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveSingleExpressionStringTemplate\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"NonExhaustiveWhenStatementMigration\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Non-exhaustive 'when' statements will be prohibited since 1.7\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports a non-exhaustive 'when' statements that will lead to compilation error since 1.7. Motivation types: Problematic/meaningless usage patterns need to be discouraged/blocked (e.g. counterintuitive behaviors) Code is error-prone Inconsistency in the design (things are done differently in different contexts) Impact types: Compilation. Some code that used to compile won't compile any more There were cases when such code worked with no exceptions Some such code could compile without any warnings More details: KT-47709: Make when statements with enum, sealed, and Boolean subjects exhaustive by default The quick-fix adds the missing 'else -> {}' branch. Example: 'sealed class Base {\\n      class A : Base()\\n      class B : Base()\\n  }\\n\\n  fun test(base: Base) {\\n      when (base) {\\n          is Base.A -> \\\"\\\"\\n      }\\n  }' After the quick-fix is applied: 'sealed class Base {\\n      class A : Base()\\n      class B : Base()\\n  }\\n\\n  fun test(base: Base) {\\n      when (base) {\\n          is Base.A -> \\\"\\\"\\n          else -> {}\\n      }\\n  }' This inspection only reports if the Kotlin language level of the project or module is 1.6 or higher.\",\n" +
            "                  \"markdown\": \"Reports a non-exhaustive `when` statements that will lead to compilation error since 1.7.\\n\\nMotivation types:\\n\\n* Problematic/meaningless usage patterns need to be discouraged/blocked (e.g. counterintuitive behaviors)\\n  * Code is error-prone\\n* Inconsistency in the design (things are done differently in different contexts)\\n\\nImpact types:\\n\\n* Compilation. Some code that used to compile won't compile any more\\n  * There were cases when such code worked with no exceptions\\n    * Some such code could compile without any warnings\\n\\n**More details:** [KT-47709: Make when statements with enum, sealed, and Boolean subjects exhaustive by default](https://youtrack.jetbrains.com/issue/KT-47709)\\n\\nThe quick-fix adds the missing `else -> {}` branch.\\n\\n**Example:**\\n\\n\\n      sealed class Base {\\n          class A : Base()\\n          class B : Base()\\n      }\\n\\n      fun test(base: Base) {\\n          when (base) {\\n              is Base.A -> \\\"\\\"\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      sealed class Base {\\n          class A : Base()\\n          class B : Base()\\n      }\\n\\n      fun test(base: Base) {\\n          when (base) {\\n              is Base.A -> \\\"\\\"\\n              else -> {}\\n          }\\n      }\\n\\nThis inspection only reports if the Kotlin language level of the project or module is 1.6 or higher.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"NonExhaustiveWhenStatementMigration\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"IncompleteDestructuring\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Incomplete destructuring declaration\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports incomplete destructuring declaration. Example: 'data class Person(val name: String, val age: Int)\\n  val person = Person(\\\"\\\", 0)\\n  val (name) = person' The quick fix completes destructuring declaration with new variables: 'data class Person(val name: String, val age: Int)\\n  val person = Person(\\\"\\\", 0)\\n  val (name, age) = person'\",\n" +
            "                  \"markdown\": \"Reports incomplete destructuring declaration.\\n\\n**Example:**\\n\\n\\n      data class Person(val name: String, val age: Int)\\n      val person = Person(\\\"\\\", 0)\\n      val (name) = person\\n\\nThe quick fix completes destructuring declaration with new variables:\\n\\n\\n      data class Person(val name: String, val age: Int)\\n      val person = Person(\\\"\\\", 0)\\n      val (name, age) = person\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"IncompleteDestructuring\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ScopeFunctionConversion\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Scope function can be converted to another one\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports scope functions ('let', 'run', 'apply', 'also') that can be converted between each other. Using corresponding functions makes your code simpler. The quick-fix replaces the scope function to another one. Example: 'val x = \\\"\\\".let {\\n      it.length\\n  }' After the quick-fix is applied: 'val x = \\\"\\\".run {\\n      length\\n  }'\",\n" +
            "                  \"markdown\": \"Reports scope functions (`let`, `run`, `apply`, `also`) that can be converted between each other.\\n\\nUsing corresponding functions makes your code simpler.\\n\\nThe quick-fix replaces the scope function to another one.\\n\\n**Example:**\\n\\n\\n      val x = \\\"\\\".let {\\n          it.length\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      val x = \\\"\\\".run {\\n          length\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ScopeFunctionConversion\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"TrailingComma\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Trailing comma recommendations\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports trailing commas that do not follow the recommended style guide.\",\n" +
            "                  \"markdown\": \"Reports trailing commas that do not follow the recommended [style guide](https://kotlinlang.org/docs/coding-conventions.html#trailing-commas).\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"TrailingComma\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"FoldInitializerAndIfToElvis\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"If-Null return/break/... foldable to '?:'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports an 'if' expression that checks variable being null or not right after initializing it that can be converted into an elvis operator in the initializer. Example: 'fun test(foo: Int?, bar: Int): Int {\\n      var i = foo\\n      if (i == null) {\\n          return bar\\n      }\\n      return i\\n  }' The quick-fix converts the 'if' expression with an initializer into an elvis expression: 'fun test(foo: Int?, bar: Int): Int {\\n      var i = foo ?: return bar\\n      return i\\n  }'\",\n" +
            "                  \"markdown\": \"Reports an `if` expression that checks variable being null or not right after initializing it that can be converted into an elvis operator in the initializer.\\n\\n**Example:**\\n\\n\\n      fun test(foo: Int?, bar: Int): Int {\\n          var i = foo\\n          if (i == null) {\\n              return bar\\n          }\\n          return i\\n      }\\n\\nThe quick-fix converts the `if` expression with an initializer into an elvis expression:\\n\\n\\n      fun test(foo: Int?, bar: Int): Int {\\n          var i = foo ?: return bar\\n          return i\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"FoldInitializerAndIfToElvis\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"AmbiguousNonLocalJump\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Ambiguous non-local 'break' or 'continue'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'break' or 'continue' usages inside of lambdas of loop-like functions. 'break' and 'continue' keywords always apply to the real loops ('for', 'while', 'do-while'). 'break' and 'continue' never apply to any function; for example, 'break' and 'continue' don't apply to 'forEach', 'filter', 'map'. Using 'break' or 'continue' inside a loop-like function (for example, 'forEach') may be confusing. The inspection suggests adding a label to clarify to which statement 'break' or 'continue' applies to. Since Kotlin doesn't have a concept of loop-like functions, the inspection uses the heuristic. It assumes that functions that don't have one of 'callsInPlace(EXACTLY_ONCE)' or 'callsInPlace(AT_LEAST_ONCE)' contracts are loop-like functions. Example: 'for (file in files) {\\n        file.readLines().forEach { line ->\\n            if (line == commentMarkerLine) continue\\n            println(line)\\n        }\\n    }' The quick-fix adds clarifying labels: 'loop@ for (file in files) {\\n        file.readLines().forEach { line ->\\n            if (line == commentMarkerLine) continue@loop\\n            println(line)\\n        }\\n    }'\",\n" +
            "                  \"markdown\": \"Reports `break` or `continue` usages inside of lambdas of loop-like functions.\\n\\n\\n`break` and `continue` keywords always apply to the real loops (`for`,\\n`while`, `do-while`). `break` and `continue` never apply to any function; for example,\\n`break` and `continue` don't apply to `forEach`, `filter`, `map`.\\n\\n\\nUsing `break` or `continue` inside a loop-like function (for example, `forEach`) may be confusing.\\nThe inspection suggests adding a label to clarify to which statement `break` or `continue` applies to.\\n\\n\\nSince Kotlin doesn't have a concept of loop-like functions, the inspection uses the heuristic. It assumes that functions that don't\\nhave one of `callsInPlace(EXACTLY_ONCE)` or `callsInPlace(AT_LEAST_ONCE)` contracts are loop-like functions.\\n\\n**Example:**\\n\\n\\n        for (file in files) {\\n            file.readLines().forEach { line ->\\n                if (line == commentMarkerLine) continue\\n                println(line)\\n            }\\n        }\\n\\nThe quick-fix adds clarifying labels:\\n\\n\\n        loop@ for (file in files) {\\n            file.readLines().forEach { line ->\\n                if (line == commentMarkerLine) continue@loop\\n                println(line)\\n            }\\n        }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"AmbiguousNonLocalJump\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceWithStringBuilderAppendRange\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'StringBuilder.append(CharArray, offset, len)' call on the JVM\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports a 'StringBuilder.append(CharArray, offset, len)' function call on the JVM platform that should be replaced with a 'StringBuilder.appendRange(CharArray, startIndex, endIndex)' function call. The 'append' function behaves differently on the JVM, JS and Native platforms, so using the 'appendRange' function is recommended. Example: 'fun f(charArray: CharArray, offset: Int, len: Int): String {\\n      return buildString {\\n          append(charArray, offset, len)\\n      }\\n  }' After the quick-fix is applied: 'fun f(charArray: CharArray, offset: Int, len: Int): String {\\n      return buildString {\\n          appendRange(charArray, offset, offset + len)\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports a `StringBuilder.append(CharArray, offset, len)` function call on the JVM platform that should be replaced with a `StringBuilder.appendRange(CharArray, startIndex, endIndex)` function call.\\n\\nThe `append` function behaves differently on the JVM, JS and Native platforms, so using the `appendRange` function is recommended.\\n\\n**Example:**\\n\\n\\n      fun f(charArray: CharArray, offset: Int, len: Int): String {\\n          return buildString {\\n              append(charArray, offset, len)\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun f(charArray: CharArray, offset: Int, len: Int): String {\\n          return buildString {\\n              appendRange(charArray, offset, offset + len)\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceWithStringBuilderAppendRange\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Other problems\",\n" +
            "                      \"index\": 60,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinInvalidBundleOrProperty\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Invalid property key\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports unresolved references to '.properties' file keys and resource bundles in Kotlin files.\",\n" +
            "                  \"markdown\": \"Reports unresolved references to `.properties` file keys and resource bundles in Kotlin files.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"InvalidBundleOrProperty\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin\",\n" +
            "                      \"index\": 1,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UselessCallOnCollection\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Useless call on collection type\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'filter…' calls from the standard library on already filtered collections. Several functions from the standard library such as 'filterNotNull()' or 'filterIsInstance' have sense only when they are called on receivers that have types distinct from the resulting one. Otherwise, such calls can be omitted as the result will be the same. Remove redundant call quick-fix can be used to amend the code automatically. Example: 'fun test(list: List<String>) {\\n      val x = list.filterNotNull() // quick-fix simplifies to 'list'\\n      val y = list.filterIsInstance<String>() // quick-fix simplifies to 'list'\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `filter...` calls from the standard library on already filtered collections.\\n\\nSeveral functions from the standard library such as `filterNotNull()` or `filterIsInstance`\\nhave sense only when they are called on receivers that have types distinct from the resulting one. Otherwise,\\nsuch calls can be omitted as the result will be the same.\\n\\n**Remove redundant call** quick-fix can be used to amend the code automatically.\\n\\nExample:\\n\\n\\n      fun test(list: List<String>) {\\n          val x = list.filterNotNull() // quick-fix simplifies to 'list'\\n          val y = list.filterIsInstance<String>() // quick-fix simplifies to 'list'\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UselessCallOnCollection\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantRequireNotNullCall\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant 'requireNotNull' or 'checkNotNull' call\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant 'requireNotNull' or 'checkNotNull' call on non-nullable expressions. Example: 'fun foo(i: Int) {\\n      requireNotNull(i) // This 'i' is always not null, so this 'requireNotNull' call is redundant.\\n      ...\\n  }' After the quick-fix is applied: 'fun foo(i: Int) {\\n      ...\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant `requireNotNull` or `checkNotNull` call on non-nullable expressions.\\n\\n**Example:**\\n\\n\\n      fun foo(i: Int) {\\n          requireNotNull(i) // This 'i' is always not null, so this 'requireNotNull' call is redundant.\\n          ...\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(i: Int) {\\n          ...\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantRequireNotNullCall\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ObjectPropertyName\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Object property naming convention\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports properties that do not follow the naming conventions. The following properties are reported: Top-level properties Properties in objects and companion objects You can specify the required pattern in the inspection options. Recommended naming conventions: it has to start with an uppercase letter, use camel case and no underscores. Example: '// top-level property\\n  val USER_NAME_FIELD = \\\"UserName\\\"\\n  // top-level property holding reference to singleton object\\n  val PersonComparator: Comparator<Person> = /*...*/\\n\\n  class Person {\\n    companion object {\\n      // property in companion object\\n      val NO_NAME = Person()\\n    }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports properties that do not follow the naming conventions.\\n\\nThe following properties are reported:\\n\\n* Top-level properties\\n* Properties in objects and companion objects\\n\\nYou can specify the required pattern in the inspection options.\\n\\n[Recommended naming conventions](https://kotlinlang.org/docs/coding-conventions.html#naming-rules): it has to start with an uppercase letter, use camel case and no underscores.\\n\\n**Example:**\\n\\n\\n      // top-level property\\n      val USER_NAME_FIELD = \\\"UserName\\\"\\n      // top-level property holding reference to singleton object\\n      val PersonComparator: Comparator<Person> = /*...*/\\n\\n      class Person {\\n        companion object {\\n          // property in companion object\\n          val NO_NAME = Person()\\n        }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ObjectPropertyName\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Naming conventions\",\n" +
            "                      \"index\": 71,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"PackageDirectoryMismatch\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Package name does not match containing directory\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'package' directives that do not match the location of the file. When applying fixes, \\\"Move refactoring\\\" defaults are used to update usages of changed declarations, namely: \\\"Search in comments and strings\\\" \\\"Search for text occurrences\\\"\",\n" +
            "                  \"markdown\": \"Reports `package` directives that do not match the location of the file.\\n\\n\\nWhen applying fixes, \\\"Move refactoring\\\" defaults are used to update usages of changed declarations, namely:\\n\\n* \\\"Search in comments and strings\\\"\\n* \\\"Search for text occurrences\\\"\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"PackageDirectoryMismatch\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Java interop issues\",\n" +
            "                      \"index\": 79,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinCovariantEquals\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Covariant 'equals()'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'equals()' that takes an argument type other than 'Any?' if the class does not have another 'equals()' that takes 'Any?' as its argument type. Example: 'class Foo {\\n      fun equals(other: Foo?): Boolean {\\n          return true\\n      }\\n  }' To fix the problem create 'equals()' method that takes an argument of type 'Any?'.\",\n" +
            "                  \"markdown\": \"Reports `equals()` that takes an argument type other than `Any?` if the class does not have another `equals()` that takes `Any?` as its argument type.\\n\\n**Example:**\\n\\n\\n      class Foo {\\n          fun equals(other: Foo?): Boolean {\\n              return true\\n          }\\n      }\\n\\nTo fix the problem create `equals()` method that takes an argument of type `Any?`.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"CovariantEquals\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceSizeZeroCheckWithIsEmpty\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Size zero check can be replaced with 'isEmpty()'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'size == 0' checks on 'Collections/Array/String' that should be replaced with 'isEmpty()'. Using 'isEmpty()' makes your code simpler. The quick-fix replaces the size check with 'isEmpty()'. Example: 'fun foo() {\\n      val arrayOf = arrayOf(1, 2, 3)\\n      arrayOf.size == 0\\n  }' After the quick-fix is applied: 'fun foo() {\\n      val arrayOf = arrayOf(1, 2, 3)\\n      arrayOf.isEmpty()\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `size == 0` checks on `Collections/Array/String` that should be replaced with `isEmpty()`.\\n\\nUsing `isEmpty()` makes your code simpler.\\n\\nThe quick-fix replaces the size check with `isEmpty()`.\\n\\n**Example:**\\n\\n\\n      fun foo() {\\n          val arrayOf = arrayOf(1, 2, 3)\\n          arrayOf.size == 0\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo() {\\n          val arrayOf = arrayOf(1, 2, 3)\\n          arrayOf.isEmpty()\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceSizeZeroCheckWithIsEmpty\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"AmbiguousExpressionInWhenBranchMigration\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Ambiguous logical expressions in 'when' branches since 1.7\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports ambiguous logical expressions in 'when' branches which cause compilation errors in Kotlin 1.8 and later. 'fun Int.matches(strict: Boolean): Boolean = when (strict) {\\n      true -> this == 6\\n      this in (4..7) -> true // is ambiguous\\n      else -> false\\n  }' After the quick-fix is applied: 'fun Int.matches(strict: Boolean): Boolean = when (strict) {\\n      true -> this == 6\\n      (this in (4..7)) -> true // wrapped in parentheses\\n      else -> false\\n  }' Inspection is available for Kotlin language level starting from 1.7.\",\n" +
            "                  \"markdown\": \"Reports ambiguous logical expressions in `when` branches which cause compilation errors in Kotlin 1.8 and later.\\n\\n\\n      fun Int.matches(strict: Boolean): Boolean = when (strict) {\\n          true -> this == 6\\n          this in (4..7) -> true // is ambiguous\\n          else -> false\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun Int.matches(strict: Boolean): Boolean = when (strict) {\\n          true -> this == 6\\n          (this in (4..7)) -> true // wrapped in parentheses\\n          else -> false\\n      }\\n\\nInspection is available for Kotlin language level starting from 1.7.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"AmbiguousExpressionInWhenBranchMigration\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantEnumConstructorInvocation\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant enum constructor invocation\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant constructor invocation on an enum entry. Example: 'enum class Baz(i: Int = 0) {\\n      A(1),\\n      B(),\\n      C(),\\n  }' After the quick-fix is applied: 'enum class Baz(i: Int = 0) {\\n      A(1),\\n      B,\\n      C,\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant constructor invocation on an enum entry.\\n\\n**Example:**\\n\\n\\n      enum class Baz(i: Int = 0) {\\n          A(1),\\n          B(),\\n          C(),\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      enum class Baz(i: Int = 0) {\\n          A(1),\\n          B,\\n          C,\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantEnumConstructorInvocation\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"FakeJvmFieldConstant\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Kotlin non-const property used as Java constant\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports Kotlin properties that are not 'const' and used as Java annotation arguments. For example, a property with the '@JvmField' annotation has an initializer that can be evaluated at compile-time, and it has a primitive or 'String' type. Such properties have a 'ConstantValue' attribute in bytecode in Kotlin 1.1-1.2. This attribute allows javac to fold usages of the corresponding field and use that field in annotations. This can lead to incorrect behavior in the case of separate or incremental compilation in mixed Java/Kotlin code. This behavior is subject to change in Kotlin 1.3 (no 'ConstantValue' attribute any more). Example: Kotlin code in foo.kt file: 'annotation class Ann(val s: String)\\n  @JvmField val importantString = \\\"important\\\"' Java code: 'public class JavaUser {\\n      // This is dangerous\\n      @Ann(s = FooKt.importantString)\\n      public void foo() {}\\n  }' To fix the problem replace the '@JvmField' annotation with the 'const' modifier on a relevant Kotlin property or inline it.\",\n" +
            "                  \"markdown\": \"Reports Kotlin properties that are not `const` and used as Java annotation arguments.\\n\\n\\nFor example, a property with the `@JvmField` annotation has an initializer that can be evaluated at compile-time,\\nand it has a primitive or `String` type.\\n\\n\\nSuch properties have a `ConstantValue` attribute in bytecode in Kotlin 1.1-1.2.\\nThis attribute allows javac to fold usages of the corresponding field and use that field in annotations.\\nThis can lead to incorrect behavior in the case of separate or incremental compilation in mixed Java/Kotlin code.\\nThis behavior is subject to change in Kotlin 1.3 (no `ConstantValue` attribute any more).\\n\\n**Example:**\\n\\nKotlin code in foo.kt file:\\n\\n\\n      annotation class Ann(val s: String)\\n      @JvmField val importantString = \\\"important\\\"\\n\\nJava code:\\n\\n\\n      public class JavaUser {\\n          // This is dangerous\\n          @Ann(s = FooKt.importantString)\\n          public void foo() {}\\n      }\\n\\nTo fix the problem replace the `@JvmField` annotation with the `const` modifier on a relevant Kotlin property or inline it.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"FakeJvmFieldConstant\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Java interop issues\",\n" +
            "                      \"index\": 79,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"WhenWithOnlyElse\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'when' has only 'else' branch and can be simplified\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'when' expressions with only an 'else' branch that can be simplified. Simplify expression quick-fix can be used to amend the code automatically. Example: 'fun redundant() {\\n      val x = when { // <== redundant, the quick-fix simplifies the when expression to \\\"val x = 1\\\"\\n          else -> 1\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `when` expressions with only an `else` branch that can be simplified.\\n\\n**Simplify expression** quick-fix can be used to amend the code automatically.\\n\\nExample:\\n\\n\\n      fun redundant() {\\n          val x = when { // <== redundant, the quick-fix simplifies the when expression to \\\"val x = 1\\\"\\n              else -> 1\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"WhenWithOnlyElse\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinTestJUnit\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"kotlin-test-junit could be used\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports usage of 'kotlin-test' and 'junit' dependency without 'kotlin-test-junit'. It is recommended to use 'kotlin-test-junit' dependency to work with Kotlin and JUnit.\",\n" +
            "                  \"markdown\": \"Reports usage of `kotlin-test` and `junit` dependency without `kotlin-test-junit`.\\n\\nIt is recommended to use `kotlin-test-junit` dependency to work with Kotlin and JUnit.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"KotlinTestJUnit\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin\",\n" +
            "                      \"index\": 1,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SafeCastWithReturn\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Safe cast with 'return' should be replaced with 'if' type check\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports safe cast with 'return' that can be replaced with 'if' type check. Using corresponding functions makes your code simpler. The quick-fix replaces the safe cast with 'if' type check. Example: 'fun test(x: Any) {\\n      x as? String ?: return\\n  }' After the quick-fix is applied: 'fun test(x: Any) {\\n      if (x !is String) return\\n  }'\",\n" +
            "                  \"markdown\": \"Reports safe cast with `return` that can be replaced with `if` type check.\\n\\nUsing corresponding functions makes your code simpler.\\n\\nThe quick-fix replaces the safe cast with `if` type check.\\n\\n**Example:**\\n\\n\\n      fun test(x: Any) {\\n          x as? String ?: return\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test(x: Any) {\\n          if (x !is String) return\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SafeCastWithReturn\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceAssertBooleanWithAssertEquality\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Assert boolean could be replaced with assert equality\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls to 'assertTrue()' and 'assertFalse()' that can be replaced with assert equality functions. 'assertEquals()', 'assertSame()', and their negating counterparts (-Not-) provide more informative messages on failure. Example: 'assertTrue(a == b)' After the quick-fix is applied: 'assertEquals(a, b)'\",\n" +
            "                  \"markdown\": \"Reports calls to `assertTrue()` and `assertFalse()` that can be replaced with assert equality functions.\\n\\n\\n`assertEquals()`, `assertSame()`, and their negating counterparts (-Not-) provide more informative messages on\\nfailure.\\n\\n**Example:**\\n\\n      assertTrue(a == b)\\n\\nAfter the quick-fix is applied:\\n\\n      assertEquals(a, b)\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceAssertBooleanWithAssertEquality\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UnnecessaryOptInAnnotation\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unnecessary '@OptIn' annotation\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports unnecessary opt-in annotations that can be safely removed. '@OptIn' annotation is required for the code using experimental APIs that can change any time in the future. This annotation becomes useless and possibly misleading if no such API is used (e.g., when the experimental API becomes stable and does not require opting in its usage anymore). Remove annotation quick-fix can be used to remove the unnecessary '@OptIn' annotation. Example: '@OptIn(ExperimentalApi::class)\\n  fun foo(x: Bar) {\\n      x.baz()\\n  }' After the quick-fix is applied: 'fun foo(x: Bar) {\\n      x.baz()\\n  }'\",\n" +
            "                  \"markdown\": \"Reports unnecessary opt-in annotations that can be safely removed.\\n\\n`@OptIn` annotation is required for the code using experimental APIs that can change\\nany time in the future. This annotation becomes useless and possibly misleading if no such API is used\\n(e.g., when the experimental API becomes stable and does not require opting in its usage anymore).\\n\\n\\n**Remove annotation** quick-fix can be used to remove the unnecessary `@OptIn` annotation.\\n\\nExample:\\n\\n\\n      @OptIn(ExperimentalApi::class)\\n      fun foo(x: Bar) {\\n          x.baz()\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(x: Bar) {\\n          x.baz()\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UnnecessaryOptInAnnotation\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"NonVarPropertyInExternalInterface\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"External interface contains val property\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports not var properties in external interface. Read more in the migration guide.\",\n" +
            "                  \"markdown\": \"Reports not var properties in external interface. Read more in the [migration guide](https://kotlinlang.org/docs/js-ir-migration.html#convert-properties-of-external-interfaces-to-var).\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"NonVarPropertyInExternalInterface\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceStringFormatWithLiteral\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'String.format' call can be replaced with string templates\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'String.format' calls that can be replaced with string templates. Using string templates makes your code simpler. The quick-fix replaces the call with a string template. Example: 'fun main() {\\n      val id = \\\"abc\\\"\\n      val date = \\\"123\\\"\\n      val s = String.format(\\\"%s_%s_%s\\\", id, date, id)\\n  }' After the quick-fix is applied: 'fun main() {\\n      val id = \\\"abc\\\"\\n      val date = \\\"123\\\"\\n      val s = \\\"${id}_${date}_$id\\\"\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `String.format` calls that can be replaced with string templates.\\n\\nUsing string templates makes your code simpler.\\n\\nThe quick-fix replaces the call with a string template.\\n\\n**Example:**\\n\\n\\n      fun main() {\\n          val id = \\\"abc\\\"\\n          val date = \\\"123\\\"\\n          val s = String.format(\\\"%s_%s_%s\\\", id, date, id)\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun main() {\\n          val id = \\\"abc\\\"\\n          val date = \\\"123\\\"\\n          val s = \\\"${id}_${date}_$id\\\"\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceStringFormatWithLiteral\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceNotNullAssertionWithElvisReturn\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Not-null assertion can be replaced with 'return'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports not-null assertion ('!!') calls that can be replaced with the elvis operator and return ('?: return'). A not-null assertion can lead to NPE (NullPointerException) that is not expected. Avoiding the use of '!!' is good practice. The quick-fix replaces the not-null assertion with 'return' or 'return null'. Example: 'fun test(number: Int?) {\\n      val x = number!!\\n  }' After the quick-fix is applied: 'fun test(number: Int?) {\\n      val x = number ?: return\\n  }'\",\n" +
            "                  \"markdown\": \"Reports not-null assertion (`!!`) calls that can be replaced with the elvis operator and return (`?: return`).\\n\\nA not-null assertion can lead to NPE (NullPointerException) that is not expected. Avoiding the use of `!!` is good practice.\\n\\nThe quick-fix replaces the not-null assertion with `return` or `return null`.\\n\\n**Example:**\\n\\n\\n      fun test(number: Int?) {\\n          val x = number!!\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test(number: Int?) {\\n          val x = number ?: return\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceNotNullAssertionWithElvisReturn\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceSubstringWithSubstringBefore\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'substring' call should be replaced with 'substringBefore'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls like 's.substring(0, s.indexOf(x))' that can be replaced with 's.substringBefore(x)'. Using 'substringBefore()' makes your code simpler. The quick-fix replaces the 'substring' call with 'substringBefore'. Example: 'fun foo(s: String) {\\n      s.substring(0, s.indexOf('x'))\\n  }' After the quick-fix is applied: 'fun foo(s: String) {\\n      s.substringBefore('x')\\n  }'\",\n" +
            "                  \"markdown\": \"Reports calls like `s.substring(0, s.indexOf(x))` that can be replaced with `s.substringBefore(x)`.\\n\\nUsing `substringBefore()` makes your code simpler.\\n\\nThe quick-fix replaces the `substring` call with `substringBefore`.\\n\\n**Example:**\\n\\n\\n      fun foo(s: String) {\\n          s.substring(0, s.indexOf('x'))\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(s: String) {\\n          s.substringBefore('x')\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceSubstringWithSubstringBefore\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceWithOperatorAssignment\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Assignment can be replaced with operator assignment\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports modifications of variables with a simple assignment (such as 'y = y + x') that can be replaced with an operator assignment. The quick-fix replaces the assignment with an assignment operator. Example: 'fun foo() {\\n      val list = mutableListOf(1, 2, 3)\\n      list = list + 4\\n  }' After the quick-fix is applied: 'fun foo() {\\n      val list = mutableListOf(1, 2, 3)\\n      list += 4\\n  }'\",\n" +
            "                  \"markdown\": \"Reports modifications of variables with a simple assignment (such as `y = y + x`) that can be replaced with an operator assignment.\\n\\nThe quick-fix replaces the assignment with an assignment operator.\\n\\n**Example:**\\n\\n\\n      fun foo() {\\n          val list = mutableListOf(1, 2, 3)\\n          list = list + 4\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo() {\\n          val list = mutableListOf(1, 2, 3)\\n          list += 4\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceWithOperatorAssignment\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UnusedSymbol\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unused symbol\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports symbols that are not used or not reachable from entry points.\",\n" +
            "                  \"markdown\": \"Reports symbols that are not used or not reachable from entry points.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"unused\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceCollectionCountWithSize\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Collection count can be converted to size\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls to 'Collection<T>.count()'. This function call can be replaced with '.size'. '.size' form ensures that the operation is O(1) and won't allocate extra objects, whereas 'count()' could be confused with 'Iterable<T>.count()', which is O(n) and allocating. Example: 'fun foo() {\\n      var list = listOf(1,2,3)\\n      list.count() // replaceable 'count()'\\n  }' After the quick-fix is applied: 'fun foo() {\\n      var list = listOf(1,2,3)\\n      list.size\\n  }'\",\n" +
            "                  \"markdown\": \"Reports calls to `Collection<T>.count()`.\\n\\n\\nThis function call can be replaced with `.size`.\\n\\n\\n`.size` form ensures that the operation is O(1) and won't allocate extra objects, whereas\\n`count()` could be confused with `Iterable<T>.count()`, which is O(n) and allocating.\\n\\n\\n**Example:**\\n\\n      fun foo() {\\n          var list = listOf(1,2,3)\\n          list.count() // replaceable 'count()'\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n      fun foo() {\\n          var list = listOf(1,2,3)\\n          list.size\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceCollectionCountWithSize\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceArrayEqualityOpWithArraysEquals\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Arrays comparison via '==' and '!='\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports usages of '==' or '!=' operator for arrays that should be replaced with 'contentEquals()'. The '==' and '!='operators compare array references instead of their content. Examples: 'fun test() {\\n      val a = arrayOf(1, 2, 3)\\n      val b = arrayOf(1, 2, 3)\\n      println(a == b) // references comparison\\n  }' After the quick-fix is applied: 'fun test() {\\n      val a = arrayOf(1, 2, 3)\\n      val b = arrayOf(1, 2, 3)\\n      println(a.contentEquals(b))\\n  }'\",\n" +
            "                  \"markdown\": \"Reports usages of `==` or `!=` operator for arrays that should be replaced with `contentEquals()`.\\n\\n\\nThe `==` and `!=`operators compare array references instead of their content.\\n\\n**Examples:**\\n\\n      fun test() {\\n          val a = arrayOf(1, 2, 3)\\n          val b = arrayOf(1, 2, 3)\\n          println(a == b) // references comparison\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n      fun test() {\\n          val a = arrayOf(1, 2, 3)\\n          val b = arrayOf(1, 2, 3)\\n          println(a.contentEquals(b))\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceArrayEqualityOpWithArraysEquals\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"DeprecatedGradleDependency\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Deprecated library is used in Gradle\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports deprecated dependencies in Gradle build scripts. Example: 'dependencies {\\n      compile \\\"org.jetbrains.kotlin:kotlin-stdlib-jre7:1.2.0\\\"\\n  }' After the quick-fix applied: 'dependencies {\\n      compile \\\"org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.2.0\\\"\\n  }'\",\n" +
            "                  \"markdown\": \"Reports deprecated dependencies in Gradle build scripts.\\n\\n**Example:**\\n\\n\\n      dependencies {\\n          compile \\\"org.jetbrains.kotlin:kotlin-stdlib-jre7:1.2.0\\\"\\n      }\\n\\nAfter the quick-fix applied:\\n\\n\\n      dependencies {\\n          compile \\\"org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.2.0\\\"\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"DeprecatedGradleDependency\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin\",\n" +
            "                      \"index\": 1,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"CastDueToProgressionResolutionChangeMigration\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Progression resolution change since 1.9\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports overloaded function calls where an argument requires an explicit cast to resolve to a proper declaration. The current compiler warning (available since Kotlin 1.6.20) will become an error in Kotlin 1.8. Progressions and ranges types ('kotlin.ranges') will start implementing the 'Collection' interface in Kotlin 1.9 and later. This update will cause a change in resolution for overloaded functions. For instance, in the example below, the 'test(1..5)' call will be resolved to 'test(t: Any)' in Kotlin 1.8 and earlier and to 'test(t: Collection<*>)' in Kotlin 1.9 and later. 'fun test(t: Any) { }\\n  fun test(t: Collection<*>) { }\\n  fun invoke() {\\n    test(1..5) // IntRange becomes Collection in 1.9\\n  }' The provided quick-fix captures the behaviour specific to the compiler of version 1.8 and earlier: 'fun test(t: Any) { }\\n  fun test(t: Collection<*>) { }\\n\\n  fun invoke() {\\n    test(1..5) // resolved to 'test(t: T)' before Kotlin 1.9\\n  }' After the quick-fix is applied: 'fun test(t: Any) { }\\n  fun test(t: Collection<*>) { }\\n\\n  fun invoke() {\\n    test((1..5) as Iterable<Int>) // resolved to 'test(t: T)' in Kotlin 1.9\\n  }' Inspection is available for the Kotlin language level starting from 1.6.\",\n" +
            "                  \"markdown\": \"Reports overloaded function calls where an argument requires an explicit cast to resolve to a proper declaration.\\nThe current compiler warning (available since Kotlin 1.6.20) will become an error in Kotlin 1.8.\\n\\n\\nProgressions and ranges types (`kotlin.ranges`) will start implementing the `Collection` interface in Kotlin\\n1.9 and later. This update will cause a change in resolution for overloaded functions. For instance, in the example below, the\\n`test(1..5)` call will be resolved to `test(t: Any)` in Kotlin 1.8 and earlier and to\\n`test(t: Collection<*>)` in Kotlin 1.9 and later.\\n\\n\\n      fun test(t: Any) { }\\n      fun test(t: Collection<*>) { }\\n      fun invoke() {\\n        test(1..5) // IntRange becomes Collection in 1.9\\n      }\\n\\nThe provided quick-fix captures the behaviour specific to the compiler of version 1.8 and earlier:\\n\\n\\n      fun test(t: Any) { }\\n      fun test(t: Collection<*>) { }\\n\\n      fun invoke() {\\n        test(1..5) // resolved to 'test(t: T)' before Kotlin 1.9\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test(t: Any) { }\\n      fun test(t: Collection<*>) { }\\n\\n      fun invoke() {\\n        test((1..5) as Iterable<Int>) // resolved to 'test(t: T)' in Kotlin 1.9\\n      }\\n\\nInspection is available for the Kotlin language level starting from 1.6.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"CastDueToProgressionResolutionChangeMigration\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ConvertReferenceToLambda\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Can be replaced with lambda\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports a function reference expression that can be replaced with a function literal (lambda). Sometimes, passing a lambda looks more straightforward and more consistent with the rest of the code. Also, the fix might be handy if you need to replace a simple call with something more complex. Example: 'fun Int.isEven() = this % 2 == 0\\n\\n  fun example() {\\n      val numbers = listOf(1, 2, 4, 7, 9, 10)\\n      val evenNumbers = numbers.filter(Int::isEven)\\n  }' After the quick-fix is applied: 'fun Int.isEven() = this % 2 == 0\\n\\n  fun example() {\\n      val numbers = listOf(1, 2, 4, 7, 9, 10)\\n      val evenNumbers = numbers.filter { it.isEven() }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports a function reference expression that can be replaced with a function literal (lambda).\\n\\n\\nSometimes, passing a lambda looks more straightforward and more consistent with the rest of the code.\\nAlso, the fix might be handy if you need to replace a simple call with something more complex.\\n\\n**Example:**\\n\\n\\n      fun Int.isEven() = this % 2 == 0\\n\\n      fun example() {\\n          val numbers = listOf(1, 2, 4, 7, 9, 10)\\n          val evenNumbers = numbers.filter(Int::isEven)\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun Int.isEven() = this % 2 == 0\\n\\n      fun example() {\\n          val numbers = listOf(1, 2, 4, 7, 9, 10)\\n          val evenNumbers = numbers.filter { it.isEven() }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ConvertReferenceToLambda\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UnlabeledReturnInsideLambda\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unlabeled return inside lambda\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports unlabeled 'return' expressions inside inline lambda. Such expressions can be confusing because it might be unclear which scope belongs to 'return'. Change to return@… quick-fix can be used to amend the code automatically. Example: 'fun test(list: List<Int>) {\\n      list.forEach {\\n          // This return expression returns from the function test\\n          // One can change it to return@forEach to change the scope\\n          if (it == 10) return\\n      }\\n  }' After the quick-fix is applied: 'fun test(list: List<Int>) {\\n      list.forEach {\\n          if (it == 10) return@test\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports unlabeled `return` expressions inside inline lambda.\\n\\nSuch expressions can be confusing because it might be unclear which scope belongs to `return`.\\n\\n**Change to return@...** quick-fix can be used to amend the code automatically.\\n\\nExample:\\n\\n\\n      fun test(list: List<Int>) {\\n          list.forEach {\\n              // This return expression returns from the function test\\n              // One can change it to return@forEach to change the scope\\n              if (it == 10) return\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test(list: List<Int>) {\\n          list.forEach {\\n              if (it == 10) return@test\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UnlabeledReturnInsideLambda\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"AddConversionCallMigration\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Explicit conversion from `Int` needed since 1.9\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports expressions that will be of type 'Int', thus causing compilation errors in Kotlin 1.9 and later. Example: 'fun takeByte(x: Byte) {}\\n\\n  fun foo() {\\n      takeByte(1 + 1) // will be resolved to Int in 1.9\\n  }' After the quick-fix is applied: 'fun takeByte(x: Byte) {}\\n\\n  fun foo() {\\n      takeByte((1 + 1).toByte()) // will be resolved to Int in 1.9\\n  }' Inspection is available for Kotlin language level starting from 1.7.\",\n" +
            "                  \"markdown\": \"Reports expressions that will be of type `Int`, thus causing compilation errors in Kotlin 1.9 and later.\\n\\nExample:\\n\\n\\n      fun takeByte(x: Byte) {}\\n\\n      fun foo() {\\n          takeByte(1 + 1) // will be resolved to Int in 1.9\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun takeByte(x: Byte) {}\\n\\n      fun foo() {\\n          takeByte((1 + 1).toByte()) // will be resolved to Int in 1.9\\n      }\\n\\nInspection is available for Kotlin language level starting from 1.7.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"AddConversionCallMigration\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"LateinitVarOverridesLateinitVar\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'lateinit var' property overrides 'lateinit var' property\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'lateinit var' properties that override other 'lateinit var' properties. A subclass instance will have two fields for a single property, and the one from the superclass will remain effectively unused. Example: 'open class BaseClass {\\n      open lateinit var name: String\\n    }\\n\\n    class RealClass : BaseClass() {\\n      override lateinit var name: String\\n    }'\",\n" +
            "                  \"markdown\": \"Reports `lateinit var` properties that override other `lateinit var` properties.\\n\\nA subclass instance will have two fields for a single property, and the one from the superclass will remain effectively unused.\\n\\n**Example:**\\n\\n\\n        open class BaseClass {\\n          open lateinit var name: String\\n        }\\n\\n        class RealClass : BaseClass() {\\n          override lateinit var name: String\\n        }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"LateinitVarOverridesLateinitVar\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"VerboseNullabilityAndEmptiness\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Verbose nullability and emptiness check\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports combination of 'null' and emptiness checks that can be simplified into a single check. The quick-fix replaces highlighted checks with a combined check call, such as 'isNullOrEmpty()'. Example: 'fun test(list: List<Int>?) {\\n      if (list == null || list.isEmpty()) {\\n          println(\\\"List is empty!\\\")\\n      } else {\\n          println(list.joinToString())\\n      }\\n  }' After the quick-fix is applied: 'fun test(list: List<Int>?) {\\n      if (list.isNullOrEmpty()) {\\n          println(\\\"List is empty!\\\")\\n      } else {\\n          println(list.joinToString())\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports combination of `null` and emptiness checks that can be simplified into a single check.\\n\\nThe quick-fix replaces highlighted checks with a combined check call, such as `isNullOrEmpty()`.\\n\\n**Example:**\\n\\n\\n      fun test(list: List<Int>?) {\\n          if (list == null || list.isEmpty()) {\\n              println(\\\"List is empty!\\\")\\n          } else {\\n              println(list.joinToString())\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test(list: List<Int>?) {\\n          if (list.isNullOrEmpty()) {\\n              println(\\\"List is empty!\\\")\\n          } else {\\n              println(list.joinToString())\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"VerboseNullabilityAndEmptiness\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"DifferentKotlinGradleVersion\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Kotlin Gradle and IDE plugins versions are different\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports that Gradle plugin version isn't properly supported in the current IDE plugin. This can cause inconsistencies between IDE and Gradle builds in error reporting or code behavior. Example: 'dependencies {\\n    classpath \\\"org.jetbrains.kotlin:kotlin-gradle-plugin:0.0.1\\\"\\n  }' To fix the problem change the kotlin gradle plugin version to match the version of kotlin that is bundled into the IDE plugin.\",\n" +
            "                  \"markdown\": \"Reports that Gradle plugin version isn't properly supported in the current IDE plugin.\\n\\nThis can cause inconsistencies between IDE and Gradle builds in error reporting or code behavior.\\n\\n**Example:**\\n\\n\\n      dependencies {\\n        classpath \\\"org.jetbrains.kotlin:kotlin-gradle-plugin:0.0.1\\\"\\n      }\\n\\nTo fix the problem change the kotlin gradle plugin version to match the version of kotlin that is bundled into the IDE plugin.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"DifferentKotlinGradleVersion\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin\",\n" +
            "                      \"index\": 1,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"JoinDeclarationAndAssignment\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Join declaration and assignment\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports property declarations that can be joined with the following assignment. Example: 'val x: String\\n  x = System.getProperty(\\\"\\\")' The quick fix joins the declaration with the assignment: 'val x = System.getProperty(\\\"\\\")'\",\n" +
            "                  \"markdown\": \"Reports property declarations that can be joined with the following assignment.\\n\\n**Example:**\\n\\n\\n      val x: String\\n      x = System.getProperty(\\\"\\\")\\n\\nThe quick fix joins the declaration with the assignment:\\n\\n\\n      val x = System.getProperty(\\\"\\\")\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"JoinDeclarationAndAssignment\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinEqualsBetweenInconvertibleTypes\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'equals()' between objects of inconvertible types\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls to 'equals()' where the receiver and the argument are of incompatible primitive, enum, or string types. While such a call might theoretically be useful, most likely it represents a bug. Example: '5.equals(\\\"\\\");'\",\n" +
            "                  \"markdown\": \"Reports calls to `equals()` where the receiver and the argument are of incompatible primitive, enum, or string types.\\n\\nWhile such a call might theoretically be useful, most likely it represents a bug.\\n\\n**Example:**\\n\\n      5.equals(\\\"\\\");\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"EqualsBetweenInconvertibleTypes\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"HasPlatformType\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Function or property has platform type\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports functions and properties that have a platform type. To prevent unexpected errors, the type should be declared explicitly. Example: 'fun foo() = java.lang.String.valueOf(1)' The quick fix allows you to specify the return type: 'fun foo(): String = java.lang.String.valueOf(1)'\",\n" +
            "                  \"markdown\": \"Reports functions and properties that have a platform type.\\n\\nTo prevent unexpected errors, the type should be declared explicitly.\\n\\n**Example:**\\n\\n\\n      fun foo() = java.lang.String.valueOf(1)\\n\\nThe quick fix allows you to specify the return type:\\n\\n\\n      fun foo(): String = java.lang.String.valueOf(1)\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"HasPlatformType\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Java interop issues\",\n" +
            "                      \"index\": 79,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"DataClassPrivateConstructor\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Private data class constructor is exposed via the 'copy' method\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports the 'private' primary constructor in data classes. 'data' classes have a 'copy()' factory method that can be used similarly to a constructor. A constructor should not be marked as 'private' to provide enough safety. Example: 'data class User private constructor(val name: String)' The quick-fix changes the constructor visibility modifier to 'public': 'data class User(val name: String)'\",\n" +
            "                  \"markdown\": \"Reports the `private` primary constructor in data classes.\\n\\n\\n`data` classes have a `copy()` factory method that can be used similarly to a constructor.\\nA constructor should not be marked as `private` to provide enough safety.\\n\\n**Example:**\\n\\n\\n      data class User private constructor(val name: String)\\n\\nThe quick-fix changes the constructor visibility modifier to `public`:\\n\\n\\n      data class User(val name: String)\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"DataClassPrivateConstructor\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantInnerClassModifier\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant 'inner' modifier\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports the 'inner' modifier on a class as redundant if it doesn't reference members of its outer class. Example: 'class Foo {\\n      inner class InnerClass { // redundant `inner` modifier\\n          fun hello() {\\n              println(\\\"Hi!\\\")\\n          }\\n      }\\n  }\\n\\n  class List {\\n      val objects = Array<Any>(42) { Any() }\\n\\n      inner class Iterator { // Not redundant `inner` modifier\\n          fun next(): Any {\\n              return objects[0]\\n          }\\n      }\\n  }' After the quick-fix is applied: 'class Foo {\\n      class InnerClass { // redundant `inner` modifier\\n          fun hello() {\\n              println(\\\"Hi!\\\")\\n          }\\n      }\\n  }\\n\\n  class List {\\n      val objects = Array<Any>(42) { Any() }\\n\\n      inner class Iterator { // Not redundant `inner` modifier\\n          fun next(): Any {\\n              return objects[0]\\n          }\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports the `inner` modifier on a class as redundant if it doesn't reference members of its outer class.\\n\\n**Example:**\\n\\n\\n      class Foo {\\n          inner class InnerClass { // redundant `inner` modifier\\n              fun hello() {\\n                  println(\\\"Hi!\\\")\\n              }\\n          }\\n      }\\n\\n      class List {\\n          val objects = Array<Any>(42) { Any() }\\n\\n          inner class Iterator { // Not redundant `inner` modifier\\n              fun next(): Any {\\n                  return objects[0]\\n              }\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      class Foo {\\n          class InnerClass { // redundant `inner` modifier\\n              fun hello() {\\n                  println(\\\"Hi!\\\")\\n              }\\n          }\\n      }\\n\\n      class List {\\n          val objects = Array<Any>(42) { Any() }\\n\\n          inner class Iterator { // Not redundant `inner` modifier\\n              fun next(): Any {\\n                  return objects[0]\\n              }\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantInnerClassModifier\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"JavaCollectionsStaticMethodOnImmutableList\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Call of Java mutator method on immutable Kotlin collection\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports Java mutator methods calls (like 'fill', 'reverse', 'shuffle', 'sort') on an immutable Kotlin collection. This can lead to 'UnsupportedOperationException' at runtime. Example: 'import java.util.Collections\\n\\n  fun test() {\\n      val immutableList = listOf(1, 2)\\n      Collections.reverse(immutableList)\\n  }' To fix the problem make the list mutable.\",\n" +
            "                  \"markdown\": \"Reports Java mutator methods calls (like `fill`, `reverse`, `shuffle`, `sort`) on an immutable Kotlin collection.\\n\\nThis can lead to `UnsupportedOperationException` at runtime.\\n\\n**Example:**\\n\\n\\n      import java.util.Collections\\n\\n      fun test() {\\n          val immutableList = listOf(1, 2)\\n          Collections.reverse(immutableList)\\n      }\\n\\nTo fix the problem make the list mutable.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"JavaCollectionsStaticMethodOnImmutableList\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Java interop issues\",\n" +
            "                      \"index\": 79,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"MavenCoroutinesDeprecation\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Incompatible kotlinx.coroutines dependency is used with Kotlin 1.3+ in Maven\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports kotlinx.coroutines library dependencies in Maven that should be updated in order to be compatible with Kotlin 1.3 and later.\",\n" +
            "                  \"markdown\": \"Reports **kotlinx.coroutines** library dependencies in Maven that should be updated in order to be compatible with Kotlin 1.3 and later.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"MavenCoroutinesDeprecation\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration/Maven\",\n" +
            "                      \"index\": 153,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"NullableBooleanElvis\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Equality check can be used instead of elvis for nullable boolean check\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports cases when an equality check should be used instead of the elvis operator. Example: 'fun check(a: Boolean? == null) {\\n    if (a ?: false) throw IllegalStateException()\\n}' After the quick-fix is applied: 'fun check(a: Boolean? == null) {\\n    if (a == true) throw IllegalStateException()\\n}'\",\n" +
            "                  \"markdown\": \"Reports cases when an equality check should be used instead of the elvis operator.\\n\\n**Example:**\\n\\n\\n    fun check(a: Boolean? == null) {\\n        if (a ?: false) throw IllegalStateException()\\n    }\\n\\nAfter the quick-fix is applied:\\n\\n\\n    fun check(a: Boolean? == null) {\\n        if (a == true) throw IllegalStateException()\\n    }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"NullableBooleanElvis\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UnnecessaryVariable\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unnecessary local variable\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports local variables that are used only in the very next 'return' statement or are exact copies of other variables. Such variables can be safely inlined to make the code more clear.\",\n" +
            "                  \"markdown\": \"Reports local variables that are used only in the very next `return` statement or are exact copies of other variables.\\n\\nSuch variables can be safely inlined to make the code more clear.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UnnecessaryVariable\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"DeprecatedMavenDependency\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Deprecated library is used in Maven\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports deprecated maven dependency. Example: '<dependencies>\\n    <dependency>\\n        <groupId>org.jetbrains.kotlin</groupId>\\n        <artifactId>kotlin-stdlib-jre7</artifactId>\\n        <version>${kotlin.version}</version>\\n    </dependency>\\n  </dependencies>' The quick fix changes the deprecated dependency to a maintained one: '<dependencies>\\n    <dependency>\\n        <groupId>org.jetbrains.kotlin</groupId>\\n        <artifactId>kotlin-stdlib-jdk7</artifactId>\\n        <version>${kotlin.version}</version>\\n    </dependency>\\n  </dependencies>'\",\n" +
            "                  \"markdown\": \"Reports deprecated maven dependency.\\n\\n**Example:**\\n\\n\\n      <dependencies>\\n        <dependency>\\n            <groupId>org.jetbrains.kotlin</groupId>\\n            <artifactId>kotlin-stdlib-jre7</artifactId>\\n            <version>${kotlin.version}</version>\\n        </dependency>\\n      </dependencies>\\n\\nThe quick fix changes the deprecated dependency to a maintained one:\\n\\n\\n       <dependencies>\\n        <dependency>\\n            <groupId>org.jetbrains.kotlin</groupId>\\n            <artifactId>kotlin-stdlib-jdk7</artifactId>\\n            <version>${kotlin.version}</version>\\n        </dependency>\\n      </dependencies>\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"DeprecatedMavenDependency\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin\",\n" +
            "                      \"index\": 1,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantEmptyInitializerBlock\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant empty initializer block\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant empty initializer blocks. Example: 'class Foo {\\n      init {\\n          // Empty init block\\n      }\\n  }' After the quick-fix is applied: 'class Foo {\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant empty initializer blocks.\\n\\n**Example:**\\n\\n\\n      class Foo {\\n          init {\\n              // Empty init block\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      class Foo {\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantEmptyInitializerBlock\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Other problems\",\n" +
            "                      \"index\": 60,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"GradleKotlinxCoroutinesDeprecation\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Incompatible kotlinx.coroutines dependency is used with Kotlin 1.3+ in Gradle\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'kotlinx.coroutines' library dependencies in Gradle that should be updated to be compatible with Kotlin 1.3+. Example: 'dependencies {\\n      implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:0.0.1'\\n  }' The quick fix changes the 'kotlinx.coroutines' library version to a compatible with Kotlin 1.3: 'dependencies {\\n      implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:0.27.0-eap13'\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `kotlinx.coroutines` library dependencies in Gradle that should be updated to be compatible with Kotlin 1.3+.\\n\\n**Example:**\\n\\n\\n      dependencies {\\n          implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:0.0.1'\\n      }\\n\\nThe quick fix changes the `kotlinx.coroutines` library version to a compatible with Kotlin 1.3:\\n\\n\\n      dependencies {\\n          implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:0.27.0-eap13'\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"GradleKotlinxCoroutinesDeprecation\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration/Gradle\",\n" +
            "                      \"index\": 161,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"WarningOnMainUnusedParameterMigration\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unused 'args' on 'main' since 1.4\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'main' function with an unused single parameter. Since Kotlin 1.4, it is possible to use the 'main' function without parameter as the entry point to the Kotlin program. The compiler reports a warning for the 'main' function with an unused parameter.\",\n" +
            "                  \"markdown\": \"Reports `main` function with an unused single parameter.\\n\\nSince Kotlin 1.4, it is possible to use the `main` function without parameter as the entry point to the Kotlin program.\\nThe compiler reports a warning for the `main` function with an unused parameter.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"WarningOnMainUnusedParameterMigration\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantWith\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant 'with' call\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant 'with' function calls that don't access anything from the receiver. Examples: 'class MyClass {\\n      fun f(): String = \\\"\\\"\\n  }\\n\\n  fun testRedundant() {\\n      with(c) { // <== 'with' is redundant since 'c' isn't used\\n          println(\\\"1\\\")\\n      }\\n  }\\n\\n  fun testOk() {\\n      val c = MyClass()\\n      with(c) { // <== OK because 'f()' is effectively 'c.f()'\\n          println(f())\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant `with` function calls that don't access anything from the receiver.\\n\\n**Examples:**\\n\\n\\n      class MyClass {\\n          fun f(): String = \\\"\\\"\\n      }\\n\\n      fun testRedundant() {\\n          with(c) { // <== 'with' is redundant since 'c' isn't used\\n              println(\\\"1\\\")\\n          }\\n      }\\n\\n      fun testOk() {\\n          val c = MyClass()\\n          with(c) { // <== OK because 'f()' is effectively 'c.f()'\\n              println(f())\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantWith\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantLabelMigration\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant label\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant labels which cause compilation errors since Kotlin 1.4. Since Kotlin 1.0, one can mark any statement with a label: 'fun foo() {\\n    L1@ val x = L2@bar()\\n  }' However, these labels can be referenced only in a limited number of ways: break / continue from a loop non-local return from an inline lambda or inline anonymous function sssss Such labels are prohibited since Kotlin 1.4. This inspection only reports if the Kotlin language level of the project or module is 1.4 or higher.\",\n" +
            "                  \"markdown\": \"Reports redundant labels which cause compilation errors since Kotlin 1.4.\\n\\nSince Kotlin 1.0, one can mark any statement with a label:\\n\\n\\n      fun foo() {\\n        L1@ val x = L2@bar()\\n      }\\n\\nHowever, these labels can be referenced only in a limited number of ways:\\n\\n* break / continue from a loop\\n* non-local return from an inline lambda or inline anonymous function\\nsssss\\n\\nSuch labels are prohibited since Kotlin 1.4.\\n\\nThis inspection only reports if the Kotlin language level of the project or module is 1.4 or higher.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantLabelMigration\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinRedundantDiagnosticSuppress\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant diagnostic suppression\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports usages of '@Suppress' annotations that can be safely removed because the compiler diagnostic they affect is no longer applicable in this context. Example: 'fun doSmth(@Suppress(\\\"UNUSED_PARAMETER\\\") used: Int) {\\n    println(used)\\n  }' After the quick-fix is applied: 'fun doSmth(used: Int) {\\n    println(used)\\n  }'\",\n" +
            "                  \"markdown\": \"Reports usages of `@Suppress` annotations that can be safely removed because the compiler diagnostic they affect is no longer applicable in this context.\\n\\n**Example:**\\n\\n\\n      fun doSmth(@Suppress(\\\"UNUSED_PARAMETER\\\") used: Int) {\\n        println(used)\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun doSmth(used: Int) {\\n        println(used)\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"KotlinRedundantDiagnosticSuppress\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceNegatedIsEmptyWithIsNotEmpty\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Negated call can be simplified\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports negation 'isEmpty()' and 'isNotEmpty()' for collections and 'String', or 'isBlank()' and 'isNotBlank()' for 'String'. Using corresponding functions makes your code simpler. The quick-fix replaces the negation call with the corresponding call from the Standard Library. Example: 'fun main() {\\n      val list = listOf(1,2,3)\\n      if (!list.isEmpty()) {\\n          // do smth\\n      }\\n  }' After the quick-fix is applied: 'fun main() {\\n      val list = listOf(1,2,3)\\n      if (list.isNotEmpty()) {\\n          // do smth\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports negation `isEmpty()` and `isNotEmpty()` for collections and `String`, or `isBlank()` and `isNotBlank()` for `String`.\\n\\nUsing corresponding functions makes your code simpler.\\n\\nThe quick-fix replaces the negation call with the corresponding call from the Standard Library.\\n\\n**Example:**\\n\\n\\n      fun main() {\\n          val list = listOf(1,2,3)\\n          if (!list.isEmpty()) {\\n              // do smth\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun main() {\\n          val list = listOf(1,2,3)\\n          if (list.isNotEmpty()) {\\n              // do smth\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceNegatedIsEmptyWithIsNotEmpty\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"DelegationToVarProperty\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Delegating to 'var' property\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports interface delegation to a 'var' property. Only initial value of a property is used for delegation, any later assignments do not affect it. Example: 'class Example(var text: CharSequence): CharSequence by text' The quick-fix replaces a property with immutable one: 'class Example(val text: CharSequence): CharSequence by text' Alternative way, if you rely on mutability for some reason: 'class Example(text: CharSequence): CharSequence by text {\\n      var text = text\\n  }'\",\n" +
            "                  \"markdown\": \"Reports interface delegation to a `var` property.\\n\\nOnly initial value of a property is used for delegation, any later assignments do not affect it.\\n\\n**Example:**\\n\\n\\n      class Example(var text: CharSequence): CharSequence by text\\n\\nThe quick-fix replaces a property with immutable one:\\n\\n\\n      class Example(val text: CharSequence): CharSequence by text\\n\\nAlternative way, if you rely on mutability for some reason:\\n\\n\\n      class Example(text: CharSequence): CharSequence by text {\\n          var text = text\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"DelegationToVarProperty\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ConstantConditionIf\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Condition of 'if' expression is constant\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'if' expressions that have 'true' or 'false' constant literal condition and can be simplified. While occasionally intended, this construction is confusing and often the result of a typo or previous refactoring. Example: 'fun example() {\\n      if (true) {\\n          throw IllegalStateException(\\\"Unexpected state\\\")\\n      }\\n  }' The quick-fix removes the 'if' condition: 'fun example() {\\n      throw IllegalStateException(\\\"Unexpected state\\\")\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `if` expressions that have `true` or `false` constant literal condition and can be simplified.\\n\\nWhile occasionally intended, this construction is confusing and often the result of a typo\\nor previous refactoring.\\n\\n**Example:**\\n\\n\\n      fun example() {\\n          if (true) {\\n              throw IllegalStateException(\\\"Unexpected state\\\")\\n          }\\n      }\\n\\nThe quick-fix removes the `if` condition:\\n\\n\\n      fun example() {\\n          throw IllegalStateException(\\\"Unexpected state\\\")\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ConstantConditionIf\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantLambdaArrow\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant lambda arrow\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant lambda arrows in lambdas without parameters. Example: 'fun foo(f: () -> Unit) = f()\\n\\n  fun bar() {\\n      foo { -> println(\\\"Hi!\\\") }\\n  }' After the quick-fix is applied: 'fun foo(f: () -> Unit) = f()\\n\\n  fun bar() {\\n      foo { println(\\\"Hi!\\\") }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant lambda arrows in lambdas without parameters.\\n\\n**Example:**\\n\\n\\n      fun foo(f: () -> Unit) = f()\\n\\n      fun bar() {\\n          foo { -> println(\\\"Hi!\\\") }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(f: () -> Unit) = f()\\n\\n      fun bar() {\\n          foo { println(\\\"Hi!\\\") }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantLambdaArrow\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinInternalInJava\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Usage of Kotlin internal declarations from Java\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports usages of Kotlin 'internal' declarations in Java code that is located in a different module. The 'internal' keyword is designed to restrict access to a class, function, or property from other modules. Due to JVM limitations, 'internal' classes, functions, and properties can still be accessed from outside Kotlin, which may later lead to compatibility problems.\",\n" +
            "                  \"markdown\": \"Reports usages of Kotlin `internal` declarations in Java code that is located in a different module.\\n\\n\\nThe `internal` keyword is designed to restrict access to a class, function, or property from other modules.\\nDue to JVM limitations, `internal` classes, functions, and properties can still be\\naccessed from outside Kotlin, which may later lead to compatibility problems.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"KotlinInternalInJava\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Java interop issues\",\n" +
            "                      \"index\": 79,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"NoConstructorMigration\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Forbidden constructor call\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports a constructor calls on functional supertypes that will lead to compilation error since 1.9. Motivation types: The implementation does not abide by a published spec or documentation More details: KT-46344: No error for a super class constructor call on a function interface in supertypes list The quick-fix removes a constructor call. Example: 'abstract class A : () -> Int()' After the quick-fix is applied: 'abstract class A : () -> Int' This inspection only reports if the Kotlin language level of the project or module is 1.7 or higher.\",\n" +
            "                  \"markdown\": \"Reports a constructor calls on functional supertypes that will lead to compilation error since 1.9.\\n\\nMotivation types:\\n\\n* The implementation does not abide by a published spec or documentation\\n\\n**More details:** [KT-46344: No error for a super class constructor call on a function interface in supertypes list](https://youtrack.jetbrains.com/issue/KT-46344)\\n\\nThe quick-fix removes a constructor call.\\n\\n**Example:**\\n\\n\\n      abstract class A : () -> Int()\\n\\nAfter the quick-fix is applied:\\n\\n\\n      abstract class A : () -> Int\\n\\nThis inspection only reports if the Kotlin language level of the project or module is 1.7 or higher.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"NoConstructorMigration\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantValueArgument\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant value argument\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports arguments that are equal to the default values of the corresponding parameters. Example: 'fun foo(x: Int, y: Int = 2) {}\\n\\nfun bar() {\\n    foo(1, 2)\\n}' After the quick-fix is applied: 'fun bar() {\\n    foo(1)\\n}'\",\n" +
            "                  \"markdown\": \"Reports arguments that are equal to the default values of the corresponding parameters.\\n\\n**Example:**\\n\\n\\n    fun foo(x: Int, y: Int = 2) {}\\n\\n    fun bar() {\\n        foo(1, 2)\\n    }\\n\\nAfter the quick-fix is applied:\\n\\n\\n    fun bar() {\\n        foo(1)\\n    }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantValueArgument\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UseWithIndex\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Manually incremented index variable can be replaced with use of 'withIndex()'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'for' loops with a manually incremented index variable. 'for' loops with a manually incremented index variable can be simplified with the 'withIndex()' function. Use withIndex() instead of manual index increment quick-fix can be used to amend the code automatically. Example: 'fun foo(list: List<String>): Int? {\\n      var index = 0\\n      for (s in list) { <== can be simplified\\n          val x = s.length * index\\n          index++\\n          if (x > 0) return x\\n      }\\n      return null\\n  }' After the quick-fix is applied: 'fun foo(list: List<String>): Int? {\\n      for ((index, s) in list.withIndex()) {\\n          val x = s.length * index\\n          if (x > 0) return x\\n      }\\n      return null\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `for` loops with a manually incremented index variable.\\n\\n`for` loops with a manually incremented index variable can be simplified with the `withIndex()` function.\\n\\n**Use withIndex() instead of manual index increment** quick-fix can be used to amend the code automatically.\\n\\nExample:\\n\\n\\n      fun foo(list: List<String>): Int? {\\n          var index = 0\\n          for (s in list) { <== can be simplified\\n              val x = s.length * index\\n              index++\\n              if (x > 0) return x\\n          }\\n          return null\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(list: List<String>): Int? {\\n          for ((index, s) in list.withIndex()) {\\n              val x = s.length * index\\n              if (x > 0) return x\\n          }\\n          return null\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UseWithIndex\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ImplicitThis\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Implicit 'this'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports usages of implicit this. Example: 'class Foo {\\n      fun s() = \\\"\\\"\\n\\n      fun test() {\\n          s()\\n      }\\n  }' The quick fix specifies this explicitly: 'class Foo {\\n      fun s() = \\\"\\\"\\n\\n      fun test() {\\n          this.s()\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports usages of implicit **this** .\\n\\n**Example:**\\n\\n\\n      class Foo {\\n          fun s() = \\\"\\\"\\n\\n          fun test() {\\n              s()\\n          }\\n      }\\n\\nThe quick fix specifies **this** explicitly:\\n\\n\\n      class Foo {\\n          fun s() = \\\"\\\"\\n\\n          fun test() {\\n              this.s()\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ImplicitThis\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinCatchMayIgnoreException\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'catch' block may ignore exception\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'catch' blocks that are empty or may ignore an exception. While occasionally intended, empty 'catch' blocks may complicate debugging. Also, ignoring a 'catch' parameter might be wrong. The inspection won't report any 'catch' parameters named 'ignore', 'ignored', or '_'. You can use the quick-fix to change the exception name to '_'. Example: 'try {\\n    throwingMethod()\\n  } catch (ex: IOException) {\\n\\n  }' After the quick-fix is applied: 'try {\\n    throwingMethod()\\n  } catch (_: IOException) {\\n\\n  }' Use the Do not warn when 'catch' block contains a comment option to ignore 'catch' blocks with comments.\",\n" +
            "                  \"markdown\": \"Reports `catch` blocks that are empty or may ignore an exception.\\n\\nWhile occasionally intended, empty `catch` blocks may complicate debugging.\\nAlso, ignoring a `catch` parameter might be wrong.\\n\\n\\nThe inspection won't report any `catch` parameters named `ignore`, `ignored`, or `_`.\\n\\n\\nYou can use the quick-fix to change the exception name to `_`.\\n\\n**Example:**\\n\\n\\n      try {\\n        throwingMethod()\\n      } catch (ex: IOException) {\\n\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      try {\\n        throwingMethod()\\n      } catch (_: IOException) {\\n\\n      }\\n\\nUse the **Do not warn when 'catch' block contains a comment** option to ignore `catch` blocks with comments.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"CatchMayIgnoreException\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"DifferentStdlibGradleVersion\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Kotlin library and Gradle plugin versions are different\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports different Kotlin stdlib and compiler versions. Example: 'dependencies {\\n    classpath \\\"org.jetbrains.kotlin:kotlin-stdlib:0.0.1\\\"\\n  }' To fix the problem change the kotlin stdlib version to match the kotlin compiler version.\",\n" +
            "                  \"markdown\": \"Reports different Kotlin stdlib and compiler versions.\\n\\n**Example:**\\n\\n\\n      dependencies {\\n        classpath \\\"org.jetbrains.kotlin:kotlin-stdlib:0.0.1\\\"\\n      }\\n\\nTo fix the problem change the kotlin stdlib version to match the kotlin compiler version.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"DifferentStdlibGradleVersion\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin\",\n" +
            "                      \"index\": 1,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"CanBeVal\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Local 'var' is never modified and can be declared as 'val'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports local variables declared with the 'var' keyword that are never modified. Kotlin encourages to declare practically immutable variables using the 'val' keyword, ensuring that their value will never change. Example: 'fun example() {\\n      var primeNumbers = listOf(1, 2, 3, 5, 7, 11, 13)\\n      var fibonacciNumbers = listOf(1, 1, 2, 3, 5, 8, 13)\\n      print(\\\"Same numbers: \\\" + primeNumbers.intersect(fibonacciNumbers))\\n  }' The quick-fix replaces the 'var' keyword with 'val': 'fun example() {\\n      val primeNumbers = listOf(1, 2, 3, 5, 7, 11, 13)\\n      val fibonacciNumbers = listOf(1, 1, 2, 3, 5, 8, 13)\\n      print(\\\"Same numbers: \\\" + primeNumbers.intersect(fibonacciNumbers))\\n  }'\",\n" +
            "                  \"markdown\": \"Reports local variables declared with the `var` keyword that are never modified.\\n\\nKotlin encourages to declare practically immutable variables using the `val` keyword, ensuring that their value will never change.\\n\\n**Example:**\\n\\n\\n      fun example() {\\n          var primeNumbers = listOf(1, 2, 3, 5, 7, 11, 13)\\n          var fibonacciNumbers = listOf(1, 1, 2, 3, 5, 8, 13)\\n          print(\\\"Same numbers: \\\" + primeNumbers.intersect(fibonacciNumbers))\\n      }\\n\\nThe quick-fix replaces the `var` keyword with `val`:\\n\\n\\n      fun example() {\\n          val primeNumbers = listOf(1, 2, 3, 5, 7, 11, 13)\\n          val fibonacciNumbers = listOf(1, 1, 2, 3, 5, 8, 13)\\n          print(\\\"Same numbers: \\\" + primeNumbers.intersect(fibonacciNumbers))\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"CanBeVal\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceWithIgnoreCaseEquals\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Should be replaced with 'equals(..., ignoreCase = true)'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports case-insensitive comparisons that can be replaced with 'equals(..., ignoreCase = true)'. By using 'equals()' you don't have to allocate extra strings with 'toLowerCase()' or 'toUpperCase()' to compare strings. The quick-fix replaces the case-insensitive comparison that uses 'toLowerCase()' or 'toUpperCase()' with 'equals(..., ignoreCase = true)'. Note: May change semantics for some locales. Example: 'fun main() {\\n      val a = \\\"KoTliN\\\"\\n      val b = \\\"KOTLIN\\\"\\n      println(a.toLowerCase() == b.toLowerCase())\\n  }' After the quick-fix is applied: 'fun main() {\\n      val a = \\\"KoTliN\\\"\\n      val b = \\\"KOTLIN\\\"\\n      println(a.equals(b, ignoreCase = true))\\n  }'\",\n" +
            "                  \"markdown\": \"Reports case-insensitive comparisons that can be replaced with `equals(..., ignoreCase = true)`.\\n\\nBy using `equals()` you don't have to allocate extra strings with `toLowerCase()` or `toUpperCase()` to compare strings.\\n\\nThe quick-fix replaces the case-insensitive comparison that uses `toLowerCase()` or `toUpperCase()` with `equals(..., ignoreCase = true)`.\\n\\n**Note:** May change semantics for some locales.\\n\\n**Example:**\\n\\n\\n      fun main() {\\n          val a = \\\"KoTliN\\\"\\n          val b = \\\"KOTLIN\\\"\\n          println(a.toLowerCase() == b.toLowerCase())\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun main() {\\n          val a = \\\"KoTliN\\\"\\n          val b = \\\"KOTLIN\\\"\\n          println(a.equals(b, ignoreCase = true))\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceWithIgnoreCaseEquals\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceSubstringWithSubstringAfter\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'substring' call should be replaced with 'substringAfter'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls like 's.substring(s.indexOf(x))' that can be replaced with 's.substringAfter(x)'. Using 's.substringAfter(x)' makes your code simpler. The quick-fix replaces the 'substring' call with 'substringAfter'. Example: 'fun foo(s: String) {\\n      s.substring(s.indexOf('x'))\\n  }' After the quick-fix is applied: 'fun foo(s: String) {\\n      s.substringAfter('x')\\n  }'\",\n" +
            "                  \"markdown\": \"Reports calls like `s.substring(s.indexOf(x))` that can be replaced with `s.substringAfter(x)`.\\n\\nUsing `s.substringAfter(x)` makes your code simpler.\\n\\nThe quick-fix replaces the `substring` call with `substringAfter`.\\n\\n**Example:**\\n\\n\\n      fun foo(s: String) {\\n          s.substring(s.indexOf('x'))\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(s: String) {\\n          s.substringAfter('x')\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceSubstringWithSubstringAfter\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantCompanionReference\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant 'Companion' reference\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant 'Companion' reference. Example: 'class A {\\n      companion object {\\n          fun create() = A()\\n      }\\n  }\\n  fun test() {\\n      val s = A.Companion.create()\\n  }' After the quick-fix is applied: 'class A {\\n      companion object {\\n          fun create() = A()\\n      }\\n  }\\n  fun test() {\\n      val s = A.create()\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant `Companion` reference.\\n\\n**Example:**\\n\\n\\n      class A {\\n          companion object {\\n              fun create() = A()\\n          }\\n      }\\n      fun test() {\\n          val s = A.Companion.create()\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      class A {\\n          companion object {\\n              fun create() = A()\\n          }\\n      }\\n      fun test() {\\n          val s = A.create()\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantCompanionReference\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KDocUnresolvedReference\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unresolved reference in KDoc\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports unresolved references in KDoc comments. Example: '/**\\n   * [unresolvedLink]\\n   */\\n  fun foo() {}' To fix the problem make the link valid.\",\n" +
            "                  \"markdown\": \"Reports unresolved references in KDoc comments.\\n\\n**Example:**\\n\\n\\n      /**\\n       * [unresolvedLink]\\n       */\\n      fun foo() {}\\n\\nTo fix the problem make the link valid.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"KDocUnresolvedReference\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"NestedLambdaShadowedImplicitParameter\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Nested lambda has shadowed implicit parameter\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports nested lambdas with shadowed implicit parameters. Example: 'fun foo(listOfLists: List<List<String>>) {\\n  listOfLists.forEach {\\n    it.forEach {\\n      println(it)\\n    }\\n  }\\n}' After the quick-fix is applied: 'fun foo(listOfLists: List<List<String>>) {\\n  listOfLists.forEach {\\n    it.forEach { it1 ->\\n      println(it1)\\n    }\\n  }\\n}'\",\n" +
            "                  \"markdown\": \"Reports nested lambdas with shadowed implicit parameters.\\n\\n**Example:**\\n\\n\\n    fun foo(listOfLists: List<List<String>>) {\\n      listOfLists.forEach {\\n        it.forEach {\\n          println(it)\\n        }\\n      }\\n    }\\n\\nAfter the quick-fix is applied:\\n\\n\\n    fun foo(listOfLists: List<List<String>>) {\\n      listOfLists.forEach {\\n        it.forEach { it1 ->\\n          println(it1)\\n        }\\n      }\\n    }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"NestedLambdaShadowedImplicitParameter\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantSamConstructor\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant SAM constructor\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports SAM (Single Abstract Method) constructor usages which can be replaced with lambdas. Example: 'fun main() {\\n      foo(Runnable { println(\\\"Hi!\\\") })\\n  }\\n\\n  fun foo(other: Runnable) {}' After the quick-fix is applied: 'fun main() {\\n      foo( { println(\\\"Hi!\\\") })\\n  }\\n\\n  fun foo(other: Runnable) {}'\",\n" +
            "                  \"markdown\": \"Reports SAM (Single Abstract Method) constructor usages which can be replaced with lambdas.\\n\\n**Example:**\\n\\n\\n      fun main() {\\n          foo(Runnable { println(\\\"Hi!\\\") })\\n      }\\n\\n      fun foo(other: Runnable) {}\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun main() {\\n          foo( { println(\\\"Hi!\\\") })\\n      }\\n\\n      fun foo(other: Runnable) {}\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantSamConstructor\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"InconsistentCommentForJavaParameter\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Inconsistent comment for Java parameter\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports inconsistent parameter names for Java method calls specified in a comment block. Examples: '// Java\\n  public class JavaService {\\n      public void invoke(String command) {}\\n  }' '// Kotlin\\n  fun main() {\\n      JavaService().invoke(/* name = */ \\\"fix\\\")\\n  }' The quick fix corrects the parameter name in the comment block: 'fun main() {\\n      JavaService().invoke(/* command = */ \\\"fix\\\")\\n  }'\",\n" +
            "                  \"markdown\": \"Reports inconsistent parameter names for **Java** method calls specified in a comment block.\\n\\n**Examples:**\\n\\n\\n      // Java\\n      public class JavaService {\\n          public void invoke(String command) {}\\n      }\\n\\n\\n      // Kotlin\\n      fun main() {\\n          JavaService().invoke(/* name = */ \\\"fix\\\")\\n      }\\n\\nThe quick fix corrects the parameter name in the comment block:\\n\\n\\n      fun main() {\\n          JavaService().invoke(/* command = */ \\\"fix\\\")\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"InconsistentCommentForJavaParameter\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Naming conventions\",\n" +
            "                      \"index\": 71,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveRedundantCallsOfConversionMethods\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant call of conversion method\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant calls to conversion methods (for example, 'toString()' on a 'String' or 'toDouble()' on a 'Double'). Use the 'Remove redundant calls of the conversion method' quick-fix to clean up the code.\",\n" +
            "                  \"markdown\": \"Reports redundant calls to conversion methods (for example, `toString()` on a `String` or `toDouble()` on a `Double`).\\n\\nUse the 'Remove redundant calls of the conversion method' quick-fix to clean up the code.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveRedundantCallsOfConversionMethods\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinThrowableNotThrown\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Throwable not thrown\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports instantiations of 'Throwable' or its subclasses, when the created 'Throwable' is never actually thrown. The reported code indicates mistakes that are hard to catch in tests. Also, this inspection reports method calls that return instances of 'Throwable' or its subclasses, when the resulting 'Throwable' instance is not thrown. Example: 'fun check(condition: Boolean) {\\n      if (!condition) /* throw is missing here */ IllegalArgumentException(\\\"condition is not met\\\");\\n  }\\n\\n  fun createError() = RuntimeException()\\n\\n  fun foo() {\\n      /* throw is missing here */ createError()\\n  }'\",\n" +
            "                  \"markdown\": \"Reports instantiations of `Throwable` or its subclasses, when the created `Throwable` is never actually thrown.\\n\\nThe reported code indicates mistakes that are hard to catch in tests.\\n\\n\\nAlso, this inspection reports method calls that return instances of `Throwable` or its subclasses,\\nwhen the resulting `Throwable` instance is not thrown.\\n\\n**Example:**\\n\\n\\n      fun check(condition: Boolean) {\\n          if (!condition) /* throw is missing here */ IllegalArgumentException(\\\"condition is not met\\\");\\n      }\\n\\n      fun createError() = RuntimeException()\\n\\n      fun foo() {\\n          /* throw is missing here */ createError()\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ThrowableNotThrown\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinSealedInheritorsInJava\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Inheritance of Kotlin sealed interface/class from Java\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports attempts to inherit from Kotlin sealed interfaces or classes in Java code. Example: '// Kotlin file: MathExpression.kt\\n\\nsealed class MathExpression\\n\\ndata class Const(val number: Double) : MathExpression()\\ndata class Sum(val e1: MathExpression, val e2: MathExpression) : MathExpression()' '// Java file: NotANumber.java\\n\\npublic class NotANumber extends MathExpression {\\n}'\",\n" +
            "                  \"markdown\": \"Reports attempts to inherit from Kotlin sealed interfaces or classes in Java code.\\n\\n**Example:**\\n\\n\\n    // Kotlin file: MathExpression.kt\\n\\n    sealed class MathExpression\\n\\n    data class Const(val number: Double) : MathExpression()\\n    data class Sum(val e1: MathExpression, val e2: MathExpression) : MathExpression()\\n\\n\\n    // Java file: NotANumber.java\\n\\n    public class NotANumber extends MathExpression {\\n    }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"KotlinSealedInheritorsInJava\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Java interop issues\",\n" +
            "                      \"index\": 79,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SimplifyNegatedBinaryExpression\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Negated boolean expression can be simplified\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports negated boolean expressions that can be simplified. The quick-fix simplifies the boolean expression. Example: 'fun test(n: Int) {\\n        !(0 == 1)\\n    }' After the quick-fix is applied: 'fun test(n: Int) {\\n        0 != 1\\n    }' Please note that this action may change code semantics if IEEE-754 NaN values are involved: 'fun main() {\\n        println(!(Double.NaN >= 0)) // true\\n    }' After the quick-fix is applied: 'fun main() {\\n        println(Double.NaN < 0) // false\\n    }'\",\n" +
            "                  \"markdown\": \"Reports negated boolean expressions that can be simplified.\\n\\nThe quick-fix simplifies the boolean expression.\\n\\n**Example:**\\n\\n\\n        fun test(n: Int) {\\n            !(0 == 1)\\n        }\\n\\nAfter the quick-fix is applied:\\n\\n\\n        fun test(n: Int) {\\n            0 != 1\\n        }\\n\\nPlease note that this action may change code semantics if IEEE-754 NaN values are involved:\\n\\n\\n        fun main() {\\n            println(!(Double.NaN >= 0)) // true\\n        }\\n\\nAfter the quick-fix is applied:\\n\\n\\n        fun main() {\\n            println(Double.NaN < 0) // false\\n        }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SimplifyNegatedBinaryExpression\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"MemberVisibilityCanBePrivate\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Class member can have 'private' visibility\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports declarations that can be made 'private' to follow the encapsulation principle. Example: 'class Service(val url: String) {\\n    fun connect(): URLConnection = URL(url).openConnection()\\n}' After the quick-fix is applied (considering there are no usages of 'url' outside of 'Service' class): 'class Service(private val url: String) {\\n    fun connect(): URLConnection = URL(url).openConnection()\\n}'\",\n" +
            "                  \"markdown\": \"Reports declarations that can be made `private` to follow the encapsulation principle.\\n\\n**Example:**\\n\\n\\n    class Service(val url: String) {\\n        fun connect(): URLConnection = URL(url).openConnection()\\n    }\\n\\nAfter the quick-fix is applied (considering there are no usages of `url` outside of `Service` class):\\n\\n\\n    class Service(private val url: String) {\\n        fun connect(): URLConnection = URL(url).openConnection()\\n    }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"MemberVisibilityCanBePrivate\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SelfAssignment\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant assignment\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports assignments of a variable to itself. The quick-fix removes the redundant assignment. Example: 'fun test() {\\n      var bar = 1\\n      bar = bar\\n  }' After the quick-fix is applied: 'fun test() {\\n      var bar = 1\\n  }'\",\n" +
            "                  \"markdown\": \"Reports assignments of a variable to itself.\\n\\nThe quick-fix removes the redundant assignment.\\n\\n**Example:**\\n\\n\\n      fun test() {\\n          var bar = 1\\n          bar = bar\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test() {\\n          var bar = 1\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SelfAssignment\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RecursiveEqualsCall\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Recursive equals call\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports recursive 'equals'('==') calls. In Kotlin, '==' compares object values by calling 'equals' method under the hood. '===', on the other hand, compares objects by reference. '===' is commonly used in 'equals' method implementation. But '===' may be mistakenly mixed up with '==' leading to infinite recursion. Example: 'class X {\\n      override fun equals(other: Any?): Boolean {\\n          if (this == other) return true\\n          return false\\n      }\\n  }' After the quick-fix is applied: 'class X {\\n      override fun equals(other: Any?): Boolean {\\n          if (this === other) return true\\n          return false\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports recursive `equals`(`==`) calls.\\n\\n\\nIn Kotlin, `==` compares object values by calling `equals` method under the hood.\\n`===`, on the other hand, compares objects by reference.\\n\\n\\n`===` is commonly used in `equals` method implementation.\\nBut `===` may be mistakenly mixed up with `==` leading to infinite recursion.\\n\\n**Example:**\\n\\n\\n      class X {\\n          override fun equals(other: Any?): Boolean {\\n              if (this == other) return true\\n              return false\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      class X {\\n          override fun equals(other: Any?): Boolean {\\n              if (this === other) return true\\n              return false\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RecursiveEqualsCall\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ExplicitThis\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant explicit 'this'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports an explicit 'this' when it can be omitted. Example: 'class C {\\n      private val i = 1\\n      fun f() = this.i\\n  }' The quick-fix removes the redundant 'this': 'class C {\\n      private val i = 1\\n      fun f() = i\\n  }'\",\n" +
            "                  \"markdown\": \"Reports an explicit `this` when it can be omitted.\\n\\n**Example:**\\n\\n\\n      class C {\\n          private val i = 1\\n          fun f() = this.i\\n      }\\n\\nThe quick-fix removes the redundant `this`:\\n\\n\\n      class C {\\n          private val i = 1\\n          fun f() = i\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ExplicitThis\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"NullChecksToSafeCall\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Null-checks can be replaced with safe-calls\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports chained null-checks that can be replaced with safe-calls. Example: 'fun test(my: My?) {\\n      if (my != null && my.foo() != null) {}\\n  }' After the quick-fix is applied: 'fun test(my: My?) {\\n      if (my?.foo() != null) {}\\n  }'\",\n" +
            "                  \"markdown\": \"Reports chained null-checks that can be replaced with safe-calls.\\n\\n**Example:**\\n\\n\\n      fun test(my: My?) {\\n          if (my != null && my.foo() != null) {}\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test(my: My?) {\\n          if (my?.foo() != null) {}\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"NullChecksToSafeCall\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UnusedMainParameter\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Main parameter is not necessary\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'main' function with an unused single parameter.\",\n" +
            "                  \"markdown\": \"Reports `main` function with an unused single parameter.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UnusedMainParameter\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"FunctionWithLambdaExpressionBody\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Function with '= { ... }' and inferred return type\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports functions with '= { ... }' and inferred return type. Example: 'fun sum(a: Int, b: Int) = { a + b } // The return type of this function is '() -> Int'.' The quick fix removes braces: 'fun sum(a: Int, b: Int) = a + b'\",\n" +
            "                  \"markdown\": \"Reports functions with `= { ... }` and inferred return type.\\n\\n**Example:**\\n\\n\\n      fun sum(a: Int, b: Int) = { a + b } // The return type of this function is '() -> Int'.\\n\\nThe quick fix removes braces:\\n\\n\\n      fun sum(a: Int, b: Int) = a + b\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"FunctionWithLambdaExpressionBody\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ArrayInDataClass\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Array property in data class\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports properties with an 'Array' type in a 'data' class without overridden 'equals()' or 'hashCode()'. Array parameters are compared by reference equality, which is likely an unexpected behavior. It is strongly recommended to override 'equals()' and 'hashCode()' in such cases. Example: 'data class Text(val lines: Array<String>)' The quick-fix generates missing 'equals()' and 'hashCode()' implementations: 'data class Text(val lines: Array<String>) {\\n      override fun equals(other: Any?): Boolean {\\n          if (this === other) return true\\n          if (javaClass != other?.javaClass) return false\\n\\n          other as Text\\n\\n          if (!lines.contentEquals(other.lines)) return false\\n\\n          return true\\n      }\\n\\n      override fun hashCode(): Int {\\n          return lines.contentHashCode()\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports properties with an `Array` type in a `data` class without overridden `equals()` or `hashCode()`.\\n\\n\\nArray parameters are compared by reference equality, which is likely an unexpected behavior.\\nIt is strongly recommended to override `equals()` and `hashCode()` in such cases.\\n\\n**Example:**\\n\\n\\n      data class Text(val lines: Array<String>)\\n\\nThe quick-fix generates missing `equals()` and `hashCode()` implementations:\\n\\n\\n      data class Text(val lines: Array<String>) {\\n          override fun equals(other: Any?): Boolean {\\n              if (this === other) return true\\n              if (javaClass != other?.javaClass) return false\\n\\n              other as Text\\n\\n              if (!lines.contentEquals(other.lines)) return false\\n\\n              return true\\n          }\\n\\n          override fun hashCode(): Int {\\n              return lines.contentHashCode()\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ArrayInDataClass\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ConvertTwoComparisonsToRangeCheck\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Two comparisons should be converted to a range check\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports two consecutive comparisons that can be converted to a range check. Checking against a range makes code simpler by removing test subject duplication. Example: 'fun checkMonth(month: Int): Boolean {\\n      return month >= 1 && month <= 12\\n  }' The quick-fix replaces the comparison-based check with a range one: 'fun checkMonth(month: Int): Boolean {\\n      return month in 1..12\\n  }'\",\n" +
            "                  \"markdown\": \"Reports two consecutive comparisons that can be converted to a range check.\\n\\nChecking against a range makes code simpler by removing test subject duplication.\\n\\n**Example:**\\n\\n\\n      fun checkMonth(month: Int): Boolean {\\n          return month >= 1 && month <= 12\\n      }\\n\\nThe quick-fix replaces the comparison-based check with a range one:\\n\\n\\n      fun checkMonth(month: Int): Boolean {\\n          return month in 1..12\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ConvertTwoComparisonsToRangeCheck\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"LocalVariableName\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Local variable naming convention\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports local variables that do not follow the naming conventions. You can specify the required pattern in the inspection options. Recommended naming conventions: it has to start with a lowercase letter, use camel case and no underscores. Example: 'fun fibonacciNumber(index: Int): Long = when(index) {\\n      0 -> 0\\n      else -> {\\n          // does not follow naming conventions: contains underscore symbol (`_`)\\n          var number_one: Long = 0\\n          // does not follow naming conventions: starts with an uppercase letter\\n          var NUMBER_TWO: Long = 1\\n          // follow naming conventions: starts with a lowercase letter, use camel case and no underscores.\\n          var numberThree: Long = number_one + NUMBER_TWO\\n\\n          for(currentIndex in 2..index) {\\n              numberThree = number_one + NUMBER_TWO\\n              number_one = NUMBER_TWO\\n              NUMBER_TWO = numberThree\\n          }\\n          numberThree\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports local variables that do not follow the naming conventions.\\n\\nYou can specify the required pattern in the inspection options.\\n\\n[Recommended naming conventions](https://kotlinlang.org/docs/coding-conventions.html#function-names): it has to start with a lowercase letter, use camel case and no underscores.\\n\\n**Example:**\\n\\n\\n      fun fibonacciNumber(index: Int): Long = when(index) {\\n          0 -> 0\\n          else -> {\\n              // does not follow naming conventions: contains underscore symbol (`_`)\\n              var number_one: Long = 0\\n              // does not follow naming conventions: starts with an uppercase letter\\n              var NUMBER_TWO: Long = 1\\n              // follow naming conventions: starts with a lowercase letter, use camel case and no underscores.\\n              var numberThree: Long = number_one + NUMBER_TWO\\n\\n              for(currentIndex in 2..index) {\\n                  numberThree = number_one + NUMBER_TWO\\n                  number_one = NUMBER_TWO\\n                  NUMBER_TWO = numberThree\\n              }\\n              numberThree\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"LocalVariableName\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Naming conventions\",\n" +
            "                      \"index\": 71,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceUntilWithRangeUntil\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Replace 'until' with '..<' operator\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'until' that can be replaced with '..<' operator. Every 'until' to '..<' replacement doesn't change the semantic in any way. The UX research shows that developers make ~20-30% fewer errors when reading code containing '..<' compared to 'until'. Example: 'fun main(args: Array<String>) {\\n      for (index in 0 until args.size) {\\n          println(index)\\n      }\\n  }' After the quick-fix is applied: 'fun main(args: Array<String>) {\\n      for (index in 0..<args.size) {\\n          println(index)\\n      }\\n  }' This inspection only reports if the Kotlin language level of the project or module is 1.7 or higher.\",\n" +
            "                  \"markdown\": \"Reports `until` that can be replaced with `..<` operator.\\n\\nEvery `until` to `..<` replacement doesn't change the semantic in any way.\\n\\nThe UX research shows that developers make \\\\~20-30% fewer errors when reading code containing `..<` compared to `until`.\\n\\n**Example:**\\n\\n\\n      fun main(args: Array<String>) {\\n          for (index in 0 until args.size) {\\n              println(index)\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun main(args: Array<String>) {\\n          for (index in 0..<args.size) {\\n              println(index)\\n          }\\n      }\\n\\nThis inspection only reports if the Kotlin language level of the project or module is 1.7 or higher.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceUntilWithRangeUntil\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveRedundantQualifierName\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant qualifier name\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant qualifiers (or their parts) on class names, functions, and properties. A fully qualified name is an unambiguous identifier that specifies which object, function, or property a call refers to. In the contexts where the name can be shortened, the inspection informs on the opportunity and the associated 'Remove redundant qualifier name' quick-fix allows amending the code. Examples: 'package my.simple.name\\n  import kotlin.Int.Companion.MAX_VALUE\\n\\n  class Foo\\n\\n  fun main() {\\n      val a = my.simple.name.Foo()    // 'Foo' resides in the declared 'my.simple.name' package, qualifier is redundant\\n      val b = kotlin.Int.MAX_VALUE    // Can be replaced with 'MAX_VALUE' since it's imported\\n      val c = kotlin.Double.MAX_VALUE // Can be replaced with 'Double.MAX_VALUE' since built-in types are imported automatically\\n  }' After the quick-fix is applied: 'package my.simple.name\\n  import kotlin.Int.Companion.MAX_VALUE\\n\\n  class Foo\\n\\n  fun main() {\\n      val a = Foo()\\n      val b = MAX_VALUE\\n      val c = Double.MAX_VALUE\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant qualifiers (or their parts) on class names, functions, and properties.\\n\\n\\nA fully qualified name is an unambiguous identifier that specifies which object, function, or property a call refers to.\\nIn the contexts where the name can be shortened, the inspection informs on the opportunity and the associated\\n'Remove redundant qualifier name' quick-fix allows amending the code.\\n\\n**Examples:**\\n\\n\\n      package my.simple.name\\n      import kotlin.Int.Companion.MAX_VALUE\\n\\n      class Foo\\n\\n      fun main() {\\n          val a = my.simple.name.Foo()    // 'Foo' resides in the declared 'my.simple.name' package, qualifier is redundant\\n          val b = kotlin.Int.MAX_VALUE    // Can be replaced with 'MAX_VALUE' since it's imported\\n          val c = kotlin.Double.MAX_VALUE // Can be replaced with 'Double.MAX_VALUE' since built-in types are imported automatically\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      package my.simple.name\\n      import kotlin.Int.Companion.MAX_VALUE\\n\\n      class Foo\\n\\n      fun main() {\\n          val a = Foo()\\n          val b = MAX_VALUE\\n          val c = Double.MAX_VALUE\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveRedundantQualifierName\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveCurlyBracesFromTemplate\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant curly braces in string template\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports usages of curly braces in string templates around simple identifiers. Use the 'Remove curly braces' quick-fix to remove the redundant braces. Examples: 'fun redundant() {\\n     val x = 4\\n     val y = \\\"${x}\\\" // <== redundant\\n  }\\n\\n  fun correctUsage() {\\n      val x = \\\"x\\\"\\n      val y = \\\"${x.length}\\\" // <== Ok\\n  }' After the quick-fix is applied: 'fun redundant() {\\n     val x = 4\\n     val y = \\\"$x\\\"\\n  }\\n\\n  fun correctUsage() {\\n      val x = \\\"x\\\" <== Updated\\n      val y = \\\"${x.length}\\\"\\n  }'\",\n" +
            "                  \"markdown\": \"Reports usages of curly braces in string templates around simple identifiers.\\n\\nUse the 'Remove curly braces' quick-fix to remove the redundant braces.\\n\\n**Examples:**\\n\\n\\n      fun redundant() {\\n         val x = 4\\n         val y = \\\"${x}\\\" // <== redundant\\n      }\\n\\n      fun correctUsage() {\\n          val x = \\\"x\\\"\\n          val y = \\\"${x.length}\\\" // <== Ok\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun redundant() {\\n         val x = 4\\n         val y = \\\"$x\\\"\\n      }\\n\\n      fun correctUsage() {\\n          val x = \\\"x\\\" <== Updated\\n          val y = \\\"${x.length}\\\"\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveCurlyBracesFromTemplate\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceSubstringWithIndexingOperation\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'substring' call should be replaced with indexing operator\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls like '\\\"abc\\\".substring(0, 1)' that can be replaced with '\\\"abc\\\"[0]'. Obtaining the element by index makes your code simpler. The quick-fix replaces the 'substring' call with the indexing operator. Example: 'fun foo() {\\n      \\\"abc\\\".substring(0, 1)\\n  }' After the quick-fix is applied: 'fun foo() {\\n      \\\"abc\\\"[0]\\n  }'\",\n" +
            "                  \"markdown\": \"Reports calls like `\\\"abc\\\".substring(0, 1)` that can be replaced with `\\\"abc\\\"[0]`.\\n\\nObtaining the element by index makes your code simpler.\\n\\nThe quick-fix replaces the `substring` call with the indexing operator.\\n\\n**Example:**\\n\\n\\n      fun foo() {\\n          \\\"abc\\\".substring(0, 1)\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo() {\\n          \\\"abc\\\"[0]\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceSubstringWithIndexingOperation\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"MoveLambdaOutsideParentheses\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Lambda argument inside parentheses\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports lambda expressions in parentheses which can be moved outside. Example: 'fun square(a: Int, b: (Int) -> Int) {\\n  b(a * a)\\n}\\n\\nfun foo() {\\n  square(2, { it })\\n}' After the quick-fix is applied: 'fun foo() {\\n  square(2){ it }\\n}'\",\n" +
            "                  \"markdown\": \"Reports lambda expressions in parentheses which can be moved outside.\\n\\n**Example:**\\n\\n\\n    fun square(a: Int, b: (Int) -> Int) {\\n      b(a * a)\\n    }\\n\\n    fun foo() {\\n      square(2, { it })\\n    }\\n\\nAfter the quick-fix is applied:\\n\\n\\n    fun foo() {\\n      square(2){ it }\\n    }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"MoveLambdaOutsideParentheses\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ProhibitTypeParametersForLocalVariablesMigration\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Local variable with type parameters\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports local variables with type parameters. A type parameter for a local variable doesn't make sense because it can't be specialized. Example: 'fun main() {\\n      val <T> x = \\\"\\\"\\n  }' After the quick-fix is applied: 'fun main() {\\n      val x = \\\"\\\"\\n  }' This inspection only reports if the Kotlin language level of the project or module is 1.4 or higher.\",\n" +
            "                  \"markdown\": \"Reports local variables with type parameters.\\n\\nA type parameter for a local variable doesn't make sense because it can't be specialized.\\n\\n**Example:**\\n\\n\\n      fun main() {\\n          val <T> x = \\\"\\\"\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun main() {\\n          val x = \\\"\\\"\\n      }\\n\\nThis inspection only reports if the Kotlin language level of the project or module is 1.4 or higher.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ProhibitTypeParametersForLocalVariablesMigration\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"TestFunctionName\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Test function naming convention\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports test function names that do not follow the recommended naming conventions.\",\n" +
            "                  \"markdown\": \"Reports test function names that do not follow the [recommended naming conventions](https://kotlinlang.org/docs/coding-conventions.html#names-for-test-methods).\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"TestFunctionName\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Naming conventions\",\n" +
            "                      \"index\": 71,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RecursivePropertyAccessor\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Recursive property accessor\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports recursive property accessor calls which can end up with a 'StackOverflowError'. Such calls are usually confused with backing field access. Example: 'var counter: Int = 0\\n      set(value) {\\n          counter = if (value < 0) 0 else value\\n      }' After the quick-fix is applied: 'var counter: Int = 0\\n      set(value) {\\n          field = if (value < 0) 0 else value\\n      }'\",\n" +
            "                  \"markdown\": \"Reports recursive property accessor calls which can end up with a `StackOverflowError`.\\nSuch calls are usually confused with backing field access.\\n\\n**Example:**\\n\\n\\n      var counter: Int = 0\\n          set(value) {\\n              counter = if (value < 0) 0 else value\\n          }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      var counter: Int = 0\\n          set(value) {\\n              field = if (value < 0) 0 else value\\n          }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RecursivePropertyAccessor\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantUnitExpression\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant 'Unit'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant 'Unit' expressions. 'Unit' in Kotlin can be used as the return type of functions that do not return anything meaningful. The 'Unit' type has only one possible value, which is the 'Unit' object. Examples: 'fun redundantA(): Unit {\\n      return Unit // redundant, 'Unit' is returned by default and matches the expected return type\\n  }\\n\\n  fun requiredA(condition: Boolean): Any {\\n      if (condition) return \\\"hello\\\"\\n      return Unit // explicit 'Unit' is required since the expected type is 'Any'\\n  }\\n\\n  fun redundantB(condition: Boolean): Any = if (condition) {\\n      fun ancillary(): Int = 1\\n      println(\\\"${ancillary()}\\\")\\n      Unit // redundant since the last expression is already of type 'Unit'\\n  } else {\\n      println(\\\"else\\\")\\n  }\\n\\n  fun requiredB(condition: Boolean): Any = if (condition) {\\n      1024\\n      Unit // required, otherwise '1024' (Int) would be the return value\\n  } else {\\n      println(\\\"else\\\")\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant `Unit` expressions.\\n\\n\\n`Unit` in Kotlin can be used as the return type of functions that do not return anything meaningful.\\nThe `Unit` type has only one possible value, which is the `Unit` object.\\n\\n**Examples:**\\n\\n\\n      fun redundantA(): Unit {\\n          return Unit // redundant, 'Unit' is returned by default and matches the expected return type\\n      }\\n\\n      fun requiredA(condition: Boolean): Any {\\n          if (condition) return \\\"hello\\\"\\n          return Unit // explicit 'Unit' is required since the expected type is 'Any'\\n      }\\n\\n      fun redundantB(condition: Boolean): Any = if (condition) {\\n          fun ancillary(): Int = 1\\n          println(\\\"${ancillary()}\\\")\\n          Unit // redundant since the last expression is already of type 'Unit'\\n      } else {\\n          println(\\\"else\\\")\\n      }\\n\\n      fun requiredB(condition: Boolean): Any = if (condition) {\\n          1024\\n          Unit // required, otherwise '1024' (Int) would be the return value\\n      } else {\\n          println(\\\"else\\\")\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantUnitExpression\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"PlatformExtensionReceiverOfInline\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'inline fun' with nullable receiver until Kotlin 1.2\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports potentially unsafe calls of inline functions with flexible nullable (platform type with unknown nullability) extension receivers. Before Kotlin 1.2, calls of 'inline fun' with flexible nullable extension receiver (a platform type with an unknown nullability) did not include nullability checks in bytecode. Since Kotlin 1.2, nullability checks are included into the bytecode (see KT-12899). It's recommended to add an explicit '!!' you want an exception to be thrown, or consider changing the function's receiver type to nullable if it should work without exceptions. Example: 'inline fun String.removePrefix(prefix: String): String {\\n      return this.substring(prefix.length)\\n  }\\n\\n  fun main() {\\n      // `System.getProperty` returns not denotable `String!` type\\n      val property = System.getProperty(\\\"user.dir\\\")\\n      println(property.removePrefix(\\\"/home\\\"))\\n  }' After the quick-fix is applied: 'inline fun String.removePrefix(prefix: String): String {\\n      return this.substring(prefix.length)\\n  }\\n\\n  fun main() {\\n      // `System.getProperty` returns not denotable `String!` type\\n      val property = System.getProperty(\\\"user.dir\\\")\\n      println(property!!.removePrefix(\\\"/home\\\"))\\n  }' This inspection only reports if the Kotlin language level of the project or module is lower than 1.2.\",\n" +
            "                  \"markdown\": \"Reports potentially unsafe calls of inline functions with flexible nullable (platform type with unknown nullability) extension receivers.\\n\\n\\nBefore Kotlin 1.2, calls of `inline fun` with flexible nullable extension receiver (a platform type with an unknown\\nnullability) did not include nullability checks in bytecode. Since Kotlin 1.2, nullability checks are included into the bytecode\\n(see [KT-12899](https://youtrack.jetbrains.com/issue/KT-12899)).\\n\\n\\nIt's recommended to add an explicit `!!` you want an exception to be thrown,\\nor consider changing the function's receiver type to nullable if it should work without exceptions.\\n\\n**Example:**\\n\\n\\n      inline fun String.removePrefix(prefix: String): String {\\n          return this.substring(prefix.length)\\n      }\\n\\n      fun main() {\\n          // `System.getProperty` returns not denotable `String!` type\\n          val property = System.getProperty(\\\"user.dir\\\")\\n          println(property.removePrefix(\\\"/home\\\"))\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      inline fun String.removePrefix(prefix: String): String {\\n          return this.substring(prefix.length)\\n      }\\n\\n      fun main() {\\n          // `System.getProperty` returns not denotable `String!` type\\n          val property = System.getProperty(\\\"user.dir\\\")\\n          println(property!!.removePrefix(\\\"/home\\\"))\\n      }\\n\\nThis inspection only reports if the Kotlin language level of the project or module is lower than 1.2.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"PlatformExtensionReceiverOfInline\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Java interop issues\",\n" +
            "                      \"index\": 79,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SuspiciousEqualsCombination\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Suspicious combination of == and ===\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports '==' and '===' comparisons that are both used on the same variable within a single expression. Due to similarities '==' and '===' could be mixed without notice, and it takes a close look to check that '==' used instead of '===' Example: 'if (type === FIELD || type == METHOD || type == ANNOTATION_METHOD || // Note that \\\"==\\\" is used incorrectly\\n      type === LAMBDA_EXPRESSION) return'\",\n" +
            "                  \"markdown\": \"Reports `==` and `===` comparisons that are both used on the same variable within a single expression.\\n\\nDue to similarities `==` and `===` could be mixed without notice, and\\nit takes a close look to check that `==` used instead of `===`\\n\\nExample:\\n\\n\\n      if (type === FIELD || type == METHOD || type == ANNOTATION_METHOD || // Note that \\\"==\\\" is used incorrectly\\n          type === LAMBDA_EXPRESSION) return\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SuspiciousEqualsCombination\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UnusedDataClassCopyResult\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unused result of data class copy\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls to data class 'copy' function without using its result.\",\n" +
            "                  \"markdown\": \"Reports calls to data class `copy` function without using its result.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UnusedDataClassCopyResult\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantElseInIf\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant 'else' in 'if'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant 'else' in 'if' with 'return' Example: 'fun foo(arg: Boolean): Int {\\n      if (arg) return 0\\n      else { // This else is redundant, code in braces could be just shifted left\\n          someCode()\\n      }\\n  }' After the quick-fix is applied: 'fun foo(arg: Boolean): Int {\\n      if (arg) return 0\\n      someCode()\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant `else` in `if` with `return`\\n\\n**Example:**\\n\\n\\n      fun foo(arg: Boolean): Int {\\n          if (arg) return 0\\n          else { // This else is redundant, code in braces could be just shifted left\\n              someCode()\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(arg: Boolean): Int {\\n          if (arg) return 0\\n          someCode()\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantElseInIf\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"JavaIoSerializableObjectMustHaveReadResolve\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Serializable object must implement 'readResolve'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'object's ('data object' including) that implement 'java.io.Serializable' but don't implement readResolve Example: 'import java.io.Serializable\\n\\n  object Foo : Serializable' The quick fix implements 'readResolve' method: 'import java.io.Serializable\\n\\n  object Foo : Serializable {\\n      private fun readResolve() = Foo\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `object`s (`data object` including) that implement `java.io.Serializable` but don't implement\\n[readResolve](https://docs.oracle.com/en/java/javase/11/docs/specs/serialization/input.html#the-readresolve-method)\\n\\n**Example:**\\n\\n\\n      import java.io.Serializable\\n\\n      object Foo : Serializable\\n\\nThe quick fix implements `readResolve` method:\\n\\n\\n      import java.io.Serializable\\n\\n      object Foo : Serializable {\\n          private fun readResolve() = Foo\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"JavaIoSerializableObjectMustHaveReadResolve\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplacePutWithAssignment\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'map.put()' can be converted to assignment\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'map.put' function calls that can be replaced with indexing operator ('[]'). Using syntactic sugar makes your code simpler. The quick-fix replaces 'put' call with the assignment. Example: 'fun foo(map: MutableMap<Int, String>) {\\n      map.put(42, \\\"foo\\\")\\n  }' After the quick-fix is applied: 'fun foo(map: MutableMap<Int, String>) {\\n      map[42] = \\\"foo\\\"\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `map.put` function calls that can be replaced with indexing operator (`[]`).\\n\\nUsing syntactic sugar makes your code simpler.\\n\\nThe quick-fix replaces `put` call with the assignment.\\n\\n**Example:**\\n\\n\\n      fun foo(map: MutableMap<Int, String>) {\\n          map.put(42, \\\"foo\\\")\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(map: MutableMap<Int, String>) {\\n          map[42] = \\\"foo\\\"\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplacePutWithAssignment\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinDoubleNegation\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant double negation\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant double negations. Example: 'val truth = !!true'\",\n" +
            "                  \"markdown\": \"Reports redundant double negations.\\n\\n**Example:**\\n\\n      val truth = !!true\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"DoubleNegation\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"FunctionName\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Function naming convention\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports function names that do not follow the recommended naming conventions. Example: 'fun Foo() {}' To fix the problem change the name of the function to match the recommended naming conventions.\",\n" +
            "                  \"markdown\": \"Reports function names that do not follow the recommended naming conventions.\\n\\n**Example:**\\n\\n\\n      fun Foo() {}\\n\\nTo fix the problem change the name of the function to match the recommended naming conventions.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"FunctionName\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Naming conventions\",\n" +
            "                      \"index\": 71,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"DifferentKotlinMavenVersion\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Maven and IDE plugins versions are different\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports that Maven plugin version isn't properly supported in the current IDE plugin. This inconsistency may lead to different error reporting behavior in the IDE and the compiler\",\n" +
            "                  \"markdown\": \"Reports that Maven plugin version isn't properly supported in the current IDE plugin.\\n\\nThis inconsistency may lead to different error reporting behavior in the IDE and the compiler\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"DifferentKotlinMavenVersion\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin\",\n" +
            "                      \"index\": 1,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantUnitReturnType\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant 'Unit' return type\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports a redundant 'Unit' return type which can be omitted.\",\n" +
            "                  \"markdown\": \"Reports a redundant `Unit` return type which can be omitted.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantUnitReturnType\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceRangeToWithUntil\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'rangeTo' or the '..' call should be replaced with 'until'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls to 'rangeTo' or the '..' operator instead of calls to 'until'. Using corresponding functions makes your code simpler. The quick-fix replaces 'rangeTo' or the '..' call with 'until'. Example: 'fun foo(a: Int) {\\n      for (i in 0..a - 1) {\\n\\n      }\\n  }' After the quick-fix is applied: 'fun foo(a: Int) {\\n      for (i in 0 until a) {\\n\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports calls to `rangeTo` or the `..` operator instead of calls to `until`.\\n\\nUsing corresponding functions makes your code simpler.\\n\\nThe quick-fix replaces `rangeTo` or the `..` call with `until`.\\n\\n**Example:**\\n\\n\\n      fun foo(a: Int) {\\n          for (i in 0..a - 1) {\\n\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(a: Int) {\\n          for (i in 0 until a) {\\n\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceRangeToWithUntil\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UnusedEquals\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unused equals expression\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports unused 'equals'('==') expressions.\",\n" +
            "                  \"markdown\": \"Reports unused `equals`(`==`) expressions.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UnusedEquals\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UnclearPrecedenceOfBinaryExpression\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Multiple operators with different precedence\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports binary expressions that consist of different operators without parentheses. Such expressions can be less readable due to different precedence rules of operators. Example:   fun foo(b: Boolean?, i: Int?) {\\n      val x = b ?: i == null // evaluated as `(b ?: i) == null`\\n      val y = i ?: 0 + 1 // evaluated as `i ?: (0 + 1)`\\n  }\",\n" +
            "                  \"markdown\": \"Reports binary expressions that consist of different operators without parentheses.\\n\\nSuch expressions can be less readable due to different [precedence rules](https://kotlinlang.org/docs/reference/grammar.html#expressions) of operators.\\n\\nExample:\\n\\n```\\n  fun foo(b: Boolean?, i: Int?) {\\n      val x = b ?: i == null // evaluated as `(b ?: i) == null`\\n      val y = i ?: 0 + 1 // evaluated as `i ?: (0 + 1)`\\n  }\\n```\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UnclearPrecedenceOfBinaryExpression\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UnusedLambdaExpressionBody\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unused return value of a function with lambda expression body\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls with an unused return value when the called function returns a lambda from an expression body. If there is '=' between function header and body block, code from the function will not be evaluated which can lead to incorrect behavior. Remove = token from function declaration can be used to amend the code automatically. Example: 'fun printHello() = { println(\\\"Hello\\\") }\\n\\n  fun main() {\\n      printHello() // This function doesn't print anything\\n  }' After the quick-fix is applied: 'fun printHello() { println(\\\"Hello\\\") }\\n\\n  fun main() {\\n      printHello()\\n  }'\",\n" +
            "                  \"markdown\": \"Reports calls with an unused return value when the called function returns a lambda from an expression body.\\n\\n\\nIf there is `=` between function header and body block,\\ncode from the function will not be evaluated which can lead to incorrect behavior.\\n\\n**Remove = token from function declaration** can be used to amend the code automatically.\\n\\nExample:\\n\\n\\n      fun printHello() = { println(\\\"Hello\\\") }\\n\\n      fun main() {\\n          printHello() // This function doesn't print anything\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun printHello() { println(\\\"Hello\\\") }\\n\\n      fun main() {\\n          printHello()\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UnusedLambdaExpressionBody\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ConvertLambdaToReference\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Can be replaced with function reference\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports function literal expressions that can be replaced with function references. Replacing lambdas with function references often makes code look more concise and understandable. Example: 'fun Int.isEven() = this % 2 == 0\\n\\n  fun example() {\\n      val numbers = listOf(1, 2, 4, 7, 9, 10)\\n      val evenNumbers = numbers.filter { it.isEven() }\\n  }' After the quick-fix is applied: 'fun Int.isEven() = this % 2 == 0\\n\\n  fun example() {\\n      val numbers = listOf(1, 2, 4, 7, 9, 10)\\n      val evenNumbers = numbers.filter(Int::isEven)\\n  }'\",\n" +
            "                  \"markdown\": \"Reports function literal expressions that can be replaced with function references.\\n\\nReplacing lambdas with function references often makes code look more concise and understandable.\\n\\n**Example:**\\n\\n\\n      fun Int.isEven() = this % 2 == 0\\n\\n      fun example() {\\n          val numbers = listOf(1, 2, 4, 7, 9, 10)\\n          val evenNumbers = numbers.filter { it.isEven() }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun Int.isEven() = this % 2 == 0\\n\\n      fun example() {\\n          val numbers = listOf(1, 2, 4, 7, 9, 10)\\n          val evenNumbers = numbers.filter(Int::isEven)\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ConvertLambdaToReference\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantSetter\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant property setter\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant property setters. Setter is considered to be redundant in one of the following cases: Setter has no body. Accessor visibility isn't changed, declaration isn't 'external' and has no annotations. 'var myPropWithRedundantSetter: Int = 0\\n      set // redundant\\n\\n  var myPropA: Int = 0\\n      private set // OK - property visibility is changed to private\\n\\n  var myPropB: Int = 0\\n      external set // OK - implemented not in Kotlin (external)\\n\\n  var myPropC: Int = 0\\n      @Inject set // OK - accessor is annotated' Setter body is a block with a single statement assigning the parameter to the backing field. 'var prop: Int = 0\\n      set(value) { // redundant\\n          field = value\\n      }'\",\n" +
            "                  \"markdown\": \"Reports redundant property setters.\\n\\n\\nSetter is considered to be redundant in one of the following cases:\\n\\n1. Setter has no body. Accessor visibility isn't changed, declaration isn't `external` and has no annotations.\\n\\n\\n         var myPropWithRedundantSetter: Int = 0\\n             set // redundant\\n\\n         var myPropA: Int = 0\\n             private set // OK - property visibility is changed to private\\n\\n         var myPropB: Int = 0\\n             external set // OK - implemented not in Kotlin (external)\\n\\n         var myPropC: Int = 0\\n             @Inject set // OK - accessor is annotated\\n               \\n2. Setter body is a block with a single statement assigning the parameter to the backing field.\\n\\n\\n         var prop: Int = 0\\n             set(value) { // redundant\\n                 field = value\\n             }\\n              \\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantSetter\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"CanSealedSubClassBeObject\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Sealed subclass without state and overridden equals\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports direct inheritors of 'sealed' classes that have no state and overridden 'equals()' method. It's highly recommended to override 'equals()' to provide comparison stability, or convert the 'class' to an 'object' to reach the same effect. Example: 'sealed class Receiver {\\n      class Everyone : Receiver()\\n      class User(val id: Int) : Receiver()\\n  }' The quick-fix converts a 'class' into an 'object': 'sealed class Receiver {\\n      object Everyone : Receiver()\\n      class User(val id: Int) : Receiver()\\n  }'\",\n" +
            "                  \"markdown\": \"Reports direct inheritors of `sealed` classes that have no state and overridden `equals()` method.\\n\\nIt's highly recommended to override `equals()` to provide comparison stability, or convert the `class` to an `object` to reach the same effect.\\n\\n**Example:**\\n\\n\\n      sealed class Receiver {\\n          class Everyone : Receiver()\\n          class User(val id: Int) : Receiver()\\n      }\\n\\nThe quick-fix converts a `class` into an `object`:\\n\\n\\n      sealed class Receiver {\\n          object Everyone : Receiver()\\n          class User(val id: Int) : Receiver()\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"CanSealedSubClassBeObject\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"PropertyName\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Property naming convention\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports property names that do not follow the recommended naming conventions. Consistent naming allows for easier code reading and understanding. According to the Kotlin official style guide, property names should start with a lowercase letter and use camel case. It is possible to introduce other naming rules by changing the \\\"Pattern\\\" regular expression. Example: 'val My_Cool_Property = \\\"\\\"' The quick-fix renames the class according to the Kotlin naming conventions: 'val myCoolProperty = \\\"\\\"'\",\n" +
            "                  \"markdown\": \"Reports property names that do not follow the recommended naming conventions.\\n\\n\\nConsistent naming allows for easier code reading and understanding.\\nAccording to the [Kotlin official style guide](https://kotlinlang.org/docs/coding-conventions.html#naming-rules),\\nproperty names should start with a lowercase letter and use camel case.\\n\\nIt is possible to introduce other naming rules by changing the \\\"Pattern\\\" regular expression.\\n\\n**Example:**\\n\\n\\n      val My_Cool_Property = \\\"\\\"\\n\\nThe quick-fix renames the class according to the Kotlin naming conventions:\\n\\n\\n      val myCoolProperty = \\\"\\\"\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"PropertyName\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Naming conventions\",\n" +
            "                      \"index\": 71,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"InlineClassDeprecatedMigration\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Inline classes are deprecated since 1.5\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports inline classes that are deprecated and cause compilation warnings in Kotlin 1.5 and later. See What's new in Kotlin 1.5.0 Example: 'inline class Password(val s: String)' After the quick-fix is applied: '@JvmInline\\n  value class Password(val s: String)' Inspection is available for Kotlin language level starting from 1.5.\",\n" +
            "                  \"markdown\": \"Reports inline classes that are deprecated and cause compilation warnings in Kotlin 1.5 and later.\\nSee [What's new in Kotlin 1.5.0](https://kotlinlang.org/docs/whatsnew15.html#inline-classes)\\n\\nExample:\\n\\n\\n      inline class Password(val s: String)\\n\\nAfter the quick-fix is applied:\\n\\n\\n      @JvmInline\\n      value class Password(val s: String)\\n\\nInspection is available for Kotlin language level starting from 1.5.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"InlineClassDeprecatedMigration\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinMavenPluginPhase\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Kotlin Maven Plugin misconfigured\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports kotlin-maven-plugin configuration issues\",\n" +
            "                  \"markdown\": \"Reports kotlin-maven-plugin configuration issues\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"KotlinMavenPluginPhase\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin\",\n" +
            "                      \"index\": 1,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ConvertToStringTemplate\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"String concatenation that can be converted to string template\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports string concatenation that can be converted to a string template. Using string templates is recommended as it makes code easier to read. Example: 'fun example() {\\n      val capitals = mapOf(\\\"France\\\" to \\\"Paris\\\", \\\"Spain\\\" to \\\"Madrid\\\")\\n      for ((country, capital) in capitals) {\\n          print(capital + \\\" is a capital of \\\" + country)\\n      }\\n  }' After the quick-fix is applied: 'fun example() {\\n      val capitals = mapOf(\\\"France\\\" to \\\"Paris\\\", \\\"Spain\\\" to \\\"Madrid\\\")\\n      for ((country, capital) in capitals) {\\n          print(\\\"$capital is a capital of $country\\\")\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports string concatenation that can be converted to a string template.\\n\\nUsing string templates is recommended as it makes code easier to read.\\n\\n**Example:**\\n\\n\\n      fun example() {\\n          val capitals = mapOf(\\\"France\\\" to \\\"Paris\\\", \\\"Spain\\\" to \\\"Madrid\\\")\\n          for ((country, capital) in capitals) {\\n              print(capital + \\\" is a capital of \\\" + country)\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun example() {\\n          val capitals = mapOf(\\\"France\\\" to \\\"Paris\\\", \\\"Spain\\\" to \\\"Madrid\\\")\\n          for ((country, capital) in capitals) {\\n              print(\\\"$capital is a capital of $country\\\")\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ConvertToStringTemplate\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SimplifiableCall\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Library function call could be simplified\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports library function calls which could be replaced by simplified one. Using corresponding functions makes your code simpler. The quick-fix replaces the function calls with another one. Example: 'fun test(list: List<Any>) {\\n      list.filter { it is String }\\n  }' After the quick-fix is applied: 'fun test(list: List<Any>) {\\n      list.filterIsInstance<String>()\\n  }'\",\n" +
            "                  \"markdown\": \"Reports library function calls which could be replaced by simplified one.\\n\\nUsing corresponding functions makes your code simpler.\\n\\nThe quick-fix replaces the function calls with another one.\\n\\n**Example:**\\n\\n\\n      fun test(list: List<Any>) {\\n          list.filter { it is String }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test(list: List<Any>) {\\n          list.filterIsInstance<String>()\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SimplifiableCall\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ObjectLiteralToLambda\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Object literal can be converted to lambda\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports anonymous object literals implementing a Java interface with a single abstract method that can be converted into a call with a lambda expression. Example: 'class SomeService {\\n  val threadPool = Executors.newCachedThreadPool()\\n    \\n  fun foo() {\\n    threadPool.submit(object : Runnable {\\n      override fun run() {\\n        println(\\\"hello\\\")\\n      }\\n    })\\n  }\\n}' After the quick-fix is applied: 'fun foo() {\\n    threadPool.submit { println(\\\"hello\\\") }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports anonymous object literals implementing a Java interface with a single abstract method that can be converted into a call with a lambda expression.\\n\\n**Example:**\\n\\n\\n    class SomeService {\\n      val threadPool = Executors.newCachedThreadPool()\\n        \\n      fun foo() {\\n        threadPool.submit(object : Runnable {\\n          override fun run() {\\n            println(\\\"hello\\\")\\n          }\\n        })\\n      }\\n    }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo() {\\n        threadPool.submit { println(\\\"hello\\\") }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ObjectLiteralToLambda\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantLambdaOrAnonymousFunction\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant creation of lambda or anonymous function\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports lambdas or anonymous functions that are created and used immediately. 'fun test() {\\n      ({ println() })() // redundant\\n      (fun() { println() })() // redundant\\n  }'\",\n" +
            "                  \"markdown\": \"Reports lambdas or anonymous functions that are created and used immediately.\\n\\n\\n      fun test() {\\n          ({ println() })() // redundant\\n          (fun() { println() })() // redundant\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantLambdaOrAnonymousFunction\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ConvertObjectToDataObject\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Convert 'object' to 'data object'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'object' that can be converted to 'data object' 'data object' auto-generates 'toString', 'equals' and 'hashCode' The inspection suggests to convert 'object' to 'data object' in 2 cases: When custom 'toString' returns name of the class When 'object' inherits sealed 'class'/'interface' Example: 'object Foo {\\n        override fun toString(): String = \\\"Foo\\\"\\n    }' After the quick-fix is applied: 'data object Foo' This inspection only reports if the Kotlin language level of the project or module is 1.9 or higher\",\n" +
            "                  \"markdown\": \"Reports `object` that can be converted to `data object`\\n\\n`data object` auto-generates `toString`, `equals` and `hashCode`\\n\\nThe inspection suggests to convert `object` to `data object` in 2 cases:\\n\\n* When custom `toString` returns name of the class\\n* When `object` inherits sealed `class`/`interface`\\n\\n**Example:**\\n\\n\\n        object Foo {\\n            override fun toString(): String = \\\"Foo\\\"\\n        }\\n\\nAfter the quick-fix is applied:\\n\\n\\n        data object Foo\\n\\nThis inspection only reports if the Kotlin language level of the project or module is 1.9 or higher\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ConvertObjectToDataObject\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"BooleanLiteralArgument\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Boolean literal argument without parameter name\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports call arguments with 'Boolean' type without explicit parameter names specified. When multiple boolean literals are passed sequentially, it's easy to forget parameter ordering that could lead to mistakes. Explicit parameter names allow for easier code reading and understanding. Example: 'fun check(checkName: Boolean, checkAddress: Boolean, checkPhone: Boolean) {}\\n\\n  fun usage() {\\n      check(true, false, true) // What does this mean?\\n  }' The quick-fix adds missing parameter names: 'fun check(checkName: Boolean, checkAddress: Boolean, checkPhone: Boolean) {}\\n\\n  fun usage() {\\n      check(checkName = true, checkAddress = false, checkPhone = true)\\n  }'\",\n" +
            "                  \"markdown\": \"Reports call arguments with `Boolean` type without explicit parameter names specified.\\n\\n\\nWhen multiple boolean literals are passed sequentially, it's easy to forget parameter ordering that could lead to mistakes.\\nExplicit parameter names allow for easier code reading and understanding.\\n\\n**Example:**\\n\\n\\n      fun check(checkName: Boolean, checkAddress: Boolean, checkPhone: Boolean) {}\\n\\n      fun usage() {\\n          check(true, false, true) // What does this mean?\\n      }\\n\\nThe quick-fix adds missing parameter names:\\n\\n\\n      fun check(checkName: Boolean, checkAddress: Boolean, checkPhone: Boolean) {}\\n\\n      fun usage() {\\n          check(checkName = true, checkAddress = false, checkPhone = true)\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"BooleanLiteralArgument\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ConvertArgumentToSet\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Argument could be converted to 'Set' to improve performance\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Detects the function calls that could work faster with an argument converted to 'Set'. Operations like 'minus' or 'intersect' are more effective when their argument is a set. An explicit conversion of an 'Iterable<T>' or an 'Array<T>' into a 'Set<T>' can often make code more effective. The quick-fix adds an explicit conversion to the function call. Example: 'fun <T> f(a: Iterable<T>, b: Iterable<T>): Int =\\n      a.intersect(b).size' After the quick-fix is applied: 'fun <T> f(a: Iterable<T>, b: Iterable<T>): Int =\\n      a.intersect(b.toSet()).size'\",\n" +
            "                  \"markdown\": \"Detects the function calls that could work faster with an argument converted to `Set`.\\n\\n\\nOperations like 'minus' or 'intersect' are more effective when their argument is a set.\\nAn explicit conversion of an `Iterable<T>` or an `Array<T>`\\ninto a `Set<T>` can often make code more effective.\\n\\n\\nThe quick-fix adds an explicit conversion to the function call.\\n\\n**Example:**\\n\\n\\n      fun <T> f(a: Iterable<T>, b: Iterable<T>): Int =\\n          a.intersect(b).size\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun <T> f(a: Iterable<T>, b: Iterable<T>): Int =\\n          a.intersect(b.toSet()).size\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ConvertArgumentToSet\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Other problems\",\n" +
            "                      \"index\": 60,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceGuardClauseWithFunctionCall\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Guard clause can be replaced with Kotlin's function call\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports guard clauses that can be replaced with a function call. Example: 'fun test(foo: Int?) {\\n      if (foo == null) throw IllegalArgumentException(\\\"foo\\\") // replaceable clause\\n  }' After the quick-fix is applied: 'fun test(foo: Int?) {\\n      checkNotNull(foo)\\n  }'\",\n" +
            "                  \"markdown\": \"Reports guard clauses that can be replaced with a function call.\\n\\n**Example:**\\n\\n      fun test(foo: Int?) {\\n          if (foo == null) throw IllegalArgumentException(\\\"foo\\\") // replaceable clause\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n      fun test(foo: Int?) {\\n          checkNotNull(foo)\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceGuardClauseWithFunctionCall\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceToStringWithStringTemplate\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Call of 'toString' could be replaced with string template\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'toString' function calls that can be replaced with a string template. Using string templates makes your code simpler. The quick-fix replaces 'toString' with a string template. Example: 'fun test(): String {\\n      val x = 1\\n      return x.toString()\\n  }' After the quick-fix is applied: 'fun test(): String {\\n      val x = 1\\n      return \\\"$x\\\"\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `toString` function calls that can be replaced with a string template.\\n\\nUsing string templates makes your code simpler.\\n\\nThe quick-fix replaces `toString` with a string template.\\n\\n**Example:**\\n\\n\\n      fun test(): String {\\n          val x = 1\\n          return x.toString()\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test(): String {\\n          val x = 1\\n          return \\\"$x\\\"\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceToStringWithStringTemplate\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ProtectedInFinal\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'protected' visibility is effectively 'private' in a final class\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'protected' visibility used inside of a 'final' class. In such cases 'protected' members are accessible only in the class itself, so they are effectively 'private'. Example: 'class FinalClass {\\n      protected fun foo() {}\\n  }' After the quick-fix is applied: 'class FinalClass {\\n      private fun foo() {}\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `protected` visibility used inside of a `final` class. In such cases `protected` members are accessible only in the class itself, so they are effectively `private`.\\n\\n**Example:**\\n\\n\\n      class FinalClass {\\n          protected fun foo() {}\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      class FinalClass {\\n          private fun foo() {}\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ProtectedInFinal\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceRangeStartEndInclusiveWithFirstLast\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Boxed properties should be replaced with unboxed\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports boxed 'Range.start' and 'Range.endInclusive' properties. These properties can be replaced with unboxed 'first' and 'last' properties to avoid redundant calls. The quick-fix replaces 'start' and 'endInclusive' properties with the corresponding 'first' and 'last'. Example: 'fun foo(range: CharRange) {\\n      val lastElement = range.endInclusive\\n  }' After the quick-fix is applied: 'fun foo(range: CharRange) {\\n      val lastElement = range.last\\n  }'\",\n" +
            "                  \"markdown\": \"Reports **boxed** `Range.start` and `Range.endInclusive` properties.\\n\\nThese properties can be replaced with **unboxed** `first` and `last` properties to avoid redundant calls.\\n\\nThe quick-fix replaces `start` and `endInclusive` properties with the corresponding `first` and `last`.\\n\\n**Example:**\\n\\n\\n      fun foo(range: CharRange) {\\n          val lastElement = range.endInclusive\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(range: CharRange) {\\n          val lastElement = range.last\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceRangeStartEndInclusiveWithFirstLast\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceSizeCheckWithIsNotEmpty\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Size check can be replaced with 'isNotEmpty()'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports size checks of 'Collections/Array/String' that should be replaced with 'isNotEmpty()'. Using 'isNotEmpty()' makes your code simpler. The quick-fix replaces the size check with 'isNotEmpty()'. Example: 'fun foo() {\\n      val arrayOf = arrayOf(1, 2, 3)\\n      arrayOf.size > 0\\n  }' After the quick-fix is applied: 'fun foo() {\\n      val arrayOf = arrayOf(1, 2, 3)\\n      arrayOf.isNotEmpty()\\n  }'\",\n" +
            "                  \"markdown\": \"Reports size checks of `Collections/Array/String` that should be replaced with `isNotEmpty()`.\\n\\nUsing `isNotEmpty()` makes your code simpler.\\n\\nThe quick-fix replaces the size check with `isNotEmpty()`.\\n\\n**Example:**\\n\\n\\n      fun foo() {\\n          val arrayOf = arrayOf(1, 2, 3)\\n          arrayOf.size > 0\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo() {\\n          val arrayOf = arrayOf(1, 2, 3)\\n          arrayOf.isNotEmpty()\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceSizeCheckWithIsNotEmpty\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantSemicolon\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant semicolon\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant semicolons (';') that can be safely removed. Kotlin does not require a semicolon at the end of each statement or expression. The quick-fix is suggested to remove redundant semicolons. Example: 'val myMap = mapOf(\\\"one\\\" to 1, \\\"two\\\" to 2);\\n  myMap.forEach { (key, value) ->  print(\\\"$key -> $value\\\")};' After the quick-fix is applied: 'val myMap = mapOf(\\\"one\\\" to 1, \\\"two\\\" to 2)\\n  myMap.forEach { (key, value) ->  print(\\\"$key -> $value\\\")}' There are two cases though where a semicolon is required: Several statements placed on a single line need to be separated with semicolons: 'map.forEach { val (key, value) = it; println(\\\"$key -> $value\\\") }' 'enum' classes that also declare properties or functions, require a semicolon after the list of enum constants: 'enum class Mode {\\n      SILENT, VERBOSE;\\n\\n      fun isSilent(): Boolean = this == SILENT\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant semicolons (`;`) that can be safely removed.\\n\\n\\nKotlin does not require a semicolon at the end of each statement or expression.\\nThe quick-fix is suggested to remove redundant semicolons.\\n\\n**Example:**\\n\\n\\n      val myMap = mapOf(\\\"one\\\" to 1, \\\"two\\\" to 2);\\n      myMap.forEach { (key, value) ->  print(\\\"$key -> $value\\\")};\\n\\nAfter the quick-fix is applied:\\n\\n\\n      val myMap = mapOf(\\\"one\\\" to 1, \\\"two\\\" to 2)\\n      myMap.forEach { (key, value) ->  print(\\\"$key -> $value\\\")}\\n\\nThere are two cases though where a semicolon is required:\\n\\n1. Several statements placed on a single line need to be separated with semicolons:\\n\\n\\n         map.forEach { val (key, value) = it; println(\\\"$key -> $value\\\") }\\n\\n2. `enum` classes that also declare properties or functions, require a semicolon after the list of enum constants:\\n\\n\\n         enum class Mode {\\n             SILENT, VERBOSE;\\n\\n             fun isSilent(): Boolean = this == SILENT\\n         }\\n               \\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantSemicolon\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"IntroduceWhenSubject\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'when' that can be simplified by introducing an argument\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports a 'when' expression that can be simplified by introducing a subject argument. Example: 'fun test(obj: Any): String {\\n      return when {\\n          obj is String -> \\\"string\\\"\\n          obj is Int -> \\\"int\\\"\\n          else -> \\\"unknown\\\"\\n      }\\n  }' The quick fix introduces a subject argument: 'fun test(obj: Any): String {\\n      return when (obj) {\\n          is String -> \\\"string\\\"\\n          is Int -> \\\"int\\\"\\n          else -> \\\"unknown\\\"\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports a `when` expression that can be simplified by introducing a subject argument.\\n\\n**Example:**\\n\\n\\n      fun test(obj: Any): String {\\n          return when {\\n              obj is String -> \\\"string\\\"\\n              obj is Int -> \\\"int\\\"\\n              else -> \\\"unknown\\\"\\n          }\\n      }\\n\\nThe quick fix introduces a subject argument:\\n\\n\\n      fun test(obj: Any): String {\\n          return when (obj) {\\n              is String -> \\\"string\\\"\\n              is Int -> \\\"int\\\"\\n              else -> \\\"unknown\\\"\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"IntroduceWhenSubject\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"DeprecatedCallableAddReplaceWith\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"@Deprecated annotation without 'replaceWith' argument\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports deprecated functions and properties that do not have the 'kotlin.ReplaceWith' argument in its 'kotlin.deprecated' annotation and suggests to add one based on their body. Kotlin provides the 'ReplaceWith' argument to replace deprecated declarations automatically. It is recommended to use the argument to fix deprecation issues in code. Example: '@Deprecated(\\\"Use refined() instead.\\\")\\n  fun deprecated() = refined()\\n\\n  fun refined() = 42' The quick-fix adds the 'ReplaceWith()' argument: '@Deprecated(\\\"Use refined() instead.\\\", ReplaceWith(\\\"refined()\\\"))\\n  fun deprecated() = refined()\\n\\n  fun refined() = 42'\",\n" +
            "                  \"markdown\": \"Reports deprecated functions and properties that do not have the `kotlin.ReplaceWith` argument in its `kotlin.deprecated` annotation and suggests to add one based on their body.\\n\\n\\nKotlin provides the `ReplaceWith` argument to replace deprecated declarations automatically.\\nIt is recommended to use the argument to fix deprecation issues in code.\\n\\n**Example:**\\n\\n\\n      @Deprecated(\\\"Use refined() instead.\\\")\\n      fun deprecated() = refined()\\n\\n      fun refined() = 42\\n\\nThe quick-fix adds the `ReplaceWith()` argument:\\n\\n\\n      @Deprecated(\\\"Use refined() instead.\\\", ReplaceWith(\\\"refined()\\\"))\\n      fun deprecated() = refined()\\n\\n      fun refined() = 42\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"DeprecatedCallableAddReplaceWith\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Other problems\",\n" +
            "                      \"index\": 60,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ComplexRedundantLet\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant argument-based 'let' call\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports a redundant argument-based 'let' call. 'let' is redundant when the lambda parameter is only used as a qualifier in a call expression. If you need to give a name to the qualifying expression, declare a local variable. Example: 'fun splitNumbers() {\\n      \\\"1,2,3\\\".let { it.split(',') }\\n  }' The quick-fix removes the extra 'let()' call: 'fun example() {\\n      \\\"1,2,3\\\".split(',')\\n  }' Alternative: 'fun splitNumbers() {\\n      val numbers = \\\"1,2,3\\\"\\n      numbers.split(',')\\n  }'\",\n" +
            "                  \"markdown\": \"Reports a redundant argument-based `let` call.\\n\\n`let` is redundant when the lambda parameter is only used as a qualifier in a call expression.\\n\\nIf you need to give a name to the qualifying expression, declare a local variable.\\n\\n**Example:**\\n\\n\\n      fun splitNumbers() {\\n          \\\"1,2,3\\\".let { it.split(',') }\\n      }\\n\\nThe quick-fix removes the extra `let()` call:\\n\\n\\n      fun example() {\\n          \\\"1,2,3\\\".split(',')\\n      }\\n\\nAlternative:\\n\\n\\n      fun splitNumbers() {\\n          val numbers = \\\"1,2,3\\\"\\n          numbers.split(',')\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ComplexRedundantLet\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveRedundantSpreadOperator\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant spread operator\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports the use of a redundant spread operator for a family of 'arrayOf' function calls. Use the 'Remove redundant spread operator' quick-fix to clean up the code. Examples: 'fun foo(vararg s: String) { }\\n\\n  fun bar(ss: Array<String>) {\\n      foo(*arrayOf(\\\"abc\\\"))       // for the both calls of 'foo', array creation\\n      foo(*arrayOf(*ss, \\\"zzz\\\"))  // and its subsequent \\\"spreading\\\" is redundant\\n  }' After the quick-fix is applied: 'fun foo(vararg s: String) { }\\n\\n  fun bar(ss: Array<String>) {\\n      foo(\\\"abc\\\")\\n      foo(*ss, \\\"zzz\\\")\\n  }'\",\n" +
            "                  \"markdown\": \"Reports the use of a redundant spread operator for a family of `arrayOf` function calls.\\n\\nUse the 'Remove redundant spread operator' quick-fix to clean up the code.\\n\\n**Examples:**\\n\\n\\n      fun foo(vararg s: String) { }\\n\\n      fun bar(ss: Array<String>) {\\n          foo(*arrayOf(\\\"abc\\\"))       // for the both calls of 'foo', array creation\\n          foo(*arrayOf(*ss, \\\"zzz\\\"))  // and its subsequent \\\"spreading\\\" is redundant\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(vararg s: String) { }\\n\\n      fun bar(ss: Array<String>) {\\n          foo(\\\"abc\\\")\\n          foo(*ss, \\\"zzz\\\")\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveRedundantSpreadOperator\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ProhibitJvmOverloadsOnConstructorsOfAnnotationClassesMigration\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'@JvmOverloads' annotation cannot be used on constructors of annotation classes since 1.4\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports '@JvmOverloads' on constructors of annotation classes because it's meaningless. There is no footprint of '@JvmOverloads' in the generated bytecode and Kotlin metadata, so '@JvmOverloads' doesn't affect the generated bytecode and the code behavior. '@JvmOverloads' on constructors of annotation classes causes a compilation error since Kotlin 1.4. Example: 'annotation class A @JvmOverloads constructor(val x: Int = 1)' After the quick-fix is applied: 'annotation class A constructor(val x: Int = 1)'\",\n" +
            "                  \"markdown\": \"Reports `@JvmOverloads` on constructors of annotation classes because it's meaningless.\\n\\n\\nThere is no footprint of `@JvmOverloads` in the generated bytecode and Kotlin metadata,\\nso `@JvmOverloads` doesn't affect the generated bytecode and the code behavior.\\n\\n`@JvmOverloads` on constructors of annotation classes causes a compilation error since Kotlin 1.4.\\n\\n**Example:**\\n\\n\\n      annotation class A @JvmOverloads constructor(val x: Int = 1)\\n\\nAfter the quick-fix is applied:\\n\\n\\n      annotation class A constructor(val x: Int = 1)\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ProhibitJvmOverloadsOnConstructorsOfAnnotationClassesMigration\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveSetterParameterType\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant setter parameter type\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports explicitly specified parameter types in property setters. Setter parameter type always matches the property type, so it's not required to be explicit. The 'Remove explicit type specification' quick-fix allows amending the code accordingly. Examples: 'fun process(x: Int) {}\\n\\n  var x: Int = 0\\n      set(value: Int) = process(value) // <== 'Int' specification can be safely omitted' After the quick-fix is applied: 'fun process(x: Int) {}\\n\\n  var x: Int = 0\\n      set(value) = process(value)'\",\n" +
            "                  \"markdown\": \"Reports explicitly specified parameter types in property setters.\\n\\n\\nSetter parameter type always matches the property type, so it's not required to be explicit.\\nThe 'Remove explicit type specification' quick-fix allows amending the code accordingly.\\n\\n**Examples:**\\n\\n\\n      fun process(x: Int) {}\\n\\n      var x: Int = 0\\n          set(value: Int) = process(value) // <== 'Int' specification can be safely omitted\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun process(x: Int) {}\\n\\n      var x: Int = 0\\n          set(value) = process(value)\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveSetterParameterType\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"IfThenToElvis\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"If-Then foldable to '?:'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'if-then' expressions that can be folded into elvis ('?:') expressions. Example: 'fun maybeFoo(): String? = \\\"foo\\\"\\n\\n  var foo = maybeFoo()\\n  val bar = if (foo == null) \\\"hello\\\" else foo' The quick fix converts the 'if-then' expression into an elvis ('?:') expression: 'fun maybeFoo(): String? = \\\"foo\\\"\\n\\n  var foo = maybeFoo()\\n  val bar = foo ?: \\\"hello\\\"'\",\n" +
            "                  \"markdown\": \"Reports `if-then` expressions that can be folded into elvis (`?:`) expressions.\\n\\n**Example:**\\n\\n\\n      fun maybeFoo(): String? = \\\"foo\\\"\\n\\n      var foo = maybeFoo()\\n      val bar = if (foo == null) \\\"hello\\\" else foo\\n\\nThe quick fix converts the `if-then` expression into an elvis (`?:`) expression:\\n\\n\\n      fun maybeFoo(): String? = \\\"foo\\\"\\n\\n      var foo = maybeFoo()\\n      val bar = foo ?: \\\"hello\\\"\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"IfThenToElvis\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ObjectPrivatePropertyName\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Object private property naming convention\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports properties that do not follow the naming conventions. The following properties are reported: Private properties in objects and companion objects You can specify the required pattern in the inspection options. Recommended naming conventions: it has to start with an underscore or an uppercase letter, use camel case. Example: 'class Person {\\n    companion object {\\n      // property in companion object\\n      private val NO_NAME = Person()\\n    }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports properties that do not follow the naming conventions.\\n\\nThe following properties are reported:\\n\\n* Private properties in objects and companion objects\\n\\nYou can specify the required pattern in the inspection options.\\n\\n[Recommended naming conventions](https://kotlinlang.org/docs/coding-conventions.html#naming-rules): it has to start with an underscore or an uppercase letter, use camel case.\\n\\n**Example:**\\n\\n\\n      class Person {\\n        companion object {\\n          // property in companion object\\n          private val NO_NAME = Person()\\n        }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ObjectPrivatePropertyName\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Naming conventions\",\n" +
            "                      \"index\": 71,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"WrapUnaryOperator\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Ambiguous unary operator use with number constant\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports an unary operator followed by a dot qualifier such as '-1.inc()'. Code like '-1.inc()' can be misleading because '-' has a lower precedence than '.inc()'. As a result, '-1.inc()' evaluates to '-2' and not '0' as it might be expected. Wrap unary operator and value with () quick-fix can be used to amend the code automatically.\",\n" +
            "                  \"markdown\": \"Reports an unary operator followed by a dot qualifier such as `-1.inc()`.\\n\\nCode like `-1.inc()` can be misleading because `-` has a lower precedence than `.inc()`.\\nAs a result, `-1.inc()` evaluates to `-2` and not `0` as it might be expected.\\n\\n**Wrap unary operator and value with ()** quick-fix can be used to amend the code automatically.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"WrapUnaryOperator\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ConflictingExtensionProperty\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Extension property conflicting with synthetic one\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports extension properties that conflict with synthetic ones that have been automatically produced from Java 'get' or 'set' methods. Such properties should be either removed or renamed to avoid breaking code by future changes in the compiler. The quick-fix deletes an extention property. Example: 'val File.name: String\\n      get() = getName()' The quick-fix adds the '@Deprecated' annotation: '@Deprecated(\\\"Is replaced with automatic synthetic extension\\\", ReplaceWith(\\\"name\\\"), level = DeprecationLevel.HIDDEN)\\n  val File.name: String\\n      get() = getName()'\",\n" +
            "                  \"markdown\": \"Reports extension properties that conflict with synthetic ones that have been automatically produced from Java `get` or `set` methods.\\n\\nSuch properties should be either removed or renamed to avoid breaking code by future changes in the compiler.\\n\\nThe quick-fix deletes an extention property.\\n\\n**Example:**\\n\\n\\n      val File.name: String\\n          get() = getName()\\n\\nThe quick-fix adds the `@Deprecated` annotation:\\n\\n\\n      @Deprecated(\\\"Is replaced with automatic synthetic extension\\\", ReplaceWith(\\\"name\\\"), level = DeprecationLevel.HIDDEN)\\n      val File.name: String\\n          get() = getName()\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ConflictingExtensionProperty\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceJavaStaticMethodWithKotlinAnalog\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Java methods should be replaced with Kotlin analog\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports a Java method call that can be replaced with a Kotlin function, for example, 'System.out.println()'. Replacing the code gets rid of the dependency to Java and makes the idiomatic Kotlin code. The quick-fix replaces the Java method calls on the same Kotlin call. Example: 'import java.util.Arrays\\n\\n  fun main() {\\n      val a = Arrays.asList(1, 3, null)\\n  }' After the quick-fix is applied: 'fun main() {\\n      val a = listOf(1, 3, null)\\n  }'\",\n" +
            "                  \"markdown\": \"Reports a Java method call that can be replaced with a Kotlin function, for example, `System.out.println()`.\\n\\nReplacing the code gets rid of the dependency to Java and makes the idiomatic Kotlin code.\\n\\nThe quick-fix replaces the Java method calls on the same Kotlin call.\\n\\n**Example:**\\n\\n\\n      import java.util.Arrays\\n\\n      fun main() {\\n          val a = Arrays.asList(1, 3, null)\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun main() {\\n          val a = listOf(1, 3, null)\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceJavaStaticMethodWithKotlinAnalog\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveEmptyParenthesesFromLambdaCall\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unnecessary parentheses in function call with lambda\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant empty parentheses of function calls where the only parameter is a lambda that's outside the parentheses. Use the 'Remove unnecessary parentheses from function call with lambda' quick-fix to clean up the code. Examples: 'fun foo() {\\n      listOf(1).forEach() {  }\\n  }' After the quick-fix is applied: 'fun foo() {\\n      listOf(1).forEach {  }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant empty parentheses of function calls where the only parameter is a lambda that's outside the parentheses.\\n\\nUse the 'Remove unnecessary parentheses from function call with lambda' quick-fix to clean up the code.\\n\\n**Examples:**\\n\\n\\n      fun foo() {\\n          listOf(1).forEach() {  }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo() {\\n          listOf(1).forEach {  }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveEmptyParenthesesFromLambdaCall\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveExplicitSuperQualifier\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unnecessary supertype qualification\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'super' member calls with redundant supertype qualification. Code in a derived class can call its superclass functions and property accessors implementations using the 'super' keyword. To specify the supertype from which the inherited implementation is taken, 'super' can be qualified by the supertype name in angle brackets, e.g. 'super<Base>'. Sometimes this qualification is redundant and can be omitted. Use the 'Remove explicit supertype qualification' quick-fix to clean up the code. Examples: 'open class B {\\n      open fun foo(){}\\n  }\\n\\n  class A : B() {\\n      override fun foo() {\\n         super<B>.foo() // <== redundant because 'B' is the only supertype\\n      }\\n  }\\n\\n  interface I {\\n      fun foo() {}\\n  }\\n\\n  class C : B(), I {\\n      override fun foo() {\\n          super<B>.foo() // <== here <B> qualifier is needed to distinguish 'B.foo()' from 'I.foo()'\\n      }\\n  }' After the quick-fix is applied: 'open class B {\\n      open fun foo(){}\\n  }\\n\\n  class A : B() {\\n      override fun foo() {\\n         super.foo() // <== Updated\\n      }\\n  }\\n\\n  interface I {\\n      fun foo() {}\\n  }\\n\\n  class C : B(), I {\\n      override fun foo() {\\n          super<B>.foo()\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `super` member calls with redundant supertype qualification.\\n\\n\\nCode in a derived class can call its superclass functions and property accessors implementations using the `super` keyword.\\nTo specify the supertype from which the inherited implementation is taken, `super` can be qualified by the supertype name in\\nangle brackets, e.g. `super<Base>`. Sometimes this qualification is redundant and can be omitted.\\nUse the 'Remove explicit supertype qualification' quick-fix to clean up the code.\\n\\n**Examples:**\\n\\n\\n      open class B {\\n          open fun foo(){}\\n      }\\n\\n      class A : B() {\\n          override fun foo() {\\n             super<B>.foo() // <== redundant because 'B' is the only supertype\\n          }\\n      }\\n\\n      interface I {\\n          fun foo() {}\\n      }\\n\\n      class C : B(), I {\\n          override fun foo() {\\n              super<B>.foo() // <== here <B> qualifier is needed to distinguish 'B.foo()' from 'I.foo()'\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      open class B {\\n          open fun foo(){}\\n      }\\n\\n      class A : B() {\\n          override fun foo() {\\n             super.foo() // <== Updated\\n          }\\n      }\\n\\n      interface I {\\n          fun foo() {}\\n      }\\n\\n      class C : B(), I {\\n          override fun foo() {\\n              super<B>.foo()\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveExplicitSuperQualifier\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantExplicitType\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Obvious explicit type\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports local variables' explicitly given types which are obvious and thus redundant, like 'val f: Foo = Foo()'. Example: 'class Point(val x: Int, val y: Int)\\n\\n  fun foo() {\\n      val t: Boolean = true\\n      val p: Point = Point(1, 2)\\n      val i: Int = 42\\n  }' After the quick-fix is applied: 'class Point(val x: Int, val y: Int)\\n\\n  fun foo() {\\n      val t = true\\n      val p = Point(1, 2)\\n      val i = 42\\n  }'\",\n" +
            "                  \"markdown\": \"Reports local variables' explicitly given types which are obvious and thus redundant, like `val f: Foo = Foo()`.\\n\\n**Example:**\\n\\n\\n      class Point(val x: Int, val y: Int)\\n\\n      fun foo() {\\n          val t: Boolean = true\\n          val p: Point = Point(1, 2)\\n          val i: Int = 42\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      class Point(val x: Int, val y: Int)\\n\\n      fun foo() {\\n          val t = true\\n          val p = Point(1, 2)\\n          val i = 42\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantExplicitType\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SuspiciousVarProperty\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Suspicious 'var' property: its setter does not influence its getter result\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'var' properties with default setter and getter that do not reference backing field. Such properties do not affect calling its setter; therefore, it will be clearer to change such property to 'val' and delete the initializer. Change to val and delete initializer quick-fix can be used to amend the code automatically. Example: '// This property always returns '1' and it doesn't important that the property is a 'var'\\n  var foo: Int = 0\\n      get() = 1'\",\n" +
            "                  \"markdown\": \"Reports `var` properties with default setter and getter that do not reference backing field.\\n\\n\\nSuch properties do not affect calling its setter; therefore, it will be clearer to change such property to `val` and delete the initializer.\\n\\n**Change to val and delete initializer** quick-fix can be used to amend the code automatically.\\n\\nExample:\\n\\n\\n      // This property always returns '1' and it doesn't important that the property is a 'var'\\n      var foo: Int = 0\\n          get() = 1\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SuspiciousVarProperty\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"JavaCollectionsStaticMethod\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Java Collections static method call can be replaced with Kotlin stdlib\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports a Java 'Collections' static method call that can be replaced with Kotlin stdlib. Example: 'import java.util.Collections\\n\\n  fun test() {\\n      val mutableList = mutableListOf(1, 2)\\n      Collections.fill(mutableList, 3)\\n  }' The quick fix replaces Java 'Collections' static method call with the corresponding Kotlin stdlib method call: 'import java.util.Collections\\n\\n  fun test() {\\n      val mutableList = mutableListOf(1, 2)\\n      mutableList.fill(3)\\n  }'\",\n" +
            "                  \"markdown\": \"Reports a Java `Collections` static method call that can be replaced with Kotlin stdlib.\\n\\n**Example:**\\n\\n\\n      import java.util.Collections\\n\\n      fun test() {\\n          val mutableList = mutableListOf(1, 2)\\n          Collections.fill(mutableList, 3)\\n      }\\n\\nThe quick fix replaces Java `Collections` static method call with the corresponding Kotlin stdlib method call:\\n\\n\\n      import java.util.Collections\\n\\n      fun test() {\\n          val mutableList = mutableListOf(1, 2)\\n          mutableList.fill(3)\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"JavaCollectionsStaticMethod\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"MoveVariableDeclarationIntoWhen\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Variable declaration could be moved inside 'when'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports variable declarations that can be moved inside a 'when' expression. Example: 'fun someCalc(x: Int) = x * 42\\n\\nfun foo(x: Int): Int {\\n  val a = someCalc(x)\\n  return when (a) {\\n    1 -> a\\n    2 -> 2 * a\\n    else -> 24\\n  }\\n}' After the quick-fix is applied: 'fun foo(x: Int): Int {\\n  return when (val a = someCalc(x)) {\\n    1 -> a\\n    2 -> 2 * a\\n    else -> 24\\n  }\\n}'\",\n" +
            "                  \"markdown\": \"Reports variable declarations that can be moved inside a `when` expression.\\n\\n**Example:**\\n\\n\\n    fun someCalc(x: Int) = x * 42\\n\\n    fun foo(x: Int): Int {\\n      val a = someCalc(x)\\n      return when (a) {\\n        1 -> a\\n        2 -> 2 * a\\n        else -> 24\\n      }\\n    }\\n\\nAfter the quick-fix is applied:\\n\\n\\n    fun foo(x: Int): Int {\\n      return when (val a = someCalc(x)) {\\n        1 -> a\\n        2 -> 2 * a\\n        else -> 24\\n      }\\n    }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"MoveVariableDeclarationIntoWhen\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveEmptyParenthesesFromAnnotationEntry\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Remove unnecessary parentheses\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant empty parentheses in annotation entries. Use the 'Remove unnecessary parentheses' quick-fix to clean up the code. Examples: 'annotation class MyAnnotationA\\n  annotation class MyAnnotationB(val x: Int)\\n  annotation class MyAnnotationC(val x: Int = 10) // default value is present\\n\\n  @MyAnnotationA() // <== parentheses are redundant\\n  fun testA() {\\n  }\\n\\n  @MyAnnotationB() // <== missing argument, parentheses are required\\n  fun testB() {\\n  }\\n\\n  @MyAnnotationC() // <== parentheses are redundant\\n  fun testC() {\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant empty parentheses in annotation entries.\\n\\nUse the 'Remove unnecessary parentheses' quick-fix to clean up the code.\\n\\n**Examples:**\\n\\n\\n      annotation class MyAnnotationA\\n      annotation class MyAnnotationB(val x: Int)\\n      annotation class MyAnnotationC(val x: Int = 10) // default value is present\\n\\n      @MyAnnotationA() // <== parentheses are redundant\\n      fun testA() {\\n      }\\n\\n      @MyAnnotationB() // <== missing argument, parentheses are required\\n      fun testB() {\\n      }\\n\\n      @MyAnnotationC() // <== parentheses are redundant\\n      fun testC() {\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveEmptyParenthesesFromAnnotationEntry\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SimplifiableCallChain\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Call chain on collection type can be simplified\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports two-call chains replaceable by a single call. It can help you to avoid redundant code execution. The quick-fix replaces the call chain with a single call. Example: 'fun main() {\\n      listOf(1, 2, 3).filter { it > 1 }.count()\\n  }' After the quick-fix is applied: 'fun main() {\\n      listOf(1, 2, 3).count { it > 1 }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports two-call chains replaceable by a single call.\\n\\nIt can help you to avoid redundant code execution.\\n\\nThe quick-fix replaces the call chain with a single call.\\n\\n**Example:**\\n\\n\\n      fun main() {\\n          listOf(1, 2, 3).filter { it > 1 }.count()\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun main() {\\n          listOf(1, 2, 3).count { it > 1 }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SimplifiableCallChain\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceCallWithBinaryOperator\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Can be replaced with binary operator\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports function calls that can be replaced with binary operators, in particular comparison-related ones. Example: 'fun test(): Boolean {\\n      return 2.compareTo(1) > 0 // replaceable 'compareTo()'\\n  }' After the quick-fix is applied: 'fun test(): Boolean {\\n      return 2 > 1\\n  }'\",\n" +
            "                  \"markdown\": \"Reports function calls that can be replaced with binary operators, in particular comparison-related ones.\\n\\n**Example:**\\n\\n      fun test(): Boolean {\\n          return 2.compareTo(1) > 0 // replaceable 'compareTo()'\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n      fun test(): Boolean {\\n          return 2 > 1\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceCallWithBinaryOperator\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UnusedUnaryOperator\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unused unary operator\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports unary operators for number types on unused expressions. Unary operators break previous expression if they are used without braces. As a result, mathematical expressions spanning multi lines can be misleading. Example: 'fun main() {\\n      val result = 1 + 2 * 3\\n                  + 3              // <== note that '+ 3' doesn't belong to the 'result' variable, it is unused\\n      println(\\\"Result = $result\\\")  // The result is '7' and not '10' as it might be expected\\n  }'\",\n" +
            "                  \"markdown\": \"Reports unary operators for number types on unused expressions.\\n\\nUnary operators break previous expression if they are used without braces.\\nAs a result, mathematical expressions spanning multi lines can be misleading.\\n\\nExample:\\n\\n\\n      fun main() {\\n          val result = 1 + 2 * 3\\n                      + 3              // <== note that '+ 3' doesn't belong to the 'result' variable, it is unused\\n          println(\\\"Result = $result\\\")  // The result is '7' and not '10' as it might be expected\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UnusedUnaryOperator\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ClassName\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Class naming convention\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports class names that do not follow the recommended naming conventions. Consistent naming allows for easier code reading and understanding. According to the Kotlin official style guide, class names should start with an uppercase letter and use camel case. It is possible to introduce other naming rules by changing the \\\"Pattern\\\" regular expression. Example: 'class user(val name: String)' The quick-fix renames the class according to the Kotlin naming conventions: 'class User(val name: String)'\",\n" +
            "                  \"markdown\": \"Reports class names that do not follow the recommended naming conventions.\\n\\n\\nConsistent naming allows for easier code reading and understanding.\\nAccording to the [Kotlin official style guide](https://kotlinlang.org/docs/coding-conventions.html#naming-rules),\\nclass names should start with an uppercase letter and use camel case.\\n\\nIt is possible to introduce other naming rules by changing the \\\"Pattern\\\" regular expression.\\n\\n**Example:**\\n\\n\\n      class user(val name: String)\\n\\nThe quick-fix renames the class according to the Kotlin naming conventions:\\n\\n\\n      class User(val name: String)\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ClassName\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Naming conventions\",\n" +
            "                      \"index\": 71,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveEmptyPrimaryConstructor\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant empty primary constructor\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports empty primary constructors when they are implicitly available anyway. A primary constructor is redundant and can be safely omitted when it does not have any annotations or visibility modifiers. Use the 'Remove empty primary constructor' quick-fix to clean up the code. Examples: 'class MyClassA constructor() //  redundant, can be replaced with 'class MyClassA'\\n\\n  annotation class MyAnnotation\\n  class MyClassB @MyAnnotation constructor() //  required because of annotation\\n\\n  class MyClassC private constructor() // required because of visibility modifier'\",\n" +
            "                  \"markdown\": \"Reports empty primary constructors when they are implicitly available anyway.\\n\\n\\nA primary constructor is redundant and can be safely omitted when it does not have any annotations or visibility modifiers.\\nUse the 'Remove empty primary constructor' quick-fix to clean up the code.\\n\\n**Examples:**\\n\\n\\n      class MyClassA constructor() //  redundant, can be replaced with 'class MyClassA'\\n\\n      annotation class MyAnnotation\\n      class MyClassB @MyAnnotation constructor() //  required because of annotation\\n\\n      class MyClassC private constructor() // required because of visibility modifier\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveEmptyPrimaryConstructor\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveEmptySecondaryConstructorBody\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant constructor body\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports empty bodies of secondary constructors.\",\n" +
            "                  \"markdown\": \"Reports empty bodies of secondary constructors.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveEmptySecondaryConstructorBody\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"FloatingPointLiteralPrecision\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Floating-point literal exceeds the available precision\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports floating-point literals that cannot be represented with the required precision using IEEE 754 'Float' and 'Double' types. For example, '1.9999999999999999999' has too many significant digits, so its representation as a 'Double' will be rounded to '2.0'. Specifying excess digits may be misleading as it hides the fact that computations use rounded values instead. The quick-fix replaces the literal with a rounded value that matches the actual representation of the constant. Example: 'val x: Float = 3.14159265359f' After the quick-fix is applied: 'val x: Float = 3.1415927f'\",\n" +
            "                  \"markdown\": \"Reports floating-point literals that cannot be represented with the required precision using [IEEE 754](https://en.wikipedia.org/wiki/IEEE_754) `Float` and `Double` types.\\n\\n\\nFor example, `1.9999999999999999999` has too many significant digits,\\nso its representation as a `Double` will be rounded to `2.0`.\\nSpecifying excess digits may be misleading as it hides the fact that computations\\nuse rounded values instead.\\n\\n\\nThe quick-fix replaces the literal with a rounded value that matches the actual representation\\nof the constant.\\n\\n**Example:**\\n\\n\\n      val x: Float = 3.14159265359f\\n\\nAfter the quick-fix is applied:\\n\\n\\n      val x: Float = 3.1415927f\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"FloatingPointLiteralPrecision\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Other problems\",\n" +
            "                      \"index\": 60,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ConvertPairConstructorToToFunction\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Convert Pair constructor to 'to' function\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports a 'Pair' constructor invocation that can be replaced with a 'to()' infix function call. Explicit constructor invocations may add verbosity, especially if they are used multiple times. Replacing constructor calls with 'to()' makes code easier to read and maintain. Example: 'val countries = mapOf(\\n      Pair(\\\"France\\\", \\\"Paris\\\"),\\n      Pair(\\\"Spain\\\", \\\"Madrid\\\"),\\n      Pair(\\\"Germany\\\", \\\"Berlin\\\")\\n  )' After the quick-fix is applied: 'val countries = mapOf(\\n      \\\"France\\\" to \\\"Paris\\\",\\n      \\\"Spain\\\" to \\\"Madrid\\\",\\n      \\\"Germany\\\" to \\\"Berlin\\\"\\n  )'\",\n" +
            "                  \"markdown\": \"Reports a `Pair` constructor invocation that can be replaced with a `to()` infix function call.\\n\\n\\nExplicit constructor invocations may add verbosity, especially if they are used multiple times.\\nReplacing constructor calls with `to()` makes code easier to read and maintain.\\n\\n**Example:**\\n\\n\\n      val countries = mapOf(\\n          Pair(\\\"France\\\", \\\"Paris\\\"),\\n          Pair(\\\"Spain\\\", \\\"Madrid\\\"),\\n          Pair(\\\"Germany\\\", \\\"Berlin\\\")\\n      )\\n\\nAfter the quick-fix is applied:\\n\\n\\n      val countries = mapOf(\\n          \\\"France\\\" to \\\"Paris\\\",\\n          \\\"Spain\\\" to \\\"Madrid\\\",\\n          \\\"Germany\\\" to \\\"Berlin\\\"\\n      )\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ConvertPairConstructorToToFunction\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantGetter\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant property getter\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant property getters. Example: 'class Test {\\n      val a = 1\\n          get\\n      val b = 1\\n          get() = field\\n  }' After the quick-fix is applied: 'class Test {\\n      val a = 1\\n      val b = 1\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant property getters.\\n\\n**Example:**\\n\\n\\n      class Test {\\n          val a = 1\\n              get\\n          val b = 1\\n              get() = field\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      class Test {\\n          val a = 1\\n          val b = 1\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantGetter\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantIf\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant 'if' statement\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'if' statements which can be simplified to a single statement. Example: 'fun test(): Boolean {\\n      if (foo()) {\\n         return true\\n      } else {\\n         return false\\n      }\\n  }' After the quick-fix is applied: 'fun test(): Boolean {\\n      return foo()\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `if` statements which can be simplified to a single statement.\\n\\n**Example:**\\n\\n\\n      fun test(): Boolean {\\n          if (foo()) {\\n             return true\\n          } else {\\n             return false\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test(): Boolean {\\n          return foo()\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantIf\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KDocMissingDocumentation\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Missing KDoc comments for public declarations\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports public declarations that do not have KDoc comments. Example: 'class A' The quick fix generates the comment block above the declaration: '/**\\n   *\\n   */\\n  class A'\",\n" +
            "                  \"markdown\": \"Reports public declarations that do not have KDoc comments.\\n\\n**Example:**\\n\\n\\n      class A\\n\\nThe quick fix generates the comment block above the declaration:\\n\\n\\n      /**\\n       *\\n       */\\n      class A\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"KDocMissingDocumentation\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Other problems\",\n" +
            "                      \"index\": 60,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveExplicitTypeArguments\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unnecessary type argument\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports function calls with type arguments that can be automatically inferred. Such type arguments are redundant and can be safely omitted. Use the 'Remove explicit type arguments' quick-fix to clean up the code. Examples: '// 'String' type can be inferred here\\n  fun foo(): MutableList<String> = mutableListOf<String>()\\n\\n  // Here 'String' cannot be inferred, type argument is required.\\n  fun bar() = mutableListOf<String>()' After the quick-fix is applied: 'fun foo(): MutableList<String> = mutableListOf() <== Updated\\n\\n  fun bar() = mutableListOf<String>()'\",\n" +
            "                  \"markdown\": \"Reports function calls with type arguments that can be automatically inferred. Such type arguments are redundant and can be safely omitted.\\n\\nUse the 'Remove explicit type arguments' quick-fix to clean up the code.\\n\\n**Examples:**\\n\\n\\n      // 'String' type can be inferred here\\n      fun foo(): MutableList<String> = mutableListOf<String>()\\n\\n      // Here 'String' cannot be inferred, type argument is required.\\n      fun bar() = mutableListOf<String>()\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(): MutableList<String> = mutableListOf() <== Updated\\n\\n      fun bar() = mutableListOf<String>()\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveExplicitTypeArguments\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantVisibilityModifier\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant visibility modifier\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports visibility modifiers that match the default visibility of an element ('public' for most elements, 'protected' for members that override a protected member).\",\n" +
            "                  \"markdown\": \"Reports visibility modifiers that match the default visibility of an element (`public` for most elements, `protected` for members that override a protected member).\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantVisibilityModifier\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"EnumValuesSoftDeprecateInJava\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'Enum.values()' is recommended to be replaced by 'Enum.getEntries()' since Kotlin 1.9\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls from Java to 'values()' method of Kotlin enum classes that can be replaced with 'getEntries()'. Use of 'Enum.getEntries()' may improve performance of your code. More details: KT-48872 Provide modern and performant replacement for Enum.values()\",\n" +
            "                  \"markdown\": \"Reports calls from Java to `values()` method of Kotlin enum classes that can be replaced with `getEntries()`.\\n\\n\\nUse of `Enum.getEntries()` may improve performance of your code.\\n\\n\\n**More details:** [KT-48872 Provide modern and performant replacement for Enum.values()](https://youtrack.jetbrains.com/issue/KT-48872)\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"EnumValuesSoftDeprecateInJava\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Other problems\",\n" +
            "                      \"index\": 60,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UsePropertyAccessSyntax\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Accessor call that can be replaced with property access syntax\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports Java 'get' and 'set' method calls that can be replaced with the Kotlin synthetic properties. Use property access syntax quick-fix can be used to amend the code automatically. Example: '// Java:\\n  public class JavaClassWithGetter {\\n      private final String expr = \\\"result\\\";\\n\\n      // ...\\n\\n      public String getExpr() {\\n          return expr;\\n      }\\n  }' '// Kotlin:\\n  fun test(j: JavaClassWithGetter) {\\n      // ...\\n      j.getExpr() // <== The quick-fix simplifies the expression to 'j.expr'\\n  }'\",\n" +
            "                  \"markdown\": \"Reports Java `get` and `set` method calls that can be replaced with the Kotlin synthetic properties.\\n\\n**Use property access syntax** quick-fix can be used to amend the code automatically.\\n\\nExample:\\n\\n\\n      // Java:\\n      public class JavaClassWithGetter {\\n          private final String expr = \\\"result\\\";\\n\\n          // ...\\n\\n          public String getExpr() {\\n              return expr;\\n          }\\n      }\\n\\n\\n      // Kotlin:\\n      fun test(j: JavaClassWithGetter) {\\n          // ...\\n          j.getExpr() // <== The quick-fix simplifies the expression to 'j.expr'\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UsePropertyAccessSyntax\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UseExpressionBody\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Expression body syntax is preferable here\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'return' expressions (one-liners or 'when') that can be replaced with expression body syntax. Expression body syntax is recommended by the style guide. Convert to expression body quick-fix can be used to amend the code automatically. Example: 'fun sign(x: Int): Int {\\n      return when { // <== can be simplified\\n          x < 0 -> -1\\n          x > 0 -> 1\\n          else -> 0\\n      }\\n  }' After the quick-fix is applied: 'fun sign(x: Int): Int = when {\\n      x < 0 -> -1\\n      x > 0 -> 1\\n      else -> 0\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `return` expressions (one-liners or `when`) that can be replaced with expression body syntax.\\n\\nExpression body syntax is recommended by the [style guide](https://kotlinlang.org/docs/coding-conventions.html#functions).\\n\\n**Convert to expression body** quick-fix can be used to amend the code automatically.\\n\\nExample:\\n\\n\\n      fun sign(x: Int): Int {\\n          return when { // <== can be simplified\\n              x < 0 -> -1\\n              x > 0 -> 1\\n              else -> 0\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun sign(x: Int): Int = when {\\n          x < 0 -> -1\\n          x > 0 -> 1\\n          else -> 0\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UseExpressionBody\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"MapGetWithNotNullAssertionOperator\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'map.get()' with not-null assertion operator (!!)\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'map.get()!!' that can be replaced with 'map.getValue()', 'map.getOrElse()', and so on. Example: 'fun test(map: Map<Int, String>): String = map.get(0)!!' After the quick-fix is applied: 'fun test(map: Map<Int, String>): String = map.getValue(0)'\",\n" +
            "                  \"markdown\": \"Reports `map.get()!!` that can be replaced with `map.getValue()`, `map.getOrElse()`, and so on.\\n\\n**Example:**\\n\\n\\n    fun test(map: Map<Int, String>): String = map.get(0)!!\\n\\nAfter the quick-fix is applied:\\n\\n\\n    fun test(map: Map<Int, String>): String = map.getValue(0)\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"MapGetWithNotNullAssertionOperator\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SortModifiers\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Non-canonical modifier order\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports modifiers that do not follow the order recommended by the style guide. Sort modifiers quick-fix can be used to amend the code automatically. Examples: 'private inline fun correctOrder(f: () -> Unit) {} // <== Ok\\n\\n  infix private fun Int.wrongOrder(expr: Int) {} // <== wrong order, quick-fix amends the modifiers to \\\"private infix\\\"'\",\n" +
            "                  \"markdown\": \"Reports modifiers that do not follow the order recommended by the [style guide](https://kotlinlang.org/docs/coding-conventions.html#modifiers-order).\\n\\n**Sort modifiers** quick-fix can be used to amend the code automatically.\\n\\nExamples:\\n\\n\\n      private inline fun correctOrder(f: () -> Unit) {} // <== Ok\\n\\n      infix private fun Int.wrongOrder(expr: Int) {} // <== wrong order, quick-fix amends the modifiers to \\\"private infix\\\"\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SortModifiers\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"EnumEntryName\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Enum entry naming convention\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports enum entry names that do not follow the recommended naming conventions. Example: 'enum class Foo {\\n    _Foo,\\n    foo\\n  }' To fix the problem rename enum entries to match the recommended naming conventions.\",\n" +
            "                  \"markdown\": \"Reports enum entry names that do not follow the recommended naming conventions.\\n\\n**Example:**\\n\\n\\n      enum class Foo {\\n        _Foo,\\n        foo\\n      }\\n\\nTo fix the problem rename enum entries to match the recommended naming conventions.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"EnumEntryName\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Naming conventions\",\n" +
            "                      \"index\": 71,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceSubstringWithDropLast\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'substring' call should be replaced with 'dropLast' call\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls like 's.substring(0, s.length - x)' that can be replaced with 's.dropLast(x)'. Using corresponding functions makes your code simpler. The quick-fix replaces the 'substring' call with 'dropLast'. Example: 'fun foo(s: String) {\\n      s.substring(0, s.length - 5)\\n  }' After the quick-fix is applied: 'fun foo(s: String) {\\n      s.dropLast(5)\\n  }'\",\n" +
            "                  \"markdown\": \"Reports calls like `s.substring(0, s.length - x)` that can be replaced with `s.dropLast(x)`.\\n\\nUsing corresponding functions makes your code simpler.\\n\\nThe quick-fix replaces the `substring` call with `dropLast`.\\n\\n**Example:**\\n\\n\\n      fun foo(s: String) {\\n          s.substring(0, s.length - 5)\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(s: String) {\\n          s.dropLast(5)\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceSubstringWithDropLast\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SetterBackingFieldAssignment\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Existing backing field without assignment\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports property setters that don't update the backing field. The quick-fix adds an assignment to the backing field. Example: 'class Test {\\n      var foo: Int = 1\\n          set(value) {\\n          }\\n  }' After the quick-fix is applied: 'class Test {\\n      var foo: Int = 1\\n          set(value) {\\n              field = value\\n          }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports property setters that don't update the backing field.\\n\\nThe quick-fix adds an assignment to the backing field.\\n\\n**Example:**\\n\\n\\n      class Test {\\n          var foo: Int = 1\\n              set(value) {\\n              }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      class Test {\\n          var foo: Int = 1\\n              set(value) {\\n                  field = value\\n              }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SetterBackingFieldAssignment\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"CopyWithoutNamedArguments\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'copy' method of data class is called without named arguments\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls to a data class' 'copy()' method without named arguments. As all arguments of the 'copy()' function are optional, it might be hard to understand what properties are modified. Providing parameter names explicitly makes code easy to understand without navigating to the 'data class' declaration. Example: 'data class User(val name: String, val age: Int)\\n\\n  fun copyUser(user: User): User {\\n      return user.copy(\\\"John\\\")\\n  }' The quick-fix provides parameter names to all 'copy()' arguments: 'data class User(val name: String, val age: Int)\\n\\n  fun copyUser(user: User): User {\\n      return user.copy(name = \\\"John\\\")\\n  }'\",\n" +
            "                  \"markdown\": \"Reports calls to a data class' `copy()` method without named arguments.\\n\\n\\nAs all arguments of the `copy()` function are optional, it might be hard to understand what properties are modified.\\nProviding parameter names explicitly makes code easy to understand without navigating to the `data class` declaration.\\n\\n**Example:**\\n\\n\\n      data class User(val name: String, val age: Int)\\n\\n      fun copyUser(user: User): User {\\n          return user.copy(\\\"John\\\")\\n      }\\n\\nThe quick-fix provides parameter names to all `copy()` arguments:\\n\\n\\n      data class User(val name: String, val age: Int)\\n\\n      fun copyUser(user: User): User {\\n          return user.copy(name = \\\"John\\\")\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"CopyWithoutNamedArguments\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantConstructorKeyword\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant 'constructor' keyword\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant constructor keywords on primary constructors. Example: 'class Foo constructor(x: Int, y: Int)' After the quick-fix is applied: 'class Foo(x: Int, y: Int)'\",\n" +
            "                  \"markdown\": \"Reports redundant constructor keywords on primary constructors.\\n\\n**Example:**\\n\\n\\n      class Foo constructor(x: Int, y: Int)\\n\\nAfter the quick-fix is applied:\\n\\n\\n      class Foo(x: Int, y: Int)\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantConstructorKeyword\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinDeprecation\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Usage of redundant or deprecated syntax or deprecated symbols\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports obsolete language features and unnecessarily verbose code constructs during the code cleanup operation (Code | Code Cleanup). The quick-fix automatically replaces usages of obsolete language features or unnecessarily verbose code constructs with compact and up-to-date syntax. It also replaces deprecated symbols with their proposed substitutions.\",\n" +
            "                  \"markdown\": \"Reports obsolete language features and unnecessarily verbose code constructs during the code cleanup operation (**Code \\\\| Code Cleanup** ).\\n\\n\\nThe quick-fix automatically replaces usages of obsolete language features or unnecessarily verbose code constructs with compact and up-to-date syntax.\\n\\n\\nIt also replaces deprecated symbols with their proposed substitutions.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"KotlinDeprecation\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceSubstringWithTake\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'substring' call should be replaced with 'take' call\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls like 's.substring(0, x)' that can be replaced with 's.take(x)'. Using 'take()' makes your code simpler. The quick-fix replaces the 'substring' call with 'take()'. Example: 'fun foo(s: String) {\\n      s.substring(0, 10)\\n  }' After the quick-fix is applied: 'fun foo(s: String) {\\n      s.take(10)\\n  }'\",\n" +
            "                  \"markdown\": \"Reports calls like `s.substring(0, x)` that can be replaced with `s.take(x)`.\\n\\nUsing `take()` makes your code simpler.\\n\\nThe quick-fix replaces the `substring` call with `take()`.\\n\\n**Example:**\\n\\n\\n      fun foo(s: String) {\\n          s.substring(0, 10)\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(s: String) {\\n          s.take(10)\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceSubstringWithTake\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceRangeToWithRangeUntil\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'rangeTo' or the '..' call should be replaced with '..<'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls to 'rangeTo' or the '..' operator instead of calls to '..<'. Using corresponding functions makes your code simpler. The quick-fix replaces 'rangeTo' or the '..' call with '..<'. Example: 'fun foo(a: Int) {\\n      for (i in 0..a - 1) {\\n\\n      }\\n  }' After the quick-fix is applied: 'fun foo(a: Int) {\\n      for (i in 0..<a) {\\n\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports calls to `rangeTo` or the `..` operator instead of calls to `..<`.\\n\\nUsing corresponding functions makes your code simpler.\\n\\nThe quick-fix replaces `rangeTo` or the `..` call with `..<`.\\n\\n**Example:**\\n\\n\\n      fun foo(a: Int) {\\n          for (i in 0..a - 1) {\\n\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(a: Int) {\\n          for (i in 0..<a) {\\n\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceRangeToWithRangeUntil\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ConvertCallChainIntoSequence\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Call chain on collection could be converted into 'Sequence' to improve performance\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports call chain on a 'Collection' that should be converted into Sequence. Each 'Collection' transforming function (such as 'map()' or 'filter()') creates a new 'Collection' (typically 'List' or 'Set') under the hood. In case of multiple consequent calls, and a huge number of items in 'Collection', memory traffic might be significant. In such a case, using 'Sequence' is preferred. Example: 'class Entity(val key: String, val value: String)\\n\\n  fun getValues(lines: List<String>) = lines\\n      .filter { it.isNotEmpty() }\\n      .map { it.split(',', limit = 2) }\\n      .filter { it.size == 2 }\\n      .map { Entity(it[0], it[1]) }' The quick-fix wraps call chain into 'asSequence()' and 'toList()': 'class Entity(val key: String, val value: String)\\n\\n  fun getValues(lines: List<String>) = lines\\n      .asSequence()\\n      .filter { it.isNotEmpty() }\\n      .map { it.split(',', limit = 2) }\\n      .filter { it.size == 2 }\\n      .map { Entity(it[0], it[1]) }\\n      .toList()'\",\n" +
            "                  \"markdown\": \"Reports call chain on a `Collection` that should be converted into **Sequence** .\\n\\nEach `Collection` transforming function (such as `map()` or `filter()`) creates a new\\n`Collection` (typically `List` or `Set`) under the hood.\\nIn case of multiple consequent calls, and a huge number of items in `Collection`, memory traffic might be significant.\\nIn such a case, using `Sequence` is preferred.\\n\\n**Example:**\\n\\n\\n      class Entity(val key: String, val value: String)\\n\\n      fun getValues(lines: List<String>) = lines\\n          .filter { it.isNotEmpty() }\\n          .map { it.split(',', limit = 2) }\\n          .filter { it.size == 2 }\\n          .map { Entity(it[0], it[1]) }\\n\\nThe quick-fix wraps call chain into `asSequence()` and `toList()`:\\n\\n\\n      class Entity(val key: String, val value: String)\\n\\n      fun getValues(lines: List<String>) = lines\\n          .asSequence()\\n          .filter { it.isNotEmpty() }\\n          .map { it.split(',', limit = 2) }\\n          .filter { it.size == 2 }\\n          .map { Entity(it[0], it[1]) }\\n          .toList()\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ConvertCallChainIntoSequence\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"AddOperatorModifier\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Function should have 'operator' modifier\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports a function that matches one of the operator conventions but lacks the 'operator' keyword. By adding the 'operator' modifier, you might allow function consumers to write idiomatic Kotlin code. Example: 'class Complex(val real: Double, val imaginary: Double) {\\n      fun plus(other: Complex) =\\n          Complex(real + other.real, imaginary + other.imaginary)\\n  }\\n\\n  fun usage(a: Complex, b: Complex) {\\n      a.plus(b)\\n  }' The quick-fix adds the 'operator' modifier keyword: 'class Complex(val real: Double, val imaginary: Double) {\\n      operator fun plus(other: Complex) =\\n          Complex(real + other.real, imaginary + other.imaginary)\\n  }\\n\\n  fun usage(a: Complex, b: Complex) {\\n      a + b\\n  }'\",\n" +
            "                  \"markdown\": \"Reports a function that matches one of the operator conventions but lacks the `operator` keyword.\\n\\nBy adding the `operator` modifier, you might allow function consumers to write idiomatic Kotlin code.\\n\\n**Example:**\\n\\n\\n      class Complex(val real: Double, val imaginary: Double) {\\n          fun plus(other: Complex) =\\n              Complex(real + other.real, imaginary + other.imaginary)\\n      }\\n\\n      fun usage(a: Complex, b: Complex) {\\n          a.plus(b)\\n      }\\n\\nThe quick-fix adds the `operator` modifier keyword:\\n\\n\\n      class Complex(val real: Double, val imaginary: Double) {\\n          operator fun plus(other: Complex) =\\n              Complex(real + other.real, imaginary + other.imaginary)\\n      }\\n\\n      fun usage(a: Complex, b: Complex) {\\n          a + b\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"AddOperatorModifier\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"MayBeConstant\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Might be 'const'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports top-level 'val' properties in objects that might be declared as 'const' for better performance and Java interoperability. Example: 'object A {\\n      val foo = 1\\n  }' After the quick-fix is applied: 'object A {\\n      const val foo = 1\\n  }'\",\n" +
            "                  \"markdown\": \"Reports top-level `val` properties in objects that might be declared as `const` for better performance and Java interoperability.\\n\\n**Example:**\\n\\n\\n      object A {\\n          val foo = 1\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      object A {\\n          const val foo = 1\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"MayBeConstant\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceIsEmptyWithIfEmpty\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'if' condition can be replaced with lambda call\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'isEmpty', 'isBlank', 'isNotEmpty', or 'isNotBlank' calls in an 'if' statement to assign a default value. The quick-fix replaces the 'if' condition with 'ifEmpty' or 'ifBlank' calls. Example: 'fun test(list: List<Int>): List<Int> {\\n      return if (list.isEmpty()) {\\n          println()\\n          foo()\\n      } else {\\n          list\\n      }\\n  }' After the quick-fix is applied: 'fun test(list: List<Int>): List<Int> {\\n      return list.ifEmpty {\\n          println()\\n          foo()\\n      }\\n  }' This inspection only reports if the Kotlin language version of the project or module is 1.3 or higher.\",\n" +
            "                  \"markdown\": \"Reports `isEmpty`, `isBlank`, `isNotEmpty`, or `isNotBlank` calls in an `if` statement to assign a default value.\\n\\nThe quick-fix replaces the `if` condition with `ifEmpty` or `ifBlank` calls.\\n\\n**Example:**\\n\\n\\n      fun test(list: List<Int>): List<Int> {\\n          return if (list.isEmpty()) {\\n              println()\\n              foo()\\n          } else {\\n              list\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test(list: List<Int>): List<Int> {\\n          return list.ifEmpty {\\n              println()\\n              foo()\\n          }\\n      }\\n\\nThis inspection only reports if the Kotlin language version of the project or module is 1.3 or higher.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceIsEmptyWithIfEmpty\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceWithImportAlias\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Fully qualified name can be replaced with existing import alias\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports fully qualified names that can be replaced with an existing import alias. Example: 'import foo.Foo as Bar\\nfun main() {\\n    foo.Foo()\\n}' After the quick-fix is applied: 'import foo.Foo as Bar\\nfun main() {\\n    Bar()\\n}'\",\n" +
            "                  \"markdown\": \"Reports fully qualified names that can be replaced with an existing import alias.\\n\\n**Example:**\\n\\n\\n    import foo.Foo as Bar\\n    fun main() {\\n        foo.Foo()\\n    }\\n\\nAfter the quick-fix is applied:\\n\\n\\n    import foo.Foo as Bar\\n    fun main() {\\n        Bar()\\n    }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceWithImportAlias\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SimplifyBooleanWithConstants\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Boolean expression can be simplified\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports boolean expression parts that can be reduced to constants. The quick-fix simplifies the condition. Example: 'fun use(arg: Boolean) {\\n      if (false == arg) {\\n\\n      }\\n  }' After the quick-fix is applied: 'fun use(arg: Boolean) {\\n      if (!arg) {\\n\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports boolean expression parts that can be reduced to constants.\\n\\nThe quick-fix simplifies the condition.\\n\\n**Example:**\\n\\n\\n      fun use(arg: Boolean) {\\n          if (false == arg) {\\n\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun use(arg: Boolean) {\\n          if (!arg) {\\n\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SimplifyBooleanWithConstants\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"OverrideDeprecatedMigration\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Do not propagate method deprecation through overrides since 1.9\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports a declarations that are propagated by '@Deprecated' annotation that will lead to compilation error since 1.9. Motivation types: Implementation changes are required for implementation design/architectural reasons Inconsistency in the design (things are done differently in different contexts) More details: KT-47902: Do not propagate method deprecation through overrides The quick-fix copies '@Deprecated' annotation from the parent declaration. Example: 'open class Base {\\n      @Deprecated(\\\"Don't use\\\")\\n      open fun foo() {}\\n  }\\n\\n  class Derived : Base() {\\n      override fun foo() {}\\n  }' After the quick-fix is applied: 'open class Base {\\n      @Deprecated(\\\"Don't use\\\")\\n      open fun foo() {}\\n  }\\n\\n  class Derived : Base() {\\n      @Deprecated(\\\"Don't use\\\")\\n      override fun foo() {}\\n  }' This inspection only reports if the Kotlin language level of the project or module is 1.6 or higher.\",\n" +
            "                  \"markdown\": \"Reports a declarations that are propagated by `@Deprecated` annotation that will lead to compilation error since 1.9.\\n\\nMotivation types:\\n\\n* Implementation changes are required for implementation design/architectural reasons\\n* Inconsistency in the design (things are done differently in different contexts)\\n\\n**More details:** [KT-47902: Do not propagate method deprecation through overrides](https://youtrack.jetbrains.com/issue/KT-47902)\\n\\nThe quick-fix copies `@Deprecated` annotation from the parent declaration.\\n\\n**Example:**\\n\\n\\n      open class Base {\\n          @Deprecated(\\\"Don't use\\\")\\n          open fun foo() {}\\n      }\\n\\n      class Derived : Base() {\\n          override fun foo() {}\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      open class Base {\\n          @Deprecated(\\\"Don't use\\\")\\n          open fun foo() {}\\n      }\\n\\n      class Derived : Base() {\\n          @Deprecated(\\\"Don't use\\\")\\n          override fun foo() {}\\n      }\\n\\nThis inspection only reports if the Kotlin language level of the project or module is 1.6 or higher.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"OverrideDeprecatedMigration\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantModalityModifier\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant modality modifier\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports the modality modifiers that match the default modality of an element ('final' for most elements, 'open' for members with an 'override'). Example: 'final class Foo\\n\\n  open class Bar : Comparable<Bar> {\\n      open override fun compareTo(other: Bar): Int = 0\\n  }' After the quick-fix is applied: 'class Foo\\n\\n  open class Bar : Comparable<Bar> {\\n      override fun compareTo(other: Bar): Int = 0\\n  }'\",\n" +
            "                  \"markdown\": \"Reports the modality modifiers that match the default modality of an element (`final` for most elements, `open` for members with an `override`).\\n\\n**Example:**\\n\\n\\n      final class Foo\\n\\n      open class Bar : Comparable<Bar> {\\n          open override fun compareTo(other: Bar): Int = 0\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      class Foo\\n\\n      open class Bar : Comparable<Bar> {\\n          override fun compareTo(other: Bar): Int = 0\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantModalityModifier\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SimplifyAssertNotNull\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'assert' call can be replaced with '!!' or '?:'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'assert' calls that check a not null value of the declared variable. Using '!!' or '?:' makes your code simpler. The quick-fix replaces 'assert' with '!!' or '?:' operator in the variable initializer. Example: 'fun foo(p: Array<String?>) {\\n      val v = p[0]\\n      assert(v != null, { \\\"Should be not null\\\" })\\n  }' After the quick-fix is applied: 'fun foo(p: Array<String?>) {\\n      val v = p[0] ?: error(\\\"Should be not null\\\")\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `assert` calls that check a not null value of the declared variable.\\n\\nUsing `!!` or `?:` makes your code simpler.\\n\\nThe quick-fix replaces `assert` with `!!` or `?:` operator in the variable initializer.\\n\\n**Example:**\\n\\n\\n      fun foo(p: Array<String?>) {\\n          val v = p[0]\\n          assert(v != null, { \\\"Should be not null\\\" })\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(p: Array<String?>) {\\n          val v = p[0] ?: error(\\\"Should be not null\\\")\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SimplifyAssertNotNull\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ConvertNaNEquality\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Convert equality check with 'NaN' to 'isNaN' call\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports an equality check with 'Float.NaN' or 'Double.NaN' that should be replaced with an 'isNaN()' check. According to IEEE 754, equality check against NaN always returns 'false', even for 'NaN == NaN'. Therefore, such a check is likely to be a mistake. The quick-fix replaces comparison with 'isNaN()' check that uses a different comparison technique and handles 'NaN' values correctly. Example: 'fun check(value: Double): Boolean {\\n      return Double.NaN == value\\n  }' After the fix is applied: 'fun check(value: Double): Boolean {\\n      return value.isNaN()\\n  }'\",\n" +
            "                  \"markdown\": \"Reports an equality check with `Float.NaN` or `Double.NaN` that should be replaced with an `isNaN()` check.\\n\\n\\nAccording to IEEE 754, equality check against NaN always returns `false`, even for `NaN == NaN`.\\nTherefore, such a check is likely to be a mistake.\\n\\nThe quick-fix replaces comparison with `isNaN()` check that uses a different comparison technique and handles `NaN` values correctly.\\n\\n**Example:**\\n\\n\\n      fun check(value: Double): Boolean {\\n          return Double.NaN == value\\n      }\\n\\nAfter the fix is applied:\\n\\n\\n      fun check(value: Double): Boolean {\\n          return value.isNaN()\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ConvertNaNEquality\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceManualRangeWithIndicesCalls\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Range can be converted to indices or iteration\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'until' and 'rangeTo' operators that can be replaced with 'Collection.indices' or iteration over collection inside 'for' loop. Using syntactic sugar makes your code simpler. The quick-fix replaces the manual range with the corresponding construction. Example: 'fun main(args: Array<String>) {\\n      for (index in 0..args.size - 1) {\\n          println(args[index])\\n      }\\n  }' After the quick-fix is applied: 'fun main(args: Array<String>) {\\n      for (element in args) {\\n          println(element)\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `until` and `rangeTo` operators that can be replaced with `Collection.indices` or iteration over collection inside `for` loop.\\n\\nUsing syntactic sugar makes your code simpler.\\n\\nThe quick-fix replaces the manual range with the corresponding construction.\\n\\n**Example:**\\n\\n\\n      fun main(args: Array<String>) {\\n          for (index in 0..args.size - 1) {\\n              println(args[index])\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun main(args: Array<String>) {\\n          for (element in args) {\\n              println(element)\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceManualRangeWithIndicesCalls\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinLoggerInitializedWithForeignClass\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Logger initialized with foreign class\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'Logger' instances initialized with a class literal other than the class the 'Logger' resides in. This can happen when copy-pasting from another class. It may result in logging events under an unexpected category and incorrect filtering. Use the inspection options to specify the logger factory classes and methods recognized by this inspection. Example: 'class AnotherService\\nclass MyService {\\n    private val logger = LoggerFactory.getLogger(AnotherService::class.java)\\n}' After the quick-fix is applied: 'class MyService {\\n    private val logger = LoggerFactory.getLogger(MyService::class.java)\\n}'\",\n" +
            "                  \"markdown\": \"Reports `Logger` instances initialized with a class literal other than the class the `Logger` resides in.\\n\\n\\nThis can happen when copy-pasting from another class.\\nIt may result in logging events under an unexpected category and incorrect filtering.\\n\\n\\nUse the inspection options to specify the logger factory classes and methods recognized by this inspection.\\n\\n**Example:**\\n\\n\\n    class AnotherService\\n    class MyService {\\n        private val logger = LoggerFactory.getLogger(AnotherService::class.java)\\n    }\\n\\nAfter the quick-fix is applied:\\n\\n\\n    class MyService {\\n        private val logger = LoggerFactory.getLogger(MyService::class.java)\\n    }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"KotlinLoggerInitializedWithForeignClass\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Logging\",\n" +
            "                      \"index\": 196,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantAsSequence\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant 'asSequence' call\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant 'asSequence()' call that can never have a positive performance effect. 'asSequence()' speeds up collection processing that includes multiple operations because it performs operations lazily and doesn't create intermediate collections. However, if a terminal operation (such as 'toList()') is used right after 'asSequence()', this doesn't give you any positive performance effect. Example: 'fun test(list: List<String>) {\\n      list.asSequence().last()\\n  }' After the quick-fix is applied: 'fun test(list: List<String>) {\\n      list.last()\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant `asSequence()` call that can never have a positive performance effect.\\n\\n\\n`asSequence()` speeds up collection processing that includes multiple operations because it performs operations lazily\\nand doesn't create intermediate collections.\\n\\n\\nHowever, if a terminal operation (such as `toList()`) is used right after `asSequence()`, this doesn't give\\nyou any positive performance effect.\\n\\n**Example:**\\n\\n\\n      fun test(list: List<String>) {\\n          list.asSequence().last()\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test(list: List<String>) {\\n          list.last()\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantAsSequence\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveToStringInStringTemplate\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant call to 'toString()' in string template\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls to 'toString()' in string templates that can be safely removed. Example: 'fun foo(a: Int, b: Int) = a + b\\n\\n  fun test(): String {\\n      return \\\"Foo: ${foo(0, 4).toString()}\\\" // 'toString()' is redundant\\n  }' After the quick-fix is applied: 'fun foo(a: Int, b: Int) = a + b\\n\\n  fun test(): String {\\n      return \\\"Foo: ${foo(0, 4)}\\\"\\n  }'\",\n" +
            "                  \"markdown\": \"Reports calls to `toString()` in string templates that can be safely removed.\\n\\n**Example:**\\n\\n      fun foo(a: Int, b: Int) = a + b\\n\\n      fun test(): String {\\n          return \\\"Foo: ${foo(0, 4).toString()}\\\" // 'toString()' is redundant\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n      fun foo(a: Int, b: Int) = a + b\\n\\n      fun test(): String {\\n          return \\\"Foo: ${foo(0, 4)}\\\"\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveToStringInStringTemplate\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinUnusedImport\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unused import directive\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant 'import' statements. Default and unused imports can be safely removed. Example: 'import kotlin.*\\n  import kotlin.collections.*\\n  import kotlin.comparisons.*\\n  import kotlin.io.*\\n  import kotlin.ranges.*\\n  import kotlin.sequences.*\\n  import kotlin.text.*\\n\\n  // jvm specific\\n  import java.lang.*\\n  import kotlin.jvm.*\\n\\n  // js specific\\n  import kotlin.js.*\\n\\n  import java.io.* // this import is unused and could be removed\\n  import java.util.*\\n\\n  fun foo(list: ArrayList<String>) {\\n      list.add(\\\"\\\")\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant `import` statements.\\n\\nDefault and unused imports can be safely removed.\\n\\n**Example:**\\n\\n\\n      import kotlin.*\\n      import kotlin.collections.*\\n      import kotlin.comparisons.*\\n      import kotlin.io.*\\n      import kotlin.ranges.*\\n      import kotlin.sequences.*\\n      import kotlin.text.*\\n\\n      // jvm specific\\n      import java.lang.*\\n      import kotlin.jvm.*\\n\\n      // js specific\\n      import kotlin.js.*\\n\\n      import java.io.* // this import is unused and could be removed\\n      import java.util.*\\n\\n      fun foo(list: ArrayList<String>) {\\n          list.add(\\\"\\\")\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UnusedImport\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"CanBePrimaryConstructorProperty\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Property is explicitly assigned to constructor parameter\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports properties that are explicitly assigned to primary constructor parameters. Properties can be declared directly in the primary constructor, reducing the amount of code and increasing code readability. Example: 'class User(name: String) {\\n      val name = name\\n  }' The quick-fix joins the parameter and property declaration into a primary constructor parameter: 'class User(val name: String) {\\n  }'\",\n" +
            "                  \"markdown\": \"Reports properties that are explicitly assigned to primary constructor parameters.\\n\\nProperties can be declared directly in the primary constructor, reducing the amount of code and increasing code readability.\\n\\n**Example:**\\n\\n\\n      class User(name: String) {\\n          val name = name\\n      }\\n\\nThe quick-fix joins the parameter and property declaration into a primary constructor parameter:\\n\\n\\n      class User(val name: String) {\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"CanBePrimaryConstructorProperty\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"JavaMapForEach\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Java Map.forEach method call should be replaced with Kotlin's forEach\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports a Java Map.'forEach' method call that can be replaced with Kotlin's forEach. Example: 'fun test(map: HashMap<Int, String>) {\\n      map.forEach { key, value ->\\n          foo(key, value)\\n      }\\n  }\\n\\n  fun foo(i: Int, s: String) {}' The quick-fix adds parentheses: 'fun test(map: HashMap<Int, String>) {\\n      map.forEach { (key, value) ->\\n          foo(key, value)\\n      }\\n  }\\n\\n  fun foo(i: Int, s: String) {}'\",\n" +
            "                  \"markdown\": \"Reports a Java Map.`forEach` method call that can be replaced with Kotlin's **forEach** .\\n\\n**Example:**\\n\\n\\n      fun test(map: HashMap<Int, String>) {\\n          map.forEach { key, value ->\\n              foo(key, value)\\n          }\\n      }\\n\\n      fun foo(i: Int, s: String) {}\\n\\nThe quick-fix adds parentheses:\\n\\n\\n      fun test(map: HashMap<Int, String>) {\\n          map.forEach { (key, value) ->\\n              foo(key, value)\\n          }\\n      }\\n\\n      fun foo(i: Int, s: String) {}\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"JavaMapForEach\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantObjectTypeCheck\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Non-idiomatic 'is' type check for an object\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports non-idiomatic 'is' type checks for an object. It's recommended to replace such checks with reference comparison. Example: 'object Foo\\n\\n  fun foo(arg: Any) = when {\\n      arg is Foo -> ...\\n      arg !is Foo -> ...\\n  }' After the quick-fix is applied: 'object Foo\\n\\n  fun foo(arg: Any) = when {\\n      arg === Foo -> ...\\n      arg !== Foo -> ...\\n  }'\",\n" +
            "                  \"markdown\": \"Reports non-idiomatic `is` type checks for an object.\\n\\nIt's recommended to replace such checks with reference comparison.\\n\\n**Example:**\\n\\n\\n      object Foo\\n\\n      fun foo(arg: Any) = when {\\n          arg is Foo -> ...\\n          arg !is Foo -> ...\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      object Foo\\n\\n      fun foo(arg: Any) = when {\\n          arg === Foo -> ...\\n          arg !== Foo -> ...\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantObjectTypeCheck\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SuspendFunctionOnCoroutineScope\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Ambiguous coroutineContext due to CoroutineScope receiver of suspend function\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls and accesses of 'CoroutineScope' extensions or members inside suspend functions with 'CoroutineScope' receiver. When a function is 'suspend' and has 'CoroutineScope' receiver, it has ambiguous access to 'CoroutineContext' via 'kotlin.coroutines.coroutineContext' and via 'CoroutineScope.coroutineContext', and two these contexts are different in general. To improve this situation, one can wrap suspicious call inside 'coroutineScope { ... }' or get rid of 'CoroutineScope' function receiver.\",\n" +
            "                  \"markdown\": \"Reports calls and accesses of `CoroutineScope` extensions or members inside suspend functions with `CoroutineScope` receiver.\\n\\nWhen a function is `suspend` and has `CoroutineScope` receiver,\\nit has ambiguous access to `CoroutineContext` via `kotlin.coroutines.coroutineContext` and via `CoroutineScope.coroutineContext`,\\nand two these contexts are different in general.\\n\\n\\nTo improve this situation, one can wrap suspicious call inside `coroutineScope { ... }` or\\nget rid of `CoroutineScope` function receiver.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SuspendFunctionOnCoroutineScope\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"DifferentMavenStdlibVersion\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Library and maven plugin versions are different\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports different Kotlin stdlib and compiler versions. Using different versions of the Kotlin compiler and the standard library can lead to unpredictable runtime problems and should be avoided.\",\n" +
            "                  \"markdown\": \"Reports different Kotlin stdlib and compiler versions.\\n\\nUsing different versions of the Kotlin compiler and the standard library can lead to unpredictable\\nruntime problems and should be avoided.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"DifferentMavenStdlibVersion\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin\",\n" +
            "                      \"index\": 1,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ImplicitNullableNothingType\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Implicit 'Nothing?' type\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports variables and functions with the implicit Nothing? type. Example: 'fun foo() = null' The quick fix specifies the return type explicitly: 'fun foo(): Nothing? = null'\",\n" +
            "                  \"markdown\": \"Reports variables and functions with the implicit **Nothing?** type.\\n\\n**Example:**\\n\\n\\n      fun foo() = null\\n\\nThe quick fix specifies the return type explicitly:\\n\\n\\n      fun foo(): Nothing? = null\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ImplicitNullableNothingType\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceAssociateFunction\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'associate' can be replaced with 'associateBy' or 'associateWith'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls to 'associate()' and 'associateTo()' that can be replaced with 'associateBy()' or 'associateWith()'. Both functions accept a transformer function applied to elements of a given sequence or collection (as a receiver). The pairs are then used to build the resulting 'Map'. Given the transformer refers to 'it', the 'associate[To]()' call can be replaced with more performant 'associateBy()' or 'associateWith()'. Examples: 'fun getKey(i: Int) = 1L\\n  fun getValue(i: Int) = 1L\\n\\n  fun test() {\\n      arrayOf(1).associate { getKey(it) to it }  // replaceable 'associate()'\\n      listOf(1).associate { it to getValue(it) } // replaceable 'associate()'\\n  }' After the quick-fix is applied: 'fun getKey(i: Int) = 1L\\n  fun getValue(i: Int) = 1L\\n\\n  fun test() {\\n      arrayOf(1).associateBy { getKey(it) }\\n      listOf(1).associateWith { getValue(it) }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports calls to `associate()` and `associateTo()` that can be replaced with `associateBy()` or `associateWith()`.\\n\\n\\nBoth functions accept a transformer function applied to elements of a given sequence or collection (as a receiver).\\nThe pairs are then used to build the resulting `Map`.\\n\\n\\nGiven the transformer refers to `it`, the `associate[To]()` call can be replaced with more performant `associateBy()`\\nor `associateWith()`.\\n\\n**Examples:**\\n\\n      fun getKey(i: Int) = 1L\\n      fun getValue(i: Int) = 1L\\n\\n      fun test() {\\n          arrayOf(1).associate { getKey(it) to it }  // replaceable 'associate()'\\n          listOf(1).associate { it to getValue(it) } // replaceable 'associate()'\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n      fun getKey(i: Int) = 1L\\n      fun getValue(i: Int) = 1L\\n\\n      fun test() {\\n          arrayOf(1).associateBy { getKey(it) }\\n          listOf(1).associateWith { getValue(it) }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceAssociateFunction\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ObsoleteExperimentalCoroutines\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Experimental coroutines usages are deprecated since 1.3\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports code that uses experimental coroutines. Such usages are incompatible with Kotlin 1.3+ and should be updated.\",\n" +
            "                  \"markdown\": \"Reports code that uses experimental coroutines.\\n\\nSuch usages are incompatible with Kotlin 1.3+ and should be updated.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ObsoleteExperimentalCoroutines\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"LiftReturnOrAssignment\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Return or assignment can be lifted out\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'if', 'when', and 'try' statements that can be converted to expressions by lifting the 'return' statement or an assignment out. Example: 'fun foo(arg: Int): String {\\n      when (arg) {\\n          0 -> return \\\"Zero\\\"\\n          1 -> return \\\"One\\\"\\n          else -> return \\\"Multiple\\\"\\n      }\\n  }' After the quick-fix is applied: 'fun foo(arg: Int): String {\\n      return when (arg) {\\n          0 -> \\\"Zero\\\"\\n          1 -> \\\"One\\\"\\n          else -> \\\"Multiple\\\"\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `if`, `when`, and `try` statements that can be converted to expressions by lifting the `return` statement or an assignment out.\\n\\n**Example:**\\n\\n\\n      fun foo(arg: Int): String {\\n          when (arg) {\\n              0 -> return \\\"Zero\\\"\\n              1 -> return \\\"One\\\"\\n              else -> return \\\"Multiple\\\"\\n          }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(arg: Int): String {\\n          return when (arg) {\\n              0 -> \\\"Zero\\\"\\n              1 -> \\\"One\\\"\\n              else -> \\\"Multiple\\\"\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"LiftReturnOrAssignment\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SimplifyWhenWithBooleanConstantCondition\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Simplifiable 'when'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'when' expressions with the constant 'true' or 'false' branches. Simplify \\\"when\\\" quick-fix can be used to amend the code automatically. Examples: 'fun redundant() {\\n      when { // <== redundant, quick-fix simplifies the when expression to \\\"println(\\\"true\\\")\\\"\\n          true -> println(\\\"true\\\")\\n          else -> println(\\\"false\\\")\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `when` expressions with the constant `true` or `false` branches.\\n\\n**Simplify \\\"when\\\"** quick-fix can be used to amend the code automatically.\\n\\nExamples:\\n\\n\\n      fun redundant() {\\n          when { // <== redundant, quick-fix simplifies the when expression to \\\"println(\\\"true\\\")\\\"\\n              true -> println(\\\"true\\\")\\n              else -> println(\\\"false\\\")\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SimplifyWhenWithBooleanConstantCondition\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinConstantConditions\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Constant conditions\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports non-trivial conditions and values that are statically known to be always true, false, null or zero. While sometimes intended, often this is a sign of logical error in the program. Additionally, reports never reachable 'when' branches and some expressions that are statically known to fail always. Examples: 'fun process(x: Int?) {\\n  val isNull = x == null\\n  if (!isNull) {\\n    if (x != null) {} // condition is always true\\n    require(x!! < 0 && x > 10) // condition is always false\\n  } else {\\n    println(x!!) // !! operator will always fail\\n  }\\n}\\nfun process(v: Any) {\\n  when(v) {\\n    is CharSequence -> println(v as Int) // cast will always fail\\n    is String -> println(v) // branch is unreachable\\n  }\\n}' Uncheck the \\\"Warn when constant is stored in variable\\\" option to avoid reporting of variables having constant values not in conditions. New in 2021.3\",\n" +
            "                  \"markdown\": \"Reports non-trivial conditions and values that are statically known to be always true, false, null or zero. While sometimes intended, often this is a sign of logical error in the program. Additionally, reports never reachable `when` branches and some expressions that are statically known to fail always.\\n\\nExamples:\\n\\n\\n    fun process(x: Int?) {\\n      val isNull = x == null\\n      if (!isNull) {\\n        if (x != null) {} // condition is always true\\n        require(x!! < 0 && x > 10) // condition is always false\\n      } else {\\n        println(x!!) // !! operator will always fail\\n      }\\n    }\\n    fun process(v: Any) {\\n      when(v) {\\n        is CharSequence -> println(v as Int) // cast will always fail\\n        is String -> println(v) // branch is unreachable\\n      }\\n    }\\n\\n\\nUncheck the \\\"Warn when constant is stored in variable\\\" option to avoid reporting of variables having constant values not in conditions.\\n\\nNew in 2021.3\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"KotlinConstantConditions\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ForEachParameterNotUsed\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Iterated elements are not used in forEach\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'forEach' loops that do not use iterable values. Example: 'listOf(1, 2, 3).forEach { }' The quick fix introduces anonymous parameter in the 'forEach' section: 'listOf(1, 2, 3).forEach { _ -> }'\",\n" +
            "                  \"markdown\": \"Reports `forEach` loops that do not use iterable values.\\n\\n**Example:**\\n\\n\\n      listOf(1, 2, 3).forEach { }\\n\\nThe quick fix introduces anonymous parameter in the `forEach` section:\\n\\n\\n      listOf(1, 2, 3).forEach { _ -> }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ForEachParameterNotUsed\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"LeakingThis\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Leaking 'this' in constructor\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports unsafe operations with 'this' during object construction including: Accessing a non-final property during class initialization: from a constructor or property initialization Calling a non-final function during class initialization Using 'this' as a function argument in a constructor of a non-final class If other classes inherit from the given class, they may not be fully initialized at the moment when an unsafe operation is carried out. Example: 'abstract class Base {\\n      val code = calculate()\\n      abstract fun calculate(): Int\\n  }\\n\\n  class Derived(private val x: Int) : Base() {\\n      override fun calculate() = x\\n  }\\n\\n  fun testIt() {\\n      println(Derived(42).code) // Expected: 42, actual: 0\\n  }'\",\n" +
            "                  \"markdown\": \"Reports unsafe operations with `this` during object construction including:\\n\\n* Accessing a non-final property during class initialization: from a constructor or property initialization\\n* Calling a non-final function during class initialization\\n* Using `this` as a function argument in a constructor of a non-final class\\n\\n\\nIf other classes inherit from the given class,\\nthey may not be fully initialized at the moment when an unsafe operation is carried out.\\n\\n**Example:**\\n\\n\\n      abstract class Base {\\n          val code = calculate()\\n          abstract fun calculate(): Int\\n      }\\n\\n      class Derived(private val x: Int) : Base() {\\n          override fun calculate() = x\\n      }\\n\\n      fun testIt() {\\n          println(Derived(42).code) // Expected: 42, actual: 0\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"LeakingThis\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"AddVarianceModifier\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Type parameter can have 'in' or 'out' variance\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports type parameters that can have 'in' or 'out' variance. Using 'in' and 'out' variance provides more precise type inference in Kotlin and clearer code semantics. Example: 'class Box<T>(val obj: T)\\n\\n  fun consumeString(box: Box<String>) {}\\n  fun consumeCharSequence(box: Box<CharSequence>) {}\\n\\n  fun usage(box: Box<String>) {\\n      consumeString(box)\\n      consumeCharSequence(box) // Compilation error\\n  }' The quick-fix adds the matching variance modifier: 'class Box<out T>(val obj: T)\\n\\n  fun consumeString(box: Box<String>) {}\\n  fun consumeCharSequence(box: Box<CharSequence>) {}\\n\\n  fun usage(box: Box<String>) ++{\\n      consumeString(box)\\n      consumeCharSequence(box) // OK\\n  }'\",\n" +
            "                  \"markdown\": \"Reports type parameters that can have `in` or `out` variance.\\n\\nUsing `in` and `out` variance provides more precise type inference in Kotlin and clearer code semantics.\\n\\n**Example:**\\n\\n\\n      class Box<T>(val obj: T)\\n\\n      fun consumeString(box: Box<String>) {}\\n      fun consumeCharSequence(box: Box<CharSequence>) {}\\n\\n      fun usage(box: Box<String>) {\\n          consumeString(box)\\n          consumeCharSequence(box) // Compilation error\\n      }\\n\\nThe quick-fix adds the matching variance modifier:\\n\\n\\n      class Box<out T>(val obj: T)\\n\\n      fun consumeString(box: Box<String>) {}\\n      fun consumeCharSequence(box: Box<CharSequence>) {}\\n\\n      fun usage(box: Box<String>) ++{\\n          consumeString(box)\\n          consumeCharSequence(box) // OK\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"AddVarianceModifier\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveForLoopIndices\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Unused loop index\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'for' loops iterating over a collection using the 'withIndex()' function and not using the index variable. Use the \\\"Remove indices in 'for' loop\\\" quick-fix to clean up the code. Examples: 'fun foo(bar: List<String>) {\\n     for ((index : Int, value: String) in bar.withIndex()) { // <== 'index' is unused\\n         println(value)\\n     }\\n  }' After the quick-fix is applied: 'fun foo(bar: List<String>) {\\n      for (value: String in bar) { // <== '.withIndex()' and 'index' are removed\\n          println(value)\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `for` loops iterating over a collection using the `withIndex()` function and not using the index variable.\\n\\nUse the \\\"Remove indices in 'for' loop\\\" quick-fix to clean up the code.\\n\\n**Examples:**\\n\\n\\n      fun foo(bar: List<String>) {\\n         for ((index : Int, value: String) in bar.withIndex()) { // <== 'index' is unused\\n             println(value)\\n         }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(bar: List<String>) {\\n          for (value: String in bar) { // <== '.withIndex()' and 'index' are removed\\n              println(value)\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveForLoopIndices\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantSuspendModifier\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant 'suspend' modifier\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'suspend' modifier as redundant if no other suspending functions are called inside.\",\n" +
            "                  \"markdown\": \"Reports `suspend` modifier as redundant if no other suspending functions are called inside.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantSuspendModifier\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SuspiciousAsDynamic\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Suspicious 'asDynamic' member invocation\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports usages of 'asDynamic' function on a receiver of dynamic type. 'asDynamic' function has no effect for expressions of dynamic type. 'asDynamic' function on a receiver of dynamic type can lead to runtime problems because 'asDynamic' will be executed in JavaScript environment, and such function may not be present at runtime. The intended way is to use this function on usual Kotlin type. Remove \\\"asDynamic\\\" invocation quick-fix can be used to amend the code automatically. Example: 'fun wrongUsage(d: Dynamic) {\\n     d.asDynamic().foo() // <== redundant, quick-fix simplifies the call expression to \\\"d.foo()\\\"\\n  }'\",\n" +
            "                  \"markdown\": \"Reports usages of `asDynamic` function on a receiver of dynamic type.\\n\\n`asDynamic` function has no effect for expressions of dynamic type.\\n\\n`asDynamic` function on a receiver of dynamic type can lead to runtime problems because `asDynamic`\\nwill be executed in JavaScript environment, and such function may not be present at runtime.\\nThe intended way is to use this function on usual Kotlin type.\\n\\n**Remove \\\"asDynamic\\\" invocation** quick-fix can be used to amend the code automatically.\\n\\nExample:\\n\\n\\n      fun wrongUsage(d: Dynamic) {\\n         d.asDynamic().foo() // <== redundant, quick-fix simplifies the call expression to \\\"d.foo()\\\"\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SuspiciousAsDynamic\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"FromClosedRangeMigration\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"MIN_VALUE step in fromClosedRange() since 1.3\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'IntProgression.fromClosedRange()' and 'LongProgression.fromClosedRange()' with 'MIN_VALUE' step. It is prohibited to call 'IntProgression.fromClosedRange()' and 'LongProgression.fromClosedRange()' with 'MIN_VALUE' step. All such calls should be checked during migration to Kotlin 1.3+. Example: 'IntProgression.fromClosedRange(12, 143, Int.MIN_VALUE)' To fix the problem change the step of the progression.\",\n" +
            "                  \"markdown\": \"Reports `IntProgression.fromClosedRange()` and `LongProgression.fromClosedRange()` with `MIN_VALUE` step.\\n\\n\\nIt is prohibited to call `IntProgression.fromClosedRange()` and `LongProgression.fromClosedRange()` with\\n`MIN_VALUE` step. All such calls should be checked during migration to Kotlin 1.3+.\\n\\n**Example:**\\n\\n\\n      IntProgression.fromClosedRange(12, 143, Int.MIN_VALUE)\\n\\nTo fix the problem change the step of the progression.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"FromClosedRangeMigration\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveRedundantBackticks\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant backticks\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant backticks in references. Some of the Kotlin keywords are valid identifiers in Java, for example: 'in', 'object', 'is'. If a Java library uses a Kotlin keyword for a method, you can still call the method escaping it with the backtick character ('`'), for example, 'foo.`is`(bar)'. Sometimes this escaping is redundant and can be safely omitted. The inspection discovers and reports such cases and is paired with the 'Remove redundant backticks' quick-fix, which allows you to amend the highlighted code. Examples: 'fun `is`(x: String) {}\\n  fun foo() {\\n      `is`(\\\"bar\\\") // 'is' is a keyword, backticks are required\\n  }\\n\\n  fun `test that smth works as designed`() {} // OK, complex identifier for readability improvement\\n\\n  val `a` = 1  // no need for backticks'\",\n" +
            "                  \"markdown\": \"Reports redundant backticks in references.\\n\\n\\nSome of the Kotlin keywords are valid identifiers in Java, for example: `in`, `object`, `is`.\\nIf a Java library uses a Kotlin keyword for a method, you can still call the method escaping it\\nwith the backtick character (`````), for example, ``foo.`is`(bar)``.\\nSometimes this escaping is redundant and can be safely omitted. The inspection discovers and reports such cases and is\\npaired with the 'Remove redundant backticks' quick-fix, which allows you to amend the highlighted code.\\n\\n**Examples:**\\n\\n\\n      fun `is`(x: String) {}\\n      fun foo() {\\n          `is`(\\\"bar\\\") // 'is' is a keyword, backticks are required\\n      }\\n\\n      fun `test that smth works as designed`() {} // OK, complex identifier for readability improvement\\n\\n      val `a` = 1  // no need for backticks\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveRedundantBackticks\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceReadLineWithReadln\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'readLine' can be replaced with 'readln' or 'readlnOrNull'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls to 'readLine()' that can be replaced with 'readln()' or 'readlnOrNull()'. Using corresponding functions makes your code simpler. The quick-fix replaces 'readLine()!!' with 'readln()' and 'readLine()' with 'readlnOrNull()'. Examples: 'val x = readLine()!!\\n    val y = readLine()?.length' After the quick-fix is applied: 'val x = readln()\\n    val y = readlnOrNull()?.length'\",\n" +
            "                  \"markdown\": \"Reports calls to `readLine()` that can be replaced with `readln()` or `readlnOrNull()`.\\n\\n\\nUsing corresponding functions makes your code simpler.\\n\\n\\nThe quick-fix replaces `readLine()!!` with `readln()` and `readLine()` with `readlnOrNull()`.\\n\\n**Examples:**\\n\\n\\n        val x = readLine()!!\\n        val y = readLine()?.length\\n\\nAfter the quick-fix is applied:\\n\\n\\n        val x = readln()\\n        val y = readlnOrNull()?.length\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceReadLineWithReadln\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SimplifyNestedEachInScopeFunction\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Scope function with nested forEach can be simplified\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'forEach' functions in the scope functions such as 'also' or 'apply' that can be simplified. Convert forEach call to onEach quick-fix can be used to amend the code automatically. Examples: 'fun test(list: List<Int>) {\\n      val x = list.also { it.forEach { it + 4 } }.toString()\\n      val y = list.apply { forEach { println(it) } }\\n  }' After the quick-fix is applied: 'fun test(list: List<Int>) {\\n      val x = list.onEach { it + 4 }.toString()\\n      val y = list.onEach { println(it) }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `forEach` functions in the scope functions such as `also` or `apply` that can be simplified.\\n\\n**Convert forEach call to onEach** quick-fix can be used to amend the code automatically.\\n\\nExamples:\\n\\n\\n      fun test(list: List<Int>) {\\n          val x = list.also { it.forEach { it + 4 } }.toString()\\n          val y = list.apply { forEach { println(it) } }\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test(list: List<Int>) {\\n          val x = list.onEach { it + 4 }.toString()\\n          val y = list.onEach { println(it) }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SimplifyNestedEachInScopeFunction\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"UnsafeCastFromDynamic\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Implicit (unsafe) cast from dynamic type\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports expressions with a dynamic type in the specified inspection scope that are implicitly cast to another type.\",\n" +
            "                  \"markdown\": \"Reports expressions with a dynamic type in the specified inspection scope that are implicitly cast to another type.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"UnsafeCastFromDynamic\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"PublicApiImplicitType\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Public API declaration with implicit return type\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'public' and 'protected' functions and properties that have an implicit return type. For API stability reasons, it's recommended to specify such types explicitly. Example: 'fun publicFunctionWhichAbusesTypeInference() =\\n      otherFunctionWithNotObviousReturnType() ?: yetAnotherFunctionWithNotObviousReturnType()' After the quick-fix is applied: 'fun publicFunctionWhichAbusesTypeInference(): Api =\\n      otherFunctionWithNotObviousReturnType() ?: yetAnotherFunctionWithNotObviousReturnType()'\",\n" +
            "                  \"markdown\": \"Reports `public` and `protected` functions and properties that have an implicit return type.\\nFor API stability reasons, it's recommended to specify such types explicitly.\\n\\n**Example:**\\n\\n\\n      fun publicFunctionWhichAbusesTypeInference() =\\n          otherFunctionWithNotObviousReturnType() ?: yetAnotherFunctionWithNotObviousReturnType()\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun publicFunctionWhichAbusesTypeInference(): Api =\\n          otherFunctionWithNotObviousReturnType() ?: yetAnotherFunctionWithNotObviousReturnType()\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"PublicApiImplicitType\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Other problems\",\n" +
            "                      \"index\": 60,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"DeclaringClassMigration\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Deprecated 'Enum.declaringClass' property\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'declaringClass' property calls on Enum that will lead to compilation error since 1.9. 'Enum.getDeclaringClass' is among \\\"hidden\\\" Java functions which aren't normally visible by resolve. However, it's visible via synthetic property that is a front-end bug. More details: KT-49653 Deprecate and remove Enum.declaringClass synthetic property The quick-fix replaces a call with 'declaringJavaClass'. Example: 'fun <E: Enum<E>> foo(values: Array<E>) {\\n    EnumSet.noneOf(values.first().declaringClass)\\n  }' After the quick-fix is applied: 'fun <E: Enum<E>> foo(values: Array<E>) {\\n    EnumSet.noneOf(values.first().declaringJavaClass)\\n  }' This inspection only reports if the Kotlin language level of the project or module is 1.7 or higher.\",\n" +
            "                  \"markdown\": \"Reports 'declaringClass' property calls on Enum that will lead to compilation error since 1.9.\\n\\n'Enum.getDeclaringClass' is among \\\"hidden\\\" Java functions which aren't normally visible by resolve. However, it's visible via synthetic\\nproperty that is a front-end bug.\\n\\n**More details:** [KT-49653 Deprecate and remove Enum.declaringClass synthetic\\nproperty](https://youtrack.jetbrains.com/issue/KT-49653)\\n\\nThe quick-fix replaces a call with 'declaringJavaClass'.\\n\\n**Example:**\\n\\n\\n      fun <E: Enum<E>> foo(values: Array<E>) {\\n        EnumSet.noneOf(values.first().declaringClass)\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun <E: Enum<E>> foo(values: Array<E>) {\\n        EnumSet.noneOf(values.first().declaringJavaClass)\\n      }\\n\\nThis inspection only reports if the Kotlin language level of the project or module is 1.7 or higher.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"DeclaringClassMigration\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceMapIndexedWithListGenerator\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Replace 'mapIndexed' with List generator\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports a 'mapIndexed' call that can be replaced by 'List' generator. Example: 'val a = listOf(1, 2, 3).mapIndexed { i, _ ->\\n      i + 42\\n  }' After the quick-fix is applied: 'val a = List(listOf(1, 2, 3).size) { i ->\\n          i + 42\\n  }'\",\n" +
            "                  \"markdown\": \"Reports a `mapIndexed` call that can be replaced by `List` generator.\\n\\n**Example:**\\n\\n\\n      val a = listOf(1, 2, 3).mapIndexed { i, _ ->\\n          i + 42\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      val a = List(listOf(1, 2, 3).size) { i ->\\n              i + 42\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceMapIndexedWithListGenerator\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ControlFlowWithEmptyBody\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Control flow with empty body\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'if', 'while', 'do' or 'for' statements with empty bodies. While occasionally intended, this construction is confusing and often the result of a typo. The quick-fix removes a statement. Example: 'if (a > b) {}'\",\n" +
            "                  \"markdown\": \"Reports `if`, `while`, `do` or `for` statements with empty bodies.\\n\\nWhile occasionally intended, this construction is confusing and often the result of a typo.\\n\\nThe quick-fix removes a statement.\\n\\n**Example:**\\n\\n\\n      if (a > b) {}\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ControlFlowWithEmptyBody\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"LoopToCallChain\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Loop can be replaced with stdlib operations\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'for' loops that can be replaced with a sequence of stdlib operations (like 'map', 'filter', and so on). Example: 'fun foo(list: List<String>): List<Int> {\\n  val result = ArrayList<Int>()\\n  for (s in list) {\\n     if (s.length > 0)\\n       result.add(s.hashCode())\\n     }\\n  return result\\n}' After the quick-fix is applied: 'fun foo(list: List<String>): List<Int> {\\n  val result = list\\n    .filter { it.length > 0 }\\n    .map { it.hashCode() }\\n  return result\\n}'\",\n" +
            "                  \"markdown\": \"Reports `for` loops that can be replaced with a sequence of stdlib operations (like `map`, `filter`, and so on).\\n\\n**Example:**\\n\\n\\n    fun foo(list: List<String>): List<Int> {\\n      val result = ArrayList<Int>()\\n      for (s in list) {\\n         if (s.length > 0)\\n           result.add(s.hashCode())\\n         }\\n      return result\\n    }\\n\\nAfter the quick-fix is applied:\\n\\n\\n    fun foo(list: List<String>): List<Int> {\\n      val result = list\\n        .filter { it.length > 0 }\\n        .map { it.hashCode() }\\n      return result\\n    }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"LoopToCallChain\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RemoveEmptyClassBody\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Replace empty class body\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports declarations of classes and objects with an empty body. Use the 'Remove redundant empty class body' quick-fix to clean up the code. Examples: 'class EmptyA() {} // <== empty body\\n\\n  class EmptyB {\\n      companion object {} // <== empty body\\n  }\\n\\n  fun emptyC() {\\n     object {} // <== anonymous object, it's ok (not reported)\\n  }' After the quick fix is applied: 'class EmptyA()\\n\\n  class EmptyB {\\n      companion object\\n  }\\n\\n  fun emptyC() {\\n     object {}\\n  }'\",\n" +
            "                  \"markdown\": \"Reports declarations of classes and objects with an empty body.\\n\\nUse the 'Remove redundant empty class body' quick-fix to clean up the code.\\n\\n**Examples:**\\n\\n\\n      class EmptyA() {} // <== empty body\\n\\n      class EmptyB {\\n          companion object {} // <== empty body\\n      }\\n\\n      fun emptyC() {\\n         object {} // <== anonymous object, it's ok (not reported)\\n      }\\n\\nAfter the quick fix is applied:\\n\\n\\n      class EmptyA()\\n\\n      class EmptyB {\\n          companion object\\n      }\\n\\n      fun emptyC() {\\n         object {}\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RemoveEmptyClassBody\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"CanBeParameter\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Constructor parameter is never used as a property\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports primary constructor parameters that can have 'val' or 'var' removed. Class properties declared in the constructor increase memory consumption. If the parameter value is only used in the constructor, you can omit them. Note that the referenced object might be garbage-collected earlier. Example: 'class Task(val name: String) {\\n      init {\\n          print(\\\"Task created: $name\\\")\\n      }\\n  }' The quick-fix removes the extra 'val' or 'var' keyword: 'class Task(name: String) {\\n      init {\\n          print(\\\"Task created: $name\\\")\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports primary constructor parameters that can have `val` or `var` removed.\\n\\n\\nClass properties declared in the constructor increase memory consumption.\\nIf the parameter value is only used in the constructor, you can omit them.\\n\\nNote that the referenced object might be garbage-collected earlier.\\n\\n**Example:**\\n\\n\\n      class Task(val name: String) {\\n          init {\\n              print(\\\"Task created: $name\\\")\\n          }\\n      }\\n\\nThe quick-fix removes the extra `val` or `var` keyword:\\n\\n\\n      class Task(name: String) {\\n          init {\\n              print(\\\"Task created: $name\\\")\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"CanBeParameter\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantReturnLabel\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant 'return' label\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant return labels outside of lambda expressions. Example: 'fun test() {\\n      return@test\\n  }' After the quick-fix is applied: 'fun test() {\\n      return\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant return labels outside of lambda expressions.\\n\\n**Example:**\\n\\n\\n      fun test() {\\n          return@test\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test() {\\n          return\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantReturnLabel\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"PackageName\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Package naming convention\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports package names that do not follow the naming conventions. You can specify the required pattern in the inspection options. Recommended naming conventions: names of packages are always lowercase and should not contain underscores. Example: 'org.example.project' Using multi-word names is generally discouraged, but if you do need to use multiple words, you can either just concatenate them together or use camel case Example: 'org.example.myProject'\",\n" +
            "                  \"markdown\": \"Reports package names that do not follow the naming conventions.\\n\\nYou can specify the required pattern in the inspection options.\\n\\n[Recommended naming conventions](https://kotlinlang.org/docs/coding-conventions.html#naming-rules): names of packages are always lowercase and should not contain underscores.\\n\\n**Example:**\\n`org.example.project`\\n\\nUsing multi-word names is generally discouraged, but if you do need to use multiple words, you can either just concatenate them together or use camel case\\n\\n**Example:**\\n`org.example.myProject`\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"PackageName\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Naming conventions\",\n" +
            "                      \"index\": 71,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ProhibitUseSiteTargetAnnotationsOnSuperTypesMigration\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Meaningless annotations targets on superclass\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports meaningless annotation targets on superclasses since Kotlin 1.4. Annotation targets such as '@get:' are meaningless on superclasses and are prohibited. Example: 'interface Foo\\n\\n  annotation class Ann\\n\\n  class E : @field:Ann @get:Ann @set:Ann @setparam:Ann Foo' After the quick-fix is applied: 'interface Foo\\n\\n  annotation class Ann\\n\\n  class E : Foo' This inspection only reports if the Kotlin language level of the project or module is 1.4 or higher.\",\n" +
            "                  \"markdown\": \"Reports meaningless annotation targets on superclasses since Kotlin 1.4.\\n\\nAnnotation targets such as `@get:` are meaningless on superclasses and are prohibited.\\n\\n**Example:**\\n\\n\\n      interface Foo\\n\\n      annotation class Ann\\n\\n      class E : @field:Ann @get:Ann @set:Ann @setparam:Ann Foo\\n\\nAfter the quick-fix is applied:\\n\\n\\n      interface Foo\\n\\n      annotation class Ann\\n\\n      class E : Foo\\n\\nThis inspection only reports if the Kotlin language level of the project or module is 1.4 or higher.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ProhibitUseSiteTargetAnnotationsOnSuperTypesMigration\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ReplaceWithEnumMap\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'HashMap' can be replaced with 'EnumMap'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'hashMapOf' function or 'HashMap' constructor calls that can be replaced with an 'EnumMap' constructor call. Using 'EnumMap' constructor makes your code simpler. The quick-fix replaces the function call with the 'EnumMap' constructor call. Example: 'enum class E {\\n      A, B\\n  }\\n\\n  fun getMap(): Map<E, String> = hashMapOf()' After the quick-fix is applied: 'enum class E {\\n      A, B\\n  }\\n\\n  fun getMap(): Map<E, String> = EnumMap(E::class.java)'\",\n" +
            "                  \"markdown\": \"Reports `hashMapOf` function or `HashMap` constructor calls that can be replaced with an `EnumMap` constructor call.\\n\\nUsing `EnumMap` constructor makes your code simpler.\\n\\nThe quick-fix replaces the function call with the `EnumMap` constructor call.\\n\\n**Example:**\\n\\n\\n      enum class E {\\n          A, B\\n      }\\n\\n      fun getMap(): Map<E, String> = hashMapOf()\\n\\nAfter the quick-fix is applied:\\n\\n\\n      enum class E {\\n          A, B\\n      }\\n\\n      fun getMap(): Map<E, String> = EnumMap(E::class.java)\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ReplaceWithEnumMap\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Other problems\",\n" +
            "                      \"index\": 60,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"EnumValuesSoftDeprecate\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'Enum.values()' is recommended to be replaced by 'Enum.entries' since 1.9\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports calls from Kotlin to 'values()' method in enum classes that can be replaced with 'entries' property read. Use of 'Enum.entries' may improve performance of your code. The quick-fix replaces 'values()' with 'entries'. More details: KT-48872 Provide modern and performant replacement for Enum.values() Note: 'entries' property type is different from the return type of 'values()' method ('EnumEntries<T>' which inherits from 'List<T>' instead of 'Array<T>'). Due to this in some cases quick fix inserts extra '.toTypedArray()' conversion to not break the code, but for most common cases replacement will be done without it (e.g. in 'for' loop). Example: 'enum class Version {\\n        V1, V2\\n    }\\n\\n    Version.values().forEach { /* .. */ }\\n    val firstVersion = Version.values()[0]\\n    functionExpectingArray(Version.values())' After the quick-fix is applied: 'enum class Version {\\n        V1, V2\\n    }\\n\\n    Version.entries.forEach { /* .. */ }\\n    val firstVersion = Version.entries[0]\\n    functionExpectingArray(Version.entries.toTypedArray())'\",\n" +
            "                  \"markdown\": \"Reports calls from Kotlin to `values()` method in enum classes that can be replaced with `entries` property read.\\n\\n\\nUse of `Enum.entries` may improve performance of your code.\\n\\n\\nThe quick-fix replaces `values()` with `entries`.\\n\\n\\n**More details:** [KT-48872 Provide modern and performant replacement for Enum.values()](https://youtrack.jetbrains.com/issue/KT-48872)\\n\\n\\n**Note:** `entries` property type is different from the return type of `values()` method\\n(`EnumEntries<T>` which inherits from `List<T>` instead of `Array<T>`).\\nDue to this in some cases quick fix inserts extra `.toTypedArray()` conversion to not break the code, but\\nfor most common cases replacement will be done without it (e.g. in `for` loop).\\n\\n**Example:**\\n\\n\\n        enum class Version {\\n            V1, V2\\n        }\\n\\n        Version.values().forEach { /* .. */ }\\n        val firstVersion = Version.values()[0]\\n        functionExpectingArray(Version.values())\\n\\nAfter the quick-fix is applied:\\n\\n\\n        enum class Version {\\n            V1, V2\\n        }\\n\\n        Version.entries.forEach { /* .. */ }\\n        val firstVersion = Version.entries[0]\\n        functionExpectingArray(Version.entries.toTypedArray())\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"EnumValuesSoftDeprecate\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Other problems\",\n" +
            "                      \"index\": 60,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"SuspiciousCollectionReassignment\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Augmented assignment creates a new collection under the hood\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports augmented assignment ('+=') expressions on a read-only 'Collection'. Augmented assignment ('+=') expression on a read-only 'Collection' temporarily allocates a new collection, which may hurt performance. Change type to mutable quick-fix can be used to amend the code automatically. Example: 'fun test() {\\n      var list = listOf(0)\\n      list += 42 // A new list is allocated here, equivalent to list = list + 42\\n  }' After the quick-fix is applied: 'fun test() {\\n      val list = mutableListOf(0)\\n      list += 42\\n  }'\",\n" +
            "                  \"markdown\": \"Reports augmented assignment (`+=`) expressions on a read-only `Collection`.\\n\\nAugmented assignment (`+=`) expression on a read-only `Collection` temporarily allocates a new collection,\\nwhich may hurt performance.\\n\\n**Change type to mutable** quick-fix can be used to amend the code automatically.\\n\\nExample:\\n\\n\\n      fun test() {\\n          var list = listOf(0)\\n          list += 42 // A new list is allocated here, equivalent to list = list + 42\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun test() {\\n          val list = mutableListOf(0)\\n          list += 42\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"SuspiciousCollectionReassignment\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantNotNullExtensionReceiverOfInline\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'inline fun' extension receiver can be explicitly nullable until Kotlin 1.2\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports inline functions with non-nullable extension receivers which don't use the fact that extension receiver is not nullable. Before Kotlin 1.2, calls of 'inline fun' with flexible nullable extension receiver (a platform type with an unknown nullability) did not include nullability checks in bytecode. Since Kotlin 1.2, nullability checks are included into the bytecode (see KT-12899). Thus functions which do not use the fact that extension receiver is not nullable are dangerous in Kotlin until 1.2 and it's recommended to make such functions to have nullable receiver. Example: 'inline fun String.greet() {\\n      println(\\\"Hello, $this!\\\")\\n  }\\n\\n  fun main() {\\n      // `System.getProperty` returns not denotable `String!` type\\n      val user = System.getProperty(\\\"user.name\\\")\\n      user.greet()\\n  }' After the quick-fix is applied: 'inline fun String.greet() {\\n      println(\\\"Hello, $this!\\\")\\n  }\\n\\n  fun main() {\\n      // `System.getProperty` returns not denotable `String!` type\\n      val user = System.getProperty(\\\"user.name\\\")\\n      user.greet()\\n  }' This inspection only reports if the Kotlin language level of the project or module is lower than 1.2.\",\n" +
            "                  \"markdown\": \"Reports inline functions with non-nullable extension receivers which don't use the fact that extension receiver is not nullable.\\n\\n\\nBefore Kotlin 1.2, calls of `inline fun` with flexible nullable extension receiver (a platform type with an unknown\\nnullability) did not include nullability checks in bytecode. Since Kotlin 1.2, nullability checks are included into the bytecode\\n(see [KT-12899](https://youtrack.jetbrains.com/issue/KT-12899)).\\n\\n\\nThus functions which do not use the fact that extension receiver is not nullable are dangerous in Kotlin until 1.2 and it's\\nrecommended to make such functions to have nullable receiver.\\n\\n**Example:**\\n\\n\\n      inline fun String.greet() {\\n          println(\\\"Hello, $this!\\\")\\n      }\\n\\n      fun main() {\\n          // `System.getProperty` returns not denotable `String!` type\\n          val user = System.getProperty(\\\"user.name\\\")\\n          user.greet()\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      inline fun String.greet() {\\n          println(\\\"Hello, $this!\\\")\\n      }\\n\\n      fun main() {\\n          // `System.getProperty` returns not denotable `String!` type\\n          val user = System.getProperty(\\\"user.name\\\")\\n          user.greet()\\n      }\\n\\nThis inspection only reports if the Kotlin language level of the project or module is lower than 1.2.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantNotNullExtensionReceiverOfInline\",\n" +
            "                    \"ideaSeverity\": \"INFORMATION\",\n" +
            "                    \"qodanaSeverity\": \"Info\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Java interop issues\",\n" +
            "                      \"index\": 79,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"RedundantElvisReturnNull\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Redundant '?: return null'\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports redundant '?: return null' Example: 'fun foo(): Int? {\\n      ...\\n  }\\n\\n  fun test() : Int? {\\n      return foo() ?: return null\\n  }' After the quick-fix is applied: 'fun foo(): Int? {\\n      ...\\n  }\\n\\n  fun test() : Int? {\\n      return foo()\\n  }'\",\n" +
            "                  \"markdown\": \"Reports redundant `?: return null`\\n\\n**Example:**\\n\\n\\n      fun foo(): Int? {\\n          ...\\n      }\\n\\n      fun test() : Int? {\\n          return foo() ?: return null\\n      }\\n\\nAfter the quick-fix is applied:\\n\\n\\n      fun foo(): Int? {\\n          ...\\n      }\\n\\n      fun test() : Int? {\\n          return foo()\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"RedundantElvisReturnNull\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Redundant constructs\",\n" +
            "                      \"index\": 4,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"PrivatePropertyName\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Private property naming convention\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports private property names that do not follow the recommended naming conventions. Consistent naming allows for easier code reading and understanding. According to the Kotlin official style guide, private property names should start with a lowercase letter and use camel case. Optionally, underscore prefix is allowed but only for private properties. It is possible to introduce other naming rules by changing the \\\"Pattern\\\" regular expression. Example: 'val _My_Cool_Property = \\\"\\\"' The quick-fix renames the class according to the Kotlin naming conventions: 'val _myCoolProperty = \\\"\\\"'\",\n" +
            "                  \"markdown\": \"Reports private property names that do not follow the recommended naming conventions.\\n\\n\\nConsistent naming allows for easier code reading and understanding.\\nAccording to the [Kotlin official style guide](https://kotlinlang.org/docs/coding-conventions.html#naming-rules),\\nprivate property names should start with a lowercase letter and use camel case.\\nOptionally, underscore prefix is allowed but only for **private** properties.\\n\\nIt is possible to introduce other naming rules by changing the \\\"Pattern\\\" regular expression.\\n\\n**Example:**\\n\\n\\n      val _My_Cool_Property = \\\"\\\"\\n\\nThe quick-fix renames the class according to the Kotlin naming conventions:\\n\\n\\n      val _myCoolProperty = \\\"\\\"\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"note\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"PrivatePropertyName\",\n" +
            "                    \"ideaSeverity\": \"WEAK WARNING\",\n" +
            "                    \"qodanaSeverity\": \"Moderate\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Naming conventions\",\n" +
            "                      \"index\": 71,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"KotlinJvmAnnotationInJava\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Kotlin JVM annotation in Java\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports useless Kotlin JVM annotations in Java code. Example: 'import kotlin.jvm.Volatile;\\n\\n  public class Test {\\n      @Volatile\\n      public int i;\\n  }'\",\n" +
            "                  \"markdown\": \"Reports useless Kotlin JVM annotations in Java code.\\n\\n**Example:**\\n\\n\\n      import kotlin.jvm.Volatile;\\n\\n      public class Test {\\n          @Volatile\\n          public int i;\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"KotlinJvmAnnotationInJava\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Java interop issues\",\n" +
            "                      \"index\": 79,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"ObsoleteKotlinJsPackages\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"'kotlin.browser' and 'kotlin.dom' packages are deprecated since 1.4\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports usages of 'kotlin.dom' and 'kotlin.browser' packages. These packages were moved to 'kotlinx.dom' and 'kotlinx.browser' respectively in Kotlin 1.4+.\",\n" +
            "                  \"markdown\": \"Reports usages of `kotlin.dom` and `kotlin.browser` packages.\\n\\nThese packages were moved to `kotlinx.dom` and `kotlinx.browser`\\nrespectively in Kotlin 1.4+.\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"error\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"ObsoleteKotlinJsPackages\",\n" +
            "                    \"ideaSeverity\": \"ERROR\",\n" +
            "                    \"qodanaSeverity\": \"Critical\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Migration\",\n" +
            "                      \"index\": 15,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"CascadeIf\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Cascade if can be replaced with when\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports 'if' statements with three or more branches that can be replaced with the 'when' expression. Example: 'fun checkIdentifier(id: String) {\\n      fun Char.isIdentifierStart() = this in 'A'..'z'\\n      fun Char.isIdentifierPart() = isIdentifierStart() || this in '0'..'9'\\n\\n      if (id.isEmpty()) {\\n          print(\\\"Identifier is empty\\\")\\n      } else if (!id.first().isIdentifierStart()) {\\n          print(\\\"Identifier should start with a letter\\\")\\n      } else if (!id.subSequence(1, id.length).all(Char::isIdentifierPart)) {\\n          print(\\\"Identifier should contain only letters and numbers\\\")\\n      }\\n  }' The quick-fix converts the 'if' expression to 'when': 'fun checkIdentifier(id: String) {\\n      fun Char.isIdentifierStart() = this in 'A'..'z'\\n      fun Char.isIdentifierPart() = isIdentifierStart() || this in '0'..'9'\\n\\n      when {\\n          id.isEmpty() -> {\\n              print(\\\"Identifier is empty\\\")\\n          }\\n          !id.first().isIdentifierStart() -> {\\n              print(\\\"Identifier should start with a letter\\\")\\n          }\\n          !id.subSequence(1, id.length).all(Char::isIdentifierPart) -> {\\n              print(\\\"Identifier should contain only letters and numbers\\\")\\n          }\\n      }\\n  }'\",\n" +
            "                  \"markdown\": \"Reports `if` statements with three or more branches that can be replaced with the `when` expression.\\n\\n**Example:**\\n\\n\\n      fun checkIdentifier(id: String) {\\n          fun Char.isIdentifierStart() = this in 'A'..'z'\\n          fun Char.isIdentifierPart() = isIdentifierStart() || this in '0'..'9'\\n\\n          if (id.isEmpty()) {\\n              print(\\\"Identifier is empty\\\")\\n          } else if (!id.first().isIdentifierStart()) {\\n              print(\\\"Identifier should start with a letter\\\")\\n          } else if (!id.subSequence(1, id.length).all(Char::isIdentifierPart)) {\\n              print(\\\"Identifier should contain only letters and numbers\\\")\\n          }\\n      }\\n\\nThe quick-fix converts the `if` expression to `when`:\\n\\n\\n      fun checkIdentifier(id: String) {\\n          fun Char.isIdentifierStart() = this in 'A'..'z'\\n          fun Char.isIdentifierPart() = isIdentifierStart() || this in '0'..'9'\\n\\n          when {\\n              id.isEmpty() -> {\\n                  print(\\\"Identifier is empty\\\")\\n              }\\n              !id.first().isIdentifierStart() -> {\\n                  print(\\\"Identifier should start with a letter\\\")\\n              }\\n              !id.subSequence(1, id.length).all(Char::isIdentifierPart) -> {\\n                  print(\\\"Identifier should contain only letters and numbers\\\")\\n              }\\n          }\\n      }\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": false,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"CascadeIf\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Style issues\",\n" +
            "                      \"index\": 2,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"EmptyRange\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Range with start greater than endInclusive is empty\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports ranges that are empty because the 'start' value is greater than the 'endInclusive' value. Example: 'val range = 2..1' The quick-fix changes the '..' operator to 'downTo': 'val range = 2 downTo 1'\",\n" +
            "                  \"markdown\": \"Reports ranges that are empty because the `start` value is greater than the `endInclusive` value.\\n\\n**Example:**\\n\\n\\n      val range = 2..1\\n\\nThe quick-fix changes the `..` operator to `downTo`:\\n\\n\\n      val range = 2 downTo 1\\n\"\n" +
            "                },\n" +
            "                \"defaultConfiguration\": {\n" +
            "                  \"enabled\": true,\n" +
            "                  \"level\": \"warning\",\n" +
            "                  \"parameters\": {\n" +
            "                    \"suppressToolId\": \"EmptyRange\",\n" +
            "                    \"ideaSeverity\": \"WARNING\",\n" +
            "                    \"qodanaSeverity\": \"High\"\n" +
            "                  }\n" +
            "                },\n" +
            "                \"relationships\": [\n" +
            "                  {\n" +
            "                    \"target\": {\n" +
            "                      \"id\": \"Kotlin/Probable bugs\",\n" +
            "                      \"index\": 28,\n" +
            "                      \"toolComponent\": {\n" +
            "                        \"name\": \"QDJVM\"\n" +
            "                      }\n" +
            "                    },\n" +
            "                    \"kinds\": [\n" +
            "                      \"superset\"\n" +
            "                    ]\n" +
            "                  }\n" +
            "                ]\n" +
            "              },\n" +
            "              {\n" +
            "                \"id\": \"NonExternalClassifierExtendingStateOrProps\",\n" +
            "                \"shortDescription\": {\n" +
            "                  \"text\": \"Non-external classifier extending State or Props\"\n" +
            "                },\n" +
            "                \"fullDescription\": {\n" +
            "                  \"text\": \"Reports non-external classifier extending State or Props. Read more in the migration guide.\",\n" +
            "                  \"markdown\": \"Reports non-external classifier extending State or Props. Read more in the [migration guide](https://kotlinlang.org/docs/js-ir-migration.html#convert-js-and-react-related-classes-and-interfaces-to-external-interfaces).\"\n" +
            "}";





































































    public static void main(String[] args) {
        if (true) {

        }
    }
}
