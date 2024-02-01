# [](https://github.com/phodal/chapi/compare/v2.3.3...v) (2024-02-01)



## [2.3.3](https://github.com/phodal/chapi/compare/v2.3.2...v2.3.3) (2024-02-01)


### Bug Fixes

* **c:** disable macro for testing performance ([7f29459](https://github.com/phodal/chapi/commit/7f294590915b1eca204c2a41bedde4fe077c850e))
* **c:** fix handling of structOrUnionSpecifier nodeName [#24](https://github.com/phodal/chapi/issues/24) ([eb3ee99](https://github.com/phodal/chapi/commit/eb3ee999280499041cd1078175f3da080c4ab329))
* **c:** fix macro declaration and test file path ([19ed1df](https://github.com/phodal/chapi/commit/19ed1df5ab17528cff2bd792e9c4ebddee2c5927))
* **c:** format code ([2e4401a](https://github.com/phodal/chapi/commit/2e4401ae30a238ca7e50d506502aad35917517d5))
* **chapi-ast-c:** fix macro expansion declaration in C.g4 [#24](https://github.com/phodal/chapi/issues/24) ([84d5421](https://github.com/phodal/chapi/commit/84d5421b39949e3bc2f32c09dc590296775188a8))
* **chapi-ast-c:** fix macroCastDeclaration in C.g4 ([42263d5](https://github.com/phodal/chapi/commit/42263d5271ce3b7c8acfaa7bec4ddaca3a1fa9b2))
* **chapi-ast-c:** fix macroCastDeclaration in C.g4 ([f17c84b](https://github.com/phodal/chapi/commit/f17c84b5acfedd6239d43b19bf27f9b2dea63c3a))
* **chapi-ast-c:** modify grammar rules for single line macro declarations [#24](https://github.com/phodal/chapi/issues/24) ([89e2082](https://github.com/phodal/chapi/commit/89e20820f4950ae104a9e91dee9b665043915b5e))
* **c:** modify singleLineMacroDeclaration and macroKeywords [#24](https://github.com/phodal/chapi/issues/24) ([0eb39a6](https://github.com/phodal/chapi/commit/0eb39a6becfc7d4b717f86e93c3575071fd44e97))


### Features

* **c:** add support for asmBody in C grammar [#24](https://github.com/phodal/chapi/issues/24) ([841b0e9](https://github.com/phodal/chapi/commit/841b0e9570492b63c628ed05dd3fdf8272400d8d))
* **c:** add support for macro alias declaration [#24](https://github.com/phodal/chapi/issues/24) ([8744a9d](https://github.com/phodal/chapi/commit/8744a9d5891c9272edb7a35d5c2081c3e54fb983))
* **c:** add support for macro expansion declaration [#24](https://github.com/phodal/chapi/issues/24) ([2d2eecf](https://github.com/phodal/chapi/commit/2d2eecf5670e5de2a558cd9161150850b641d70e))
* **c:** add support for macro function declaration [#24](https://github.com/phodal/chapi/issues/24) ([7a07305](https://github.com/phodal/chapi/commit/7a073052bb6cc21e0c794746bf84ed57afa2ab63))
* **c:** add support for macro in array access [#24](https://github.com/phodal/chapi/issues/24) ([3c16528](https://github.com/phodal/chapi/commit/3c16528ee41cbe42b46de82c767354067143b0e2))
* **c:** add support for macro postfix call [#24](https://github.com/phodal/chapi/issues/24) ([6f160bb](https://github.com/phodal/chapi/commit/6f160bbd08de6298f4c06c67a21f39d431337419))
* **c:** add support for macro statements [#24](https://github.com/phodal/chapi/issues/24) ([3fe1789](https://github.com/phodal/chapi/commit/3fe17898f325a1e7d75e519d295ade0e1c2e1e68))
* **c:** add support for macro statements [#24](https://github.com/phodal/chapi/issues/24) ([cc7ce0f](https://github.com/phodal/chapi/commit/cc7ce0f6ed913672b2ab79bbdbd0a6d78bc605ef))
* **c:** add support for single line macro declaration [#24](https://github.com/phodal/chapi/issues/24) ([56c876f](https://github.com/phodal/chapi/commit/56c876f24d4b3dc27d91b693e13f57161bb0a114))
* **c:** add support for single line macro declarations [#24](https://github.com/phodal/chapi/issues/24) ([ff26513](https://github.com/phodal/chapi/commit/ff26513b9c42ed67ab20a02ad841aedb49155564))
* **chapi-ast-c:** add support for macro statements [#24](https://github.com/phodal/chapi/issues/24) ([879e24f](https://github.com/phodal/chapi/commit/879e24ff2498de0a5f47eb8287a01c0ed1e11285))
* **chapi-ast-c:** add support for macro statements in C grammar [#24](https://github.com/phodal/chapi/issues/24) ([0ba7673](https://github.com/phodal/chapi/commit/0ba7673351cef286f0ee3f96a5ae3a86caed791a))
* **c:** modify defineDirectDeclarator rule in C.g4 ([8536913](https://github.com/phodal/chapi/commit/8536913c3bbf5ef8614fd597067ba6bd276d97b1))
* **c:** refactor support for macro expansion [#24](https://github.com/phodal/chapi/issues/24) ([924fcdb](https://github.com/phodal/chapi/commit/924fcdbb94f6863688b8a31601fac0170414fb71))



## [2.3.2](https://github.com/phodal/chapi/compare/v2.3.1...v2.3.2) (2024-01-30)


### Bug Fixes

* **cc:** add default NodeName to defaultDataStruct [#24](https://github.com/phodal/chapi/issues/24) ([7c3b9d6](https://github.com/phodal/chapi/commit/7c3b9d6a01dab7eaa6457289c077645efebfed55))
* **c:** fix imports issue [#24](https://github.com/phodal/chapi/issues/24) ([bd0e7ec](https://github.com/phodal/chapi/commit/bd0e7eca66e2b1b5f52fbbd7caa40db9b79ce7bd))
* **c:** fix macro call block declaration and macro keywords in C grammar [#24](https://github.com/phodal/chapi/issues/24) ([7d60204](https://github.com/phodal/chapi/commit/7d60204f20573502619c82294a04e8848abbc8b6))
* **c:** fix missing semicolon in expressionStatement ([46cd01d](https://github.com/phodal/chapi/commit/46cd01d3a160e8285511ea5d6fbda49b535f3445))
* **c:** fix parsing of function names with multiple identifiers [#24](https://github.com/phodal/chapi/issues/24) ([dc538e2](https://github.com/phodal/chapi/commit/dc538e2943369a0087ca9afc97a800d47fa2446c))
* **chapi-ast-c:** modify C.g4 to support multiple macro declarations [#24](https://github.com/phodal/chapi/issues/24) ([df1d26f](https://github.com/phodal/chapi/commit/df1d26f18d76804af6f7b14e1df423f0924bcf1c))


### Features

* **c:** add macro support to primaryExpression and genericSelection [#24](https://github.com/phodal/chapi/issues/24) ([dae101f](https://github.com/phodal/chapi/commit/dae101f0dd072de2e035e8ce3038e70bd0a37a2d))
* **c:** add support for C keywords in includeIdentifier [#24](https://github.com/phodal/chapi/issues/24) ([ad1780d](https://github.com/phodal/chapi/commit/ad1780d1846839063771009db3d5379bb7d9749e))
* **c:** add support for including identifiers with slashes [#24](https://github.com/phodal/chapi/issues/24) ([7f2ded2](https://github.com/phodal/chapi/commit/7f2ded2838eaaf47afe17df93718c89f407c62ad))
* **c:** add support for macro calls and upper case identifiers [#24](https://github.com/phodal/chapi/issues/24) ([f546e18](https://github.com/phodal/chapi/commit/f546e1859da1816c70ddb082df3ce5852cb16251))
* **c:** add support for macro cast declaration [#24](https://github.com/phodal/chapi/issues/24) ([86896ac](https://github.com/phodal/chapi/commit/86896ac438372ff7090ee7371c7c1b11e3c9b208))
* **c:** add support for single-line macro declarations [#24](https://github.com/phodal/chapi/issues/24) ([9510ba7](https://github.com/phodal/chapi/commit/9510ba70ac3aeb295279456963958ccab9dd642e))
* **chapi-ast-c:** add support for 'elif' macro keyword [#24](https://github.com/phodal/chapi/issues/24) ([b5b7c5f](https://github.com/phodal/chapi/commit/b5b7c5fcc1f526111cd0dbee9990055afb511234))
* **chapi-ast-c:** add support for additional macro keyword in C.g4 [#24](https://github.com/phodal/chapi/issues/24) ([799a3f6](https://github.com/phodal/chapi/commit/799a3f68fcec2949bdf751fbd5584d7e22668bc8))
* **chapi-ast-c:** add support for block macro calls [#24](https://github.com/phodal/chapi/issues/24) ([119f69f](https://github.com/phodal/chapi/commit/119f69f286b6278798fc75a6f3da9affca1625a3))
* **chapi-ast-c:** add support for ifndef macro keyword [#24](https://github.com/phodal/chapi/issues/24) ([84ce0e4](https://github.com/phodal/chapi/commit/84ce0e40b817312bb0ab763b4c080cd3c2d6d7db))
* **c:** improve include declaration handling [#24](https://github.com/phodal/chapi/issues/24) ([7feb7ca](https://github.com/phodal/chapi/commit/7feb7caa8c2ea4b0a29f86609e007d4ad61dad08))
* **c:** modify C grammar to support one-line macro declarations [#24](https://github.com/phodal/chapi/issues/24) ([a04ad5d](https://github.com/phodal/chapi/commit/a04ad5dcd7f82cc204345cddf3964df444054dae))
* **c:** modify C grammar to support one-line macro declarations [#24](https://github.com/phodal/chapi/issues/24) ([214a150](https://github.com/phodal/chapi/commit/214a1504f3e64430b3a532664384458d819befae))



## [2.3.1](https://github.com/phodal/chapi/compare/v2.3.0...v2.3.1) (2024-01-30)


### Bug Fixes

* **c:** allow multiple include declarations in C grammar ([f19d745](https://github.com/phodal/chapi/commit/f19d7453ba14f4d2c96f36974a6a7577336b7b99))



# [2.3.0](https://github.com/phodal/chapi/compare/v2.2.3...v2.3.0) (2024-01-30)


### Bug Fixes

* fix build issue ([5fb6cf3](https://github.com/phodal/chapi/commit/5fb6cf36dadb6c512bf93c5b8ab3b88277653400))
* **rust:** fix error pakcageName issue and just set it to empty ([1e99200](https://github.com/phodal/chapi/commit/1e9920053d15f3974970d26c59f7a33088030b5e))


### Features

* add handle for toml type ([d64b477](https://github.com/phodal/chapi/commit/d64b47735d10a1e3bf649b2684d94c0e3c650648))
* add some domain functions to core ([ea2555b](https://github.com/phodal/chapi/commit/ea2555b86a1e5a573f2e29e8ba24757de595ca0f))
* **c:** add first function call demos [#96](https://github.com/phodal/chapi/issues/96) ([fa10d9a](https://github.com/phodal/chapi/commit/fa10d9a64cd57109b51f260360422d3ff0f5ed37))
* **cmake:** add CMakeBasicListenerTest and rename CMakeChapiListener to CMakeBasicListener [#24](https://github.com/phodal/chapi/issues/24) ([7c35520](https://github.com/phodal/chapi/commit/7c355201f17f459336fef3b5869b06cdb49d4055))
* **cmake:** add CMakefile example and usage in CMakeAnalyser [#24](https://github.com/phodal/chapi/issues/24) ([6ee6974](https://github.com/phodal/chapi/commit/6ee6974e633f99b35e86c5e457bc953e0dafe9ee))
* **cmake:** add private modifier to container variable [#24](https://github.com/phodal/chapi/issues/24) ([15d4574](https://github.com/phodal/chapi/commit/15d4574383747eaaee79394f4d9eb08094cab6df))
* **core:** add since annotation for flag ([bcb64bb](https://github.com/phodal/chapi/commit/bcb64bb266684cf1ca34e7fba47ecac32af6e302))
* **cpp:** add CMake parser and analyser [#24](https://github.com/phodal/chapi/issues/24) ([17015ba](https://github.com/phodal/chapi/commit/17015ba17f81ea9b6bf07e21fe95f91986586b05))
* **cpp:** add support for identifying C++ structures [#24](https://github.com/phodal/chapi/issues/24) ([15c8f0e](https://github.com/phodal/chapi/commit/15c8f0e14da40cf2268cc57600278a0320471375))
* **cpp:** add support for identifying inheritance [#24](https://github.com/phodal/chapi/issues/24) ([766d10f](https://github.com/phodal/chapi/commit/766d10fd4009bf404780d615b08fd197e6504769))
* **cpp:** add test case for identifying class fields [#14](https://github.com/phodal/chapi/issues/14) ([f0eed87](https://github.com/phodal/chapi/commit/f0eed87cb95b64b524fc15a84803c2d197a67998))
* **cpp:** add test case for identifying functions [#24](https://github.com/phodal/chapi/issues/24) ([2728231](https://github.com/phodal/chapi/commit/2728231261504210ff6f8ffc688b087416034e31))
* **cppast:** add support for identifying namespaces ([d382bdd](https://github.com/phodal/chapi/commit/d382bdd287356dfeb137a0c9a92dcf7b646e8c18))
* **docs:** update language support table in README.md ([0dd84ee](https://github.com/phodal/chapi/commit/0dd84eed3cb5e992ad9b2c23ba3cbf2c506de1ee))
* **rust:** enable analysis git package ([706bba1](https://github.com/phodal/chapi/commit/706bba1afe01a67c551c91484279c2af2d16f4cb))
* **rust:** try to handle function call ([853503c](https://github.com/phodal/chapi/commit/853503ca16ff176ca11f40aafca4958c56d61699))
* **toml:** add handle for second sample ([f43f1a2](https://github.com/phodal/chapi/commit/f43f1a2bf47072e292a28b08bfc4c995c97ec178))
* **toml:** add parser for analysis container ([3c7264f](https://github.com/phodal/chapi/commit/3c7264f3d101bdc710b5e8b4966ff3a06331f3f1))
* **toml:** add parser for array ([fc08236](https://github.com/phodal/chapi/commit/fc08236630d704a19eb37f21e875eedb0f9f2eab))
* **toml:** init first parse for result ([e38da8b](https://github.com/phodal/chapi/commit/e38da8b961720e5ee42477d14890b7676f1405c6))
* **toml:** test for child name ([2eb203a](https://github.com/phodal/chapi/commit/2eb203a585684e82c549b307d63d65833dba7432))
* update cpp to 14 for better render [#24](https://github.com/phodal/chapi/issues/24) ([6632e83](https://github.com/phodal/chapi/commit/6632e8341d0cc2b32afaf3f81625d696647c2b05))



## [2.2.3](https://github.com/phodal/chapi/compare/v2.2.1...v2.2.3) (2024-01-04)


### Bug Fixes

* add lost code annotation for Java & Python ([67fa016](https://github.com/phodal/chapi/commit/67fa0167d248d7830a2bc55bba6a226f963d7879))
* **Rust:** fix annotation position error issue ([1f9ea6b](https://github.com/phodal/chapi/commit/1f9ea6bb004578e41dd47f6cfd76f766492382cb))
* **test:** fix package name error issue ([c7679b8](https://github.com/phodal/chapi/commit/c7679b8dc83d95d7a517d7f4d5ef4613e0fcf829))



## [2.2.1](https://github.com/phodal/chapi/compare/v2.2.0...v2.2.1) (2024-01-02)


### Bug Fixes

* **rust:** fix block comment issue ([bde7d48](https://github.com/phodal/chapi/commit/bde7d48905ca74c311f3b41a4ade3cc24f75f75e))


### Features

* **rust:** add basic rust marco support ([35ac560](https://github.com/phodal/chapi/commit/35ac560500cbe7177c141784d6dfc15aa9dfd0c2))
* **rust:** add handle for function calling in type ([7585551](https://github.com/phodal/chapi/commit/75855514e0423b6ad9323d83e9e651ece163e320))
* **rust:** add inference for derive type ([8e017f5](https://github.com/phodal/chapi/commit/8e017f51279be06c8476aa098380c8f8b12a98e9))
* **rust:** display for http server ([3bd3112](https://github.com/phodal/chapi/commit/3bd3112c79daebe01b6141538947def91a444237))
* **rust:** handle for generics support ([9708673](https://github.com/phodal/chapi/commit/97086732777b8c6b53860bab26b348dbb9b26df4))
* **rust:** set basic MultipleReturns for Result ([cac8ff9](https://github.com/phodal/chapi/commit/cac8ff9ac13ae9be34ce4c907cc0e594c5cfa2f8))



# [2.2.0](https://github.com/phodal/chapi/compare/v2.1.5...v2.2.0) (2024-01-01)


### Features

* add test support for mod ([da588ce](https://github.com/phodal/chapi/commit/da588ce43fb26cf480f78c6742fbc880148d3af2))
* **rust:** add annotation support ([8f85256](https://github.com/phodal/chapi/commit/8f852565fec4d13641791901736131ccd58bc012))
* **rust:** add basic validate for rocket rs framewrok ([33f52e3](https://github.com/phodal/chapi/commit/33f52e3085126e3cba1f98945f7d118676447bec))
* **rust:** add field support ([f877803](https://github.com/phodal/chapi/commit/f87780345235249cd11be7f255f09f349ca1d82d))
* **rust:** add for item child check ([f25a36e](https://github.com/phodal/chapi/commit/f25a36e5c5dedc892ecd0779874cb4043ff1f9e7))
* **rust:** add function parameter support ([e9f38e3](https://github.com/phodal/chapi/commit/e9f38e3a8071806b820c8555d661110aa2aa7624))
* **rust:** add lookup type support ([37b6c42](https://github.com/phodal/chapi/commit/37b6c425d22383900031d202b781dfd76acfe8fe))
* **rust:** add process for function call ([ca96312](https://github.com/phodal/chapi/commit/ca9631287b2fbe8fa143631d7861182eff5db4d7))
* **rust:** add process for function parameter ([c34b9bf](https://github.com/phodal/chapi/commit/c34b9bf523095dbfb520134c2c5d8d3ecdd35ce2))
* **rust:** add return type support ([abdeca1](https://github.com/phodal/chapi/commit/abdeca11cdc73ae86716ff6bff8c61db30ca1db0))
* **rust:** add support for better type in impl ([870f28f](https://github.com/phodal/chapi/commit/870f28f66c93d9300a2eb48d63c7b01519982dba))
* **rust:** add support for function in impl ([df935cd](https://github.com/phodal/chapi/commit/df935cd180ce1edde3243c3e6d1b85cdcf06dd61))
* **rust:** add use decl support ([5641a8f](https://github.com/phodal/chapi/commit/5641a8fa47e8c3af59391b04ed2df7b2c6cfaff5))
* **rust:** align for lookup by type logic ([ce12c63](https://github.com/phodal/chapi/commit/ce12c63214d2de02e5b46c54aa83715dae42f4f4))
* **rust:** align to latest syntax ([363f7b7](https://github.com/phodal/chapi/commit/363f7b755beba25a391a7b9d7df965b93a2643f8))
* **rust:** align to same logic to Kotlin for struct, so that we can make with default structure ([4593dd1](https://github.com/phodal/chapi/commit/4593dd120dbca7dd914c5396654b6d5edf6b4018))
* **rust:** fix for crash ([28d0078](https://github.com/phodal/chapi/commit/28d00786ecdb7a1e47e290f427c7a3e6345dd0d5))
* **rust:** fix for lost structures ([114d93b](https://github.com/phodal/chapi/commit/114d93b75d02957fb050bf4b0924154bd8c9facc))
* **rust:** fix individual function lost function calls issue ([2503fc9](https://github.com/phodal/chapi/commit/2503fc9ef33f87863fe4b5d03315e6081d165985))
* **rust:** init for enum class support ([76eab2e](https://github.com/phodal/chapi/commit/76eab2eb0df0b711d661c5228b3177b82e188c2a))
* **rust:** make default structure works ([1b046c7](https://github.com/phodal/chapi/commit/1b046c7c653ccd865fb01d4f1a3da65675aa3222))
* **rust:** make package name works ([a367a0d](https://github.com/phodal/chapi/commit/a367a0d80e31b22d3c76ec24fd8ef46e1bbcbdef))
* **rust:** make parse first function call works ([495e860](https://github.com/phodal/chapi/commit/495e8609acbcaec9c55ee8bc8ff09ac40ba0e6cb))
* **rust:** make pass for first function calls ([6e70eac](https://github.com/phodal/chapi/commit/6e70eac4c069126f328e656b8d45acd05c8d29d0))
* **rust:** make return type works ([8132dc7](https://github.com/phodal/chapi/commit/8132dc78ab1bafc9a5dc2ffcc897a87be8476dac))


### Reverts

* Revert "refactor(rust): simplify logic" ([ebeb903](https://github.com/phodal/chapi/commit/ebeb90365350ce9aa6021b2105f6d615bd70e7a7))



## [2.1.5](https://github.com/phodal/chapi/compare/v2.1.4...v2.1.5) (2023-12-28)


### Bug Fixes

* **kotlin:** fix lost NodeName in creator issue ([40e1374](https://github.com/phodal/chapi/commit/40e1374aba9208628b2628e8d44a8f2e285efe0a))


### Features

* **kotlin:** add companion object support ([b275e9f](https://github.com/phodal/chapi/commit/b275e9ffadc05f3678e53dfd1907310b7146c8a8))
* **kotlin:** add object class support ([61a83d8](https://github.com/phodal/chapi/commit/61a83d8a66f350c5ac3efcafff5440a09b69eba2))
* **kotlin:** make creator works better ([5a75646](https://github.com/phodal/chapi/commit/5a75646e576dc272f463061f154dcc84765a9a7d))
* **typescript:** parse for import ([1aa6732](https://github.com/phodal/chapi/commit/1aa6732e109e1591c4fb482ec0515f7320babf2f))



## [2.1.4](https://github.com/phodal/chapi/compare/v2.1.1...v2.1.4) (2023-12-24)


### chore

* release to 2.1.2 ([424035a](https://github.com/phodal/chapi/commit/424035a924eb152575550ba7e219b6aeb383f7cd))


### Features

* add CodePosition for Annotation ([0d9e2f2](https://github.com/phodal/chapi/commit/0d9e2f2c4c17454b2f642c591ff3be8001608d0a))


### BREAKING CHANGES

* use List to replace arrya in domain



## [2.1.1](https://github.com/phodal/chapi/compare/v2.0.0...v2.1.1) (2023-02-16)


### Bug Fixes

* regenerate equals of Property with 'Array' type in a 'data' class: it is recommended to override 'equals()' and 'hashCode()' ([63a2822](https://github.com/phodal/chapi/commit/63a2822b8489f152af767ea6ef5c59c0414f16b5))



# [2.0.0](https://github.com/phodal/chapi/compare/v2.0.0-beta.9...v2.0.0) (2023-02-16)


### Bug Fixes

* fix deps error of kotlin junit ([ccf66a6](https://github.com/phodal/chapi/commit/ccf66a6448f21c997eb154147aaf76a06b13e9c3))



# [2.0.0-beta.9](https://github.com/phodal/chapi/compare/v2.0.0-beta.7...v2.0.0-beta.9) (2022-11-25)


### Bug Fixes

* fix crash issues ([e103097](https://github.com/phodal/chapi/commit/e1030971a7735adbbe6a34fecd358028ac699985))
* fix crash issues for golang ([1c6a410](https://github.com/phodal/chapi/commit/1c6a4100cbb7f455044d3c10431cb277d7f9d4ae))
* fix test ([488a8ca](https://github.com/phodal/chapi/commit/488a8ca1e9060c3acbc91d608ed653b8cf7f1223))
* fix tests ([1b511ee](https://github.com/phodal/chapi/commit/1b511ee58fed5d18dc67d91a14919fcb41b85dce))


### Features

* add support to wrap target ([ac664f6](https://github.com/phodal/chapi/commit/ac664f600a192049c2e79ce045acf7baac61778e))
* add treeviewer for output ([b8fcee9](https://github.com/phodal/chapi/commit/b8fcee9975f60c6c0e1967fd7bf07bd937c47974))
* **go:** add handle for string type ([a715336](https://github.com/phodal/chapi/commit/a715336808b36c5dc8f590248a80f0b81510ebc7))
* **go:** add support for go block call ([e672a5e](https://github.com/phodal/chapi/commit/e672a5eee63d6e2ebc9f4f9b24231d1bb56ba5fb))
* **go:** fix target error issues ([08caebb](https://github.com/phodal/chapi/commit/08caebb8cf11465e11eb81e91aa915909f1b373e))
* **go:** make go better for parsing API ([82373a2](https://github.com/phodal/chapi/commit/82373a2fec0fca26a456f47447828a5e1616a95a))
* **rs:** init struct ([1d357e1](https://github.com/phodal/chapi/commit/1d357e10d2f2dcc315ece27e55ffa4f43a012187))
* **rust:** init modules ([a68bf2e](https://github.com/phodal/chapi/commit/a68bf2e49ee014b1fac793afe86295a4fa4beae2))



# [2.0.0-beta.7](https://github.com/phodal/chapi/compare/v2.0.0-alpha.5...v2.0.0-beta.7) (2022-11-18)


### Bug Fixes

* <java> [#20](https://github.com/phodal/chapi/issues/20),incorrect TypeValue and TypeKey ([#21](https://github.com/phodal/chapi/issues/21)) ([51eaa28](https://github.com/phodal/chapi/commit/51eaa2862f0707fbc28c45452394543039b12d40))
* fix identifier issues for archguard/archguard[#108](https://github.com/phodal/chapi/issues/108) ([28cc9a8](https://github.com/phodal/chapi/commit/28cc9a84971adeb1be8ab000352376aff560f6d5))
* fix type alias error issues ([c218d81](https://github.com/phodal/chapi/commit/c218d81fd2179f8cb612db24133afba6670d61d2))
* fix type error issue ([e064477](https://github.com/phodal/chapi/commit/e064477ad3eef343d84d81e89217bd4ef10251f4))
* **kotlin:** fix syntax not match master issues ([7bea9c7](https://github.com/phodal/chapi/commit/7bea9c7627a0228e54c27d68655f55f5a04686df))
* **ts:** add numberic support ([33a35b0](https://github.com/phodal/chapi/commit/33a35b04569a8e16fb73d24829b12ce5b4542e4f))
* **ts:** align erros ([9a8d927](https://github.com/phodal/chapi/commit/9a8d927b216c682819b0d5e8c4a6e2794e531f78))
* **ts:** fix abstract error issue ([1d6feaa](https://github.com/phodal/chapi/commit/1d6feaac879bc1e1a2c79a8b9f1569126eed77d5))
* **ts:** fix all tests ([e089ac6](https://github.com/phodal/chapi/commit/e089ac60917cd0b0e4a23381a074aa98053ca7c7))
* **ts:** fix array type error issues ([c133707](https://github.com/phodal/chapi/commit/c1337074cc69bda0405bcf876e9ada1fed95864e))
* **ts:** fix arrow functions ([9f721bd](https://github.com/phodal/chapi/commit/9f721bd099e9f511d2f3090d3e273dd1b36e843e))
* **ts:** fix await issue ([db90510](https://github.com/phodal/chapi/commit/db90510f06b71ce2961d5de6250934f5f6411e61))
* **ts:** fix axios<Info>(){} call issue ([41e62e7](https://github.com/phodal/chapi/commit/41e62e7347e191a656e35ac28db1cae75276f177))
* **ts:** fix call issues ([1dd814b](https://github.com/phodal/chapi/commit/1dd814b73627c238c9aefa915d5811a01b2db7fb))
* **ts:** fix class abstract error issue ([d54c1f0](https://github.com/phodal/chapi/commit/d54c1f06a4bd0c8588eba287918a87961e3c0417))
* **ts:** fix decorator list ([9d8bfe5](https://github.com/phodal/chapi/commit/9d8bfe53504626582c3f0fdcf70f1b2f1e9ec952))
* **ts:** fix element in query ([e87a90c](https://github.com/phodal/chapi/commit/e87a90cc8ea4461573e72c2f91f24bfb363f1872))
* **ts:** fix empty classBody issue ([2782a01](https://github.com/phodal/chapi/commit/2782a017d4380879228294cf2f202362cf0f45c0))
* **ts:** fix empty type error ([8f0b8c4](https://github.com/phodal/chapi/commit/8f0b8c48f4e83bc71adf8cdceb89da15bba6d9c3))
* **ts:** fix end comma in constructor ([ddd139e](https://github.com/phodal/chapi/commit/ddd139e930436345ae678085d5b005ff4b26cb53))
* **ts:** fix export issues ([7474189](https://github.com/phodal/chapi/commit/7474189f2c6292f032f544c1b605117d6aae1e95))
* **ts:** fix function decl error issues ([ec26282](https://github.com/phodal/chapi/commit/ec2628295c7e7abf6d4b56ccc03d8c28f20a165e))
* **ts:** fix function decl error issues ([19bd271](https://github.com/phodal/chapi/commit/19bd271cb49e2f9dd5a4227d8e40d3d270d287ee))
* **ts:** fix function error issues ([4640f34](https://github.com/phodal/chapi/commit/4640f34874ec34cd3fe322e60201c51301cabb77))
* **ts:** fix import of conflict ([e57af30](https://github.com/phodal/chapi/commit/e57af30b96d3e3ea5f9a8239fde43046281979d4))
* **ts:** fix imports ([72ad42a](https://github.com/phodal/chapi/commit/72ad42a07d91cd5a3b5d5fdac7e53145e328a1f7))
* **ts:** fix interface cases ([991d3ef](https://github.com/phodal/chapi/commit/991d3ef5c76a932eb82e24f441ba1951ff6ccbd6))
* **ts:** fix lost question issues ([8718727](https://github.com/phodal/chapi/commit/8718727b988d3175b2358f96f23bb5e9ee387567))
* **ts:** fix more tests ([2c47f65](https://github.com/phodal/chapi/commit/2c47f655a7fe8b2ea8aa2e2d783e6a67417e88f8))
* **ts:** fix nested error issues ([6df62c4](https://github.com/phodal/chapi/commit/6df62c494295e554ba212f3992a9017ee2b7ce16))
* **ts:** fix of keywordS ([04bf39b](https://github.com/phodal/chapi/commit/04bf39b2e23878a8cf058c3695cfc38afe8acc41))
* **ts:** fix prop issues ([f3f5e9f](https://github.com/phodal/chapi/commit/f3f5e9f63a4f9f36a1183e0b1690e2e70ed5214e))
* **ts:** fix query array literal ([6e1890b](https://github.com/phodal/chapi/commit/6e1890b9ceb039ed40efa51979b8334f9ab5e638))
* **ts:** fix some order issues ([ded0de5](https://github.com/phodal/chapi/commit/ded0de592e55f289fc865094bbf8040e7fe530fe))
* **ts:** fix some type error issues ([2916b13](https://github.com/phodal/chapi/commit/2916b135f18fa57952351c903cf0e5b24fceb416))
* **ts:** fix string as parameter issue ([0eea7d2](https://github.com/phodal/chapi/commit/0eea7d270b5b5887319930e514b1e008fc3a32e6))
* **ts:** fix type abstract ? issues ([d704aae](https://github.com/phodal/chapi/commit/d704aae667fbb6bd6d00eb1612fb11ede1289df7))
* **ts:** fix typed error ([77399ac](https://github.com/phodal/chapi/commit/77399acaaa28d8455d9f715113f17d9be3e2eda1))
* **ts:** merge type issues ([38ed025](https://github.com/phodal/chapi/commit/38ed025309b4aaf9c689b40b4cb4798b6cf208ca))
* **ts:** resolve all imports ([fa9e70a](https://github.com/phodal/chapi/commit/fa9e70a6c3065b7f474539ba4306b74211a3824f))


### Features

* <java> add enum support ([3fa19ef](https://github.com/phodal/chapi/commit/3fa19efbcf6966e9ca03b5b453c6cea8620fa483))
* add assign op [#22](https://github.com/phodal/chapi/issues/22) ([df144dc](https://github.com/phodal/chapi/commit/df144dc422e852dac4e17ee8f757a4b8932127cf))
* add comprison [#22](https://github.com/phodal/chapi/issues/22) ([ddc0416](https://github.com/phodal/chapi/commit/ddc0416e8309f5a5580ab163f8e1cb844e4f95bf))
* add first add sample [#22](https://github.com/phodal/chapi/issues/22) ([d7389cb](https://github.com/phodal/chapi/commit/d7389cb9479f148c9af5e7eb1c87683478266503))
* add function call op [#22](https://github.com/phodal/chapi/issues/22) ([29a195f](https://github.com/phodal/chapi/commit/29a195fb6f5600bd6653dac4f1c4592e05064840))
* add jumpop [#22](https://github.com/phodal/chapi/issues/22) ([86e948e](https://github.com/phodal/chapi/commit/86e948ed06b9f318db0745d927e2a2ecb76f8da4))
* add switchOp and caseOp [#22](https://github.com/phodal/chapi/issues/22) ([88f42e4](https://github.com/phodal/chapi/commit/88f42e49137e499b10e5da2bf54c24b08377fa77))
* **go:** add parse for parimaryexpr ([3962805](https://github.com/phodal/chapi/commit/39628053b7c303e6b84aae174bf0a640ae73acc7))
* **go:** enable for check function name ([61d7701](https://github.com/phodal/chapi/commit/61d770178870df5dd7cb56a7cf34e4c66470c4a0))
* **go:** fix null issues ([de13d9d](https://github.com/phodal/chapi/commit/de13d9d1d727d92c148a1b1186806d8bf9a814a8))
* init basic pratter for [#22](https://github.com/phodal/chapi/issues/22) ([34755a3](https://github.com/phodal/chapi/commit/34755a31a4299279a5b03b407cd0d8ba802c3331))
* try if else packages ([33ee8b9](https://github.com/phodal/chapi/commit/33ee8b99a0081fb2d83936b568f109b043f9d0e4))
* **ts:** add readonly issue ([b548af9](https://github.com/phodal/chapi/commit/b548af9b20d90cbb8c9d07b307be1842ae136851))



# [2.0.0-alpha.5](https://github.com/phodal/chapi/compare/v2.0.0-alpha.4...v2.0.0-alpha.5) (2022-05-30)



# [2.0.0-alpha.4](https://github.com/phodal/chapi/compare/v2.0.0-alpha.3...v2.0.0-alpha.4) (2022-05-30)



# [2.0.0-alpha.3](https://github.com/phodal/chapi/compare/v2.0.0-alpha.1...v2.0.0-alpha.3) (2022-05-30)



# [2.0.0-alpha.1](https://github.com/phodal/chapi/compare/v2.0.0-beta.4...v2.0.0-alpha.1) (2022-05-30)



# [2.0.0-beta.4](https://github.com/phodal/chapi/compare/v2.0.0-beta.3...v2.0.0-beta.4) (2022-05-30)



# [2.0.0-beta.3](https://github.com/phodal/chapi/compare/v2.0.0-beta...v2.0.0-beta.3) (2022-05-30)


### Bug Fixes

* **java:** add BodyHash calculate in FullIdentListener.enterMethodDeclaration since CodeFunction will be updated in the end of the method ([c718768](https://github.com/phodal/chapi/commit/c718768df6a219eee63569794f33ea212a2ca171))


### Features

* **java:** add BodyHash field in CodeFunction, to determine if Function Body has been changed during code commit ([fdacd84](https://github.com/phodal/chapi/commit/fdacd8488df853f71e48dd20626e552475163f12))


### Reverts

* Revert "build: remove gdp" ([0a467c8](https://github.com/phodal/chapi/commit/0a467c8e61e6e1ec907c432c8df0eab122cf8ecf))



# [2.0.0-beta](https://github.com/phodal/chapi/compare/v1.5.4...v2.0.0-beta) (2022-05-11)


### Bug Fixes

* **app:** fix windows crash issues ([e11e593](https://github.com/phodal/chapi/commit/e11e593fb0e1b39d233c25ba60267dd4c5fbce89))
* fix alt annnotation issues ([7088f27](https://github.com/phodal/chapi/commit/7088f279386bd7a4ab8b8ef197465d93b348ad5c))
* fix annotation lost s issues ([3bced8e](https://github.com/phodal/chapi/commit/3bced8e545f047e385beaa1a62dcd1e374e6a769))
* fix default in object property ([789330b](https://github.com/phodal/chapi/commit/789330b5e717b85bb699b6807d780058cdc667f9))
* fix imports ([2bdd161](https://github.com/phodal/chapi/commit/2bdd1617eefc52d2179211efa05d076f61c45642))
* fix windows paths issues ([8fa0e16](https://github.com/phodal/chapi/commit/8fa0e16988eacf6788dde45e342d64d06d97a523))
* **java:** fix annotation parse issues ([a5f8ccb](https://github.com/phodal/chapi/commit/a5f8ccbe22389c50fe32a15f04fac18725679002))
* **java:** fix java field annotations is empty issue ([69ba995](https://github.com/phodal/chapi/commit/69ba9955ea20ed4724afadae962b95690d977388))
* **kotlin:** fix quest error in newline ([5f3de96](https://github.com/phodal/chapi/commit/5f3de964503a5ef6b4ca90a4408f63456e090d48))
* **kotlin:** fix tests in windows path issue ([2712424](https://github.com/phodal/chapi/commit/27124248d6aefa6e912a55792a5b3de35125c8ef))
* **typescript:** fix key issues for scan ([feac320](https://github.com/phodal/chapi/commit/feac3204304f32c2bcfd6540faa73c3983c4d08f))


### Features

* **c#:** add basic parameters for testing ([2c91825](https://github.com/phodal/chapi/commit/2c918255da3a9e6b6039b65688444a99d6813d37))
* **c#:** fix proprety memebr issue ([4ebba25](https://github.com/phodal/chapi/commit/4ebba257477678cd34e0296dd97b518d090d7028))
* **C#:** init first method call samples ([1daee4e](https://github.com/phodal/chapi/commit/1daee4e7973cef3db31571531df8fadf308fa693))
* **c#:** make first function calls ([ca02ac4](https://github.com/phodal/chapi/commit/ca02ac4f7da260d1c9c0de1ec5ac0f13a7e10c98))
* **kotlin:** add annotation support for field ([47fcfe2](https://github.com/phodal/chapi/commit/47fcfe2a6c2190569bc1ecc4adb096ec1ba109cb))
* **typescript:** add exports to name support ([ec6fafb](https://github.com/phodal/chapi/commit/ec6fafbd8a3a66db135e070fe00608c6436cadd6))



## [1.5.4](https://github.com/phodal/chapi/compare/v1.5.1...v1.5.4) (2022-04-06)


### Bug Fixes

* fix position compare in call, function, struct, member ([748ac82](https://github.com/phodal/chapi/commit/748ac82454c212f9cefd075b7d582ccfd92454e4))
* **java:** change import static to usage in names ([c881382](https://github.com/phodal/chapi/commit/c8813821f409eb94d723e6dceac4c6f3e1c2a086))
* **java:** fix import static error issues ([293f1bb](https://github.com/phodal/chapi/commit/293f1bbec79212965879110434b6186a5a3f80c0))
* **java:** fix packageName error for static import ([75aa5a8](https://github.com/phodal/chapi/commit/75aa5a85a6dbae142e46aaa3429677553aa01d20))
* **java:** fix static improt error types issues ([e262aa0](https://github.com/phodal/chapi/commit/e262aa06476733697f25975d8d5beb8fa4b08175))


### Features

* **domain:** add equals for annotation ([f5a00a9](https://github.com/phodal/chapi/commit/f5a00a94a9c04bc0d3f7916bc7337bc1e0a61d61))
* **domain:** add equals for call ([3fed5f5](https://github.com/phodal/chapi/commit/3fed5f5139de372829e56fc54be148844429991f))
* **domain:** add equals for data structure ([e5fa8d5](https://github.com/phodal/chapi/commit/e5fa8d552297af0e4f1cb8e2b70220439fc4b46c))
* **domain:** add equals for field ([c679924](https://github.com/phodal/chapi/commit/c679924687c58981675754e9143b50c951669623))
* **domain:** add equals for function ([25f8d09](https://github.com/phodal/chapi/commit/25f8d097746005d791e41bcded8c36128d7d7775))
* **domain:** add equals for import ([b04f882](https://github.com/phodal/chapi/commit/b04f8829889d158c34bebf243f3bbf2d54bf9567))
* **domain:** add equals for others ([069d7ef](https://github.com/phodal/chapi/commit/069d7efbf380fa9f062ba9973746ae83615c9260))
* **domain:** add more equals for package infos ([ff74e01](https://github.com/phodal/chapi/commit/ff74e01a3dd8e5b49746e36b3390f223ce227ba3))
* fix sqlgenerator and source batch ([9a9beb4](https://github.com/phodal/chapi/commit/9a9beb4b7ba62405322d481ceb007a911c5b58cb))



## [1.5.1](https://github.com/phodal/chapi/compare/v1.4.1...v1.5.1) (2022-04-04)


### Bug Fixes

* fix tests ([3305ae8](https://github.com/phodal/chapi/commit/3305ae8bca8d0aa5fd1e85c80354e4426c09e11f))


### Features

* add local variable pool ([40a17b1](https://github.com/phodal/chapi/commit/40a17b160195090860ee344b7543f530d715422e))
* add local vars for currentFuntions ([37d76ae](https://github.com/phodal/chapi/commit/37d76ae4e6660a46e3b895dbc950b60668ede679))
* **kotlin:** support for inline variable ([4b64c76](https://github.com/phodal/chapi/commit/4b64c760f2e2b537e290dd4734d184137a258ff9))



## [1.4.1](https://github.com/phodal/chapi/compare/v1.3.1...v1.4.1) (2022-03-31)


### Bug Fixes

* remove unused templates ([5c1b7e8](https://github.com/phodal/chapi/commit/5c1b7e85a61d203d47afb27d02bf986f6c714d95))


### Features

* **domain:** add annotation t ofield ([d6a4ec3](https://github.com/phodal/chapi/commit/d6a4ec3080961ce27c28cef45592211fd45ca110))
* **kotlin:** add position & fix some tips ([55ddb1e](https://github.com/phodal/chapi/commit/55ddb1e5bdb93ca5ea1a58047e676c8c966f12e8))
* **kotlin:** add suport for import uppercase class ([e11c083](https://github.com/phodal/chapi/commit/e11c0834dfd6f92553a59fe89f3b140a3c469d18))



## [1.3.1](https://github.com/phodal/chapi/compare/v1.3.0...v1.3.1) (2022-03-25)


### Bug Fixes

* fix typos ([085281c](https://github.com/phodal/chapi/commit/085281c5c7cb660e06c1497e29997da6348d9c38))


### Features

* add debug for local info ([34744ea](https://github.com/phodal/chapi/commit/34744ea56562aa7087bbead80626ba712858d6e3))
* **java:** merge java 17 grammar ([aa4541b](https://github.com/phodal/chapi/commit/aa4541bb575dd4890c5525c1afc08462afd8b865))



# [1.3.0](https://github.com/phodal/chapi/compare/v1.2.5...v1.3.0) (2022-03-25)


### Bug Fixes

* fix path issues ([af79760](https://github.com/phodal/chapi/commit/af797609a83cf42aa45c78cfd46daa07ae2aa688))
* fix tests ([4a08b03](https://github.com/phodal/chapi/commit/4a08b039df36f507ace3fb521ab212bfbb7fd9e9))


### Features

* **c#:** config for namespace ([01ac839](https://github.com/phodal/chapi/commit/01ac8399292eeae7e5d1bd2c1009492d9df5d6d8))
* **c#:** make container to use sample imports to ds ([0171c89](https://github.com/phodal/chapi/commit/0171c893b884708b33cc9a828b829408f2aa8da6))
* **loc:** add position for c# ([591de72](https://github.com/phodal/chapi/commit/591de721b59ed6ee4089e984ef696238f12b76c2))
* **loc:** add position for java ([fac9446](https://github.com/phodal/chapi/commit/fac944617b16b640fc862cf331fd61f41512b8e7))
* **loc:** add position for kotlin ([a47b668](https://github.com/phodal/chapi/commit/a47b6685ff741a71161059c53c125688d0793e4d))
* **loc:** add position for typescript ([50284c9](https://github.com/phodal/chapi/commit/50284c9ae9437c3ee70eec492adf606bb94bb9fa))
* **loc:** add position to code data struct ([aebffba](https://github.com/phodal/chapi/commit/aebffba60a55ed84beed014b80cfd051c7ace0ab))



## [1.2.5](https://github.com/phodal/chapi/compare/v1.2.4...v1.2.5) (2022-03-24)


### Bug Fixes

* fix suffix is a path issue ([84d8f1f](https://github.com/phodal/chapi/commit/84d8f1fb74a457b90d50d0fab8059f9dfc60683e))



## [1.2.4](https://github.com/phodal/chapi/compare/v1.2.2...v1.2.4) (2022-03-24)


### Bug Fixes

* add lost language config for cli app ([990c7e7](https://github.com/phodal/chapi/commit/990c7e79b9799634a33e03c4ca2e92ac8cc674d5))
* change output to json ([fc362bc](https://github.com/phodal/chapi/commit/fc362bcf7787fb2fb95539857e5a4a7ba5763ebd))
* fix c# var crash issue ([2d5a0e4](https://github.com/phodal/chapi/commit/2d5a0e483bae8cab9575564618af4bd44419f64b))
* fix new package name issue ([cbe5542](https://github.com/phodal/chapi/commit/cbe55425914ec206cd8ad49b56dff401b7f2e058))
* fix typescript filename not as package name issue ([1910a7a](https://github.com/phodal/chapi/commit/1910a7a0f7f13ce46dd8fc556d3f6cc8e1fa1555))



## [1.2.2](https://github.com/phodal/chapi/compare/v1.2.1...v1.2.2) (2022-03-21)


### Features

* add isFile api for ts ([f4bedfc](https://github.com/phodal/chapi/commit/f4bedfc99d701b214c9445b1561ee60a215ec745))
* **ts:** add basic parser for resolve path ([13f3b0c](https://github.com/phodal/chapi/commit/13f3b0c03fd788b8c71f6da7908765161c8dcf8b))
* **ts:** add package name support ([d948b9c](https://github.com/phodal/chapi/commit/d948b9c87c37ef67bbb69cee8e146cfc88de4df1))



## [1.2.1](https://github.com/phodal/chapi/compare/1.2.1...v1.2.1) (2022-03-18)


### Bug Fixes

* fix kotlin crash issue ([6b141d5](https://github.com/phodal/chapi/commit/6b141d5ea741f772ab6b4b9a9b558df4a7092e0d))



## [1.1.4](https://github.com/phodal/chapi/compare/v0.0.9...v1.1.4) (2022-03-16)


### Bug Fixes

* revert tests ([2d67f2c](https://github.com/phodal/chapi/commit/2d67f2c7bf54a1eaf3a59093c57ef92b575b1405))
* **tbs:** fix tbs runner issue ([8dad1fc](https://github.com/phodal/chapi/commit/8dad1fcd0c5c859ced440e679ac177d19d3254b4))


### Features

* backend api analyser structure ([6daf72c](https://github.com/phodal/chapi/commit/6daf72c68c8af129c4589810fbd5d8b6752b82bf))
* parse function call with regex ([7ed332d](https://github.com/phodal/chapi/commit/7ed332dbe602ca5bdd70a973e2bacfd0dbf078ac))
* parse individual function and creator ([74e4b23](https://github.com/phodal/chapi/commit/74e4b230af7192ee45fab78a17fda0f1bef29e9b))
* parse individual function and creator (implemented) ([f38ac1b](https://github.com/phodal/chapi/commit/f38ac1b7865a62c42c45835452402af361d146cf))
* **ts:** add single support for ts yield ([cfcda59](https://github.com/phodal/chapi/commit/cfcda594fa2503a03d2724d149ac57b73b160c06))
* update kotlin function call status ([e9b1125](https://github.com/phodal/chapi/commit/e9b11256373fe54d350fb577cd3128f2856a0a49))



## [0.0.9](https://github.com/phodal/chapi/compare/v0.0.8...v0.0.9) (2022-03-12)


### Bug Fixes

* **fe:** fix import path issue ([ab04da2](https://github.com/phodal/chapi/commit/ab04da2e13788d1b0f21cf27f0b376f319aeab83))
* fix crash issue ([aed1a23](https://github.com/phodal/chapi/commit/aed1a2388a82893866fc442bca7058a57aae7563))


### Features

* **api:** add basic umi identify ([e624c8d](https://github.com/phodal/chapi/commit/e624c8d8f52e8f37a66076eee19d0aeef3df68f7))
* **api:** add url and method support for http api ([3eb100a](https://github.com/phodal/chapi/commit/3eb100a14937dddadf4f625c3b3c58f95d1727dc))
* **ts:** add api to call support ([ea3e5b6](https://github.com/phodal/chapi/commit/ea3e5b656097cfea9f3b4e9f4a6bf8eb8bfdc2c2))



## [0.0.8](https://github.com/phodal/chapi/compare/v0.0.7...v0.0.8) (2022-03-12)


### Bug Fixes

* adapt new ast (remove out-of-date all in one ([24408f3](https://github.com/phodal/chapi/commit/24408f3323f1355d1637c5323aec77903186b8c5))
* add lost javasource issue ([9ef22af](https://github.com/phodal/chapi/commit/9ef22af3281d06509c2c8e275d3e79480e4bf4b6))
* **C#:** fix type issue for class parent ([7f7358e](https://github.com/phodal/chapi/commit/7f7358eda508477878e27381afb6a98429f66123))
* consider main as individual function ([669247e](https://github.com/phodal/chapi/commit/669247e0e7e488ea16b76bfb0d5b35f0a280b2f4))
* fix cases issues ([b782bf2](https://github.com/phodal/chapi/commit/b782bf26b0f91642cfe8fa866cbf1553a653cc74))
* fix license issue in pom config ([688510c](https://github.com/phodal/chapi/commit/688510c89a8f02fab4bf381032be0ba92efd5848))
* fix logic issue ([aec0ee7](https://github.com/phodal/chapi/commit/aec0ee7b55ed85786567738832f28579a5951e18))
* fix lost constructor issues ([b955394](https://github.com/phodal/chapi/commit/b9553944a11294176e3478f081c8dc6799b3db8e))
* fix namespace lost body issue ([1271b4f](https://github.com/phodal/chapi/commit/1271b4f918a0ea4f4018b9a1e8868406760a2bde))
* fix resource error ([824981b](https://github.com/phodal/chapi/commit/824981b71bbf01943c3335c9487e17baa1c56cab))
* fix tests ([011d45a](https://github.com/phodal/chapi/commit/011d45a39483e86be5eecb890d70df56a674c826))
* fix tests ([873b516](https://github.com/phodal/chapi/commit/873b516d9d6942659a8a24b1ebdcf967987274f8))
* fix Windows start with blank issue ([a06b126](https://github.com/phodal/chapi/commit/a06b126ceafc0fcf02a86d36b6a432f447f5c43c))
* **grammar-ts:** add not check after item ([953059b](https://github.com/phodal/chapi/commit/953059bb11462ddc629ed0aa0a371cba809506f1))
* **grammar-ts:** fix any in objectLiteral type issue ([ad68a8a](https://github.com/phodal/chapi/commit/ad68a8a9b00e9d88e32c70f0641ec4b0f71a67e8))
* **grammar-ts:** fix keyword in object key issue ([bd4ba23](https://github.com/phodal/chapi/commit/bd4ba2333ddb5ea83dc316285d83db2cb8e27f4d))
* **js:** fix crash issues ([137f2ee](https://github.com/phodal/chapi/commit/137f2ee9b2cda3a117d7fe2bf6701bfdabcdc722))
* remove unused code ([5711efa](https://github.com/phodal/chapi/commit/5711efac55a95f5570029cc734d699ed9ef84638))
* remove unused codes ([8ec794c](https://github.com/phodal/chapi/commit/8ec794c3ec495d5dd092786537e8b43634c5bfa2))
* skip anonymous function name ([060a10c](https://github.com/phodal/chapi/commit/060a10c3ed4e4aadf920151c41bbb289eee3bfe8))
* skip local testing ([ffa1846](https://github.com/phodal/chapi/commit/ffa1846858065af05988c98fb050c68fed89771e))
* skip unreached branch, return with default value ([da0067a](https://github.com/phodal/chapi/commit/da0067a6c85e4fca178da85da09196bca5c9245b))
* **ts:** add equal for type generic in arrow function ([6593110](https://github.com/phodal/chapi/commit/659311054d680925a72ab804ea2e90b3d26d7028))
* **ts:** add simple fix for func?.() ([3aada13](https://github.com/phodal/chapi/commit/3aada13603b52187d12689b19913a90e24bb89d6))
* **ts:** fix ! . issue ([eae55a7](https://github.com/phodal/chapi/commit/eae55a7b1b7ea2e21591ffae85f8eade710b5021))
* **ts:** fix ?.obj grammer issue ([d512e52](https://github.com/phodal/chapi/commit/d512e52e518f6a97ff720a69b48d2fd013e1745b))
* **ts:** fix code coverage ([0afdd40](https://github.com/phodal/chapi/commit/0afdd404ed1070fa75bf3b8595ce3a4d82c6620e))
* **ts:** fix crash for archguard frontend ([55289bc](https://github.com/phodal/chapi/commit/55289bc6669ce6b4724b4206079f1ff5ccc624f9))
* **ts:** fix enum error issue ([4e6c990](https://github.com/phodal/chapi/commit/4e6c99064e2fd3c944a3e34811837b0cdf37cf7b))
* **ts:** fix equal trim issue ([371d03b](https://github.com/phodal/chapi/commit/371d03b255c0de60c16d35eed3ca92135f8889a2))
* **ts:** fix func nested ([a0d3e9e](https://github.com/phodal/chapi/commit/a0d3e9e3696a9a2218e532e6885f653d25407d95))
* **ts:** fix grammar issue ([c8fb818](https://github.com/phodal/chapi/commit/c8fb818bdcf19a190672ac33c450930cb3f0016a))
* **ts:** fix grammer export error for default issue ([d95057b](https://github.com/phodal/chapi/commit/d95057b49278e7c405f8757d84d6c7cb8d3f31f8))
* **ts:** fix grammer lost html elements issues ([0ca8322](https://github.com/phodal/chapi/commit/0ca832221926e5502b9e49c850c593166f2d69d1))
* **ts:** fix keyword issues for module ([7451296](https://github.com/phodal/chapi/commit/7451296ddb6e6f7071bb733e1d7145aa94f2a70d))
* **ts:** fix lodash issue in obj method param ([34c40da](https://github.com/phodal/chapi/commit/34c40da3a1f93e4593b276c56271406104665304))
* **ts:** fix module empty issue ([4ebb06a](https://github.com/phodal/chapi/commit/4ebb06a7cca660f3352eb37d33fd11e41be1209a))
* **ts:** fix nested generic ([96c3363](https://github.com/phodal/chapi/commit/96c3363fa14940ee8f02cceb1e396e1f07d45842))
* **ts:** fix normal nested issue ([d25ef4d](https://github.com/phodal/chapi/commit/d25ef4d3d8a3211a504f0e3ee519e5d637fb6188))
* **ts:** fix null no in predefined Type ([9bf79c3](https://github.com/phodal/chapi/commit/9bf79c3018abefdf4379d5a918ac231afe58ac6f))
* **ts:** fix simple inner issue ([936e93c](https://github.com/phodal/chapi/commit/936e93cefdb16a811a1a0589619d51f951687cf9))
* **ts:** fix some grammar issues ([dabffa7](https://github.com/phodal/chapi/commit/dabffa78efeb1289bbd5f5f617a9df8d502b79e4))
* **ts:** fix types issues ([6e5f70c](https://github.com/phodal/chapi/commit/6e5f70c5aa2df5d8e0ac75fb451789ca0473474c))
* **ts:** fix undefined & default keyword issue ([e3bec90](https://github.com/phodal/chapi/commit/e3bec90b0676ddf85af3e0832837532ea32841e0))
* **ts:** fix undefined issue ([3815710](https://github.com/phodal/chapi/commit/381571074bca1f707b09758aa968f54602d0e89b))
* **typescript:** fix call size issue ([f5aa47c](https://github.com/phodal/chapi/commit/f5aa47cd279ef71996d7f740d92a0d1122edb403))


### Features

* add assertions for function parameters; test cases for annotations ([6d7eab3](https://github.com/phodal/chapi/commit/6d7eab32e715bf2b884a2c516f5a49f47540620a))
* add basic call chain parse support ([e3a55a3](https://github.com/phodal/chapi/commit/e3a55a3db90f9539707cdf8da2909729c316a46e))
* add exports types ([90058b0](https://github.com/phodal/chapi/commit/90058b08d8f5bb470430cb2de3457c4a7c1a1448))
* add filter annotations ([3db2eb1](https://github.com/phodal/chapi/commit/3db2eb17aa83b640dca0c84865ad91b25401f07d))
* add method annotation support ([4bd7306](https://github.com/phodal/chapi/commit/4bd7306da4b0af34fe78b8e06adfb56a17a506b5))
* add method annotation support ([b49aa92](https://github.com/phodal/chapi/commit/b49aa92c534115208ee905c450c6f7edd6ac1f11))
* add package name fore functions ([51afcdd](https://github.com/phodal/chapi/commit/51afcdd8f7986a3ba3bdc8753b2ea0592652baf3))
* add path count ([6d46120](https://github.com/phodal/chapi/commit/6d46120b5c56dd94686831667e5c68238e4ea06c))
* add support for global field ([1c14485](https://github.com/phodal/chapi/commit/1c1448520992606c4069b6ff5d36fafdb2d8b2be))
* add support for ident var decl ([4323c32](https://github.com/phodal/chapi/commit/4323c3263458eecd5a8e126477e8c31bffe3e248))
* add todo for analysis type ([c368e2f](https://github.com/phodal/chapi/commit/c368e2fa81afe48a6ead88baa8dbb01255a963cd))
* **application:** use clikt as cli library ([2c72c0e](https://github.com/phodal/chapi/commit/2c72c0ec1d126b325ed53e93786f0b8cef6bec42))
* **c#:** add annotaion support for naming ([860018a](https://github.com/phodal/chapi/commit/860018a3ff02bca73e8d5abe557d8d2e10364ae5))
* **c#:** add c# to chapi application ([d35d5b5](https://github.com/phodal/chapi/commit/d35d5b55517d18ea54db494de94c121aec1fc0d6))
* **C#:** add for annotation ([5fba63c](https://github.com/phodal/chapi/commit/5fba63c548605d7193d7210a6babfe72eac8a1da))
* **C#:** parse for method annotation ([c344407](https://github.com/phodal/chapi/commit/c344407809991cc73658a693e2b20d5c45d6d75d))
* **c#:** test for csharp parse node bug ([ea00624](https://github.com/phodal/chapi/commit/ea0062474a2f77a64ca14363b621bf93844e6927))
* **domain:** add get ext support ([0f33731](https://github.com/phodal/chapi/commit/0f337319957ea7430faefaec1371640cd25bb91e))
* **domain:** add lsot commit ([ce2516d](https://github.com/phodal/chapi/commit/ce2516dcab47003875d0bda1fef341fc867f8d40))
* expose kotlin analyser ([d0dd015](https://github.com/phodal/chapi/commit/d0dd01555faa4cd473e58e72efee5d634ed1ac64))
* expose kotlin analyser as an app ([6d9dc96](https://github.com/phodal/chapi/commit/6d9dc96bef758d4f8ced2ee200bfedf91d6fe222))
* multiple classes in one file (auto pass ([99f562c](https://github.com/phodal/chapi/commit/99f562c5284ebf9fd46352288f3073b909d23d61))
* parse annotation (only work for single) ([f9d42e2](https://github.com/phodal/chapi/commit/f9d42e2342a942d70095e0b138ca7d15d3a63726))
* parse annotation for function parameter ([95e3538](https://github.com/phodal/chapi/commit/95e35383a121a96de635b19272c72c74f006061b))
* parse constructor (primary) ([81a5ef9](https://github.com/phodal/chapi/commit/81a5ef95ff062153ca28655469ad82e8a860a86c))
* parse fields and individual declarations (top level object ([d53ca30](https://github.com/phodal/chapi/commit/d53ca3017ed682ec38e2e792050461cbcd61cba0))
* parse implements ([6e03162](https://github.com/phodal/chapi/commit/6e031622da4a6d733c33ed8107389c75ab3555ee))
* parse import, function with return type ([07548a8](https://github.com/phodal/chapi/commit/07548a8cb93359e02ae8c8050d837469882957b3))
* test annotation parser with real spring controller ([4db4470](https://github.com/phodal/chapi/commit/4db4470a9d35e45e17ee73253678f45e656acdd9))
* test with archguard ([af0c7db](https://github.com/phodal/chapi/commit/af0c7db6085f7cd0c2e929913e048d518dd862b9))
* **ts-grammar:** add some lost grammar support ([ca4524b](https://github.com/phodal/chapi/commit/ca4524b366653636e17ecd1b1912fb98ed648196))
* **ts:** add <Ident.Ident for html tag support ([151bfeb](https://github.com/phodal/chapi/commit/151bfeb1f57f7a97a7419ab92bf96225be5224a8))
* **ts:** add config for min file ([4cdc9a6](https://github.com/phodal/chapi/commit/4cdc9a66271e3b8e16e4c48d8cd70ae8f05455d4))
* **ts:** add declare to class ([130cd5f](https://github.com/phodal/chapi/commit/130cd5f90c069822e8ff5bba3014c23b048fcc93))
* **ts:** add filepath to function ([6d2a710](https://github.com/phodal/chapi/commit/6d2a710cc87d8fcb3cff1a3fa7444bfebaf2d598))
* **ts:** add filter without anonymous functions ([02db3ca](https://github.com/phodal/chapi/commit/02db3ca3fbed7528e51a5da05a26212271a5710f))
* **ts:** add function call support for func ([187d96c](https://github.com/phodal/chapi/commit/187d96c56912781fd87783ba7711bd66981b5bd8))
* **ts:** add grammar support for generic map ([cf99f83](https://github.com/phodal/chapi/commit/cf99f83fa8894a4c7c8a1a4e4be8f0ee89bc59e1))
* **ts:** add keyof grammar ([23753c9](https://github.com/phodal/chapi/commit/23753c915a208ac687d566e6e51627de4622d4f9))
* **ts:** add more grammar check and test caes ([7681798](https://github.com/phodal/chapi/commit/76817989e0369e41b7c02d45891a98b8b0a0b5b0))
* **ts:** add more test cases ([8427ca7](https://github.com/phodal/chapi/commit/8427ca764fb1ffc6faa2ef9f0bea8f44f3acd187))
* **ts:** add return html support ([a258daf](https://github.com/phodal/chapi/commit/a258daf108d36a7fd1cdcea8ca95fbe133cf2103))
* **ts:** add sample for ts/js call ([91d0c1e](https://github.com/phodal/chapi/commit/91d0c1e8994195cf1fffc840f11b7001658d3f3e))
* **ts:** add support for | in start of type alias ([4a4ef8e](https://github.com/phodal/chapi/commit/4a4ef8e630cb22ab8114abcc262742f2f6da0056))
* **ts:** add support for | start for interface types ([51b9d18](https://github.com/phodal/chapi/commit/51b9d183618f9ff55c5da8ec3b6ad797d9560ccf))
* **ts:** add support for alias by string ([f4ed652](https://github.com/phodal/chapi/commit/f4ed6522bf150c61be05b15d6fe524cbc8a8d718))
* **ts:** add support for arg ctx ([e69ed85](https://github.com/phodal/chapi/commit/e69ed857ea8fe1a2eeeb103381b97619c90a8edf))
* **ts:** add support for interface undefined ([b1817d2](https://github.com/phodal/chapi/commit/b1817d2a28d2ce91f51360d2f1a74a16d8c17ada))
* **ts:** add support for method name is ([7f24c3c](https://github.com/phodal/chapi/commit/7f24c3cb4df6110c1af9bbbabcc9e0de69ddf1e5))
* **ts:** add support for object type in as expresssion ([2f88a33](https://github.com/phodal/chapi/commit/2f88a334bcec1789f38c584e403381ccfd491701))
* **ts:** add support for react default node ([1ddfd5f](https://github.com/phodal/chapi/commit/1ddfd5f0ebd7288c3dc93a263f2e6ce203f1d2bb))
* **ts:** add tsx support ([8cd372c](https://github.com/phodal/chapi/commit/8cd372c047beb2e53b765bcdeddf0f5696d1897b))
* **ts:** add type alias ([542240f](https://github.com/phodal/chapi/commit/542240f2d95b52224723788f8db75486145c28fd))
* **ts:** align export grammar ([34ca98e](https://github.com/phodal/chapi/commit/34ca98e02b1687c678aac695684c45410706095b))
* **ts:** chagne ecma import logic ([d3427eb](https://github.com/phodal/chapi/commit/d3427ebd12fdcd1f11f061cd053f299f112e343a))
* **ts:** enable jsx comments ([662f503](https://github.com/phodal/chapi/commit/662f503d00c331bf396eabba3df9f903d5625cc7))
* **ts:** enable ts field call ([d1afd86](https://github.com/phodal/chapi/commit/d1afd86c25add3b15b1fbdcc8cd51231a5825ccb))
* **ts:** fix import items issue ([391580b](https://github.com/phodal/chapi/commit/391580b8335012d9394a0c9131e9e57bf918ae7b))
* **ts:** fix issue in really world ([f9456df](https://github.com/phodal/chapi/commit/f9456dff7d6ce2e873d9ae8736b9f0f88e6a4a3c))
* **ts:** log api caller name ([ae9fd45](https://github.com/phodal/chapi/commit/ae9fd4518797224a6ec37d144aa17d8e3ad778ad))
* **ts:** make first component call to api ([d14e550](https://github.com/phodal/chapi/commit/d14e55022f7ad4fdf07d8235767ffbf49cff9355))
* **ts:** make support for inner func ([fa211ea](https://github.com/phodal/chapi/commit/fa211ea31522544d736cf5bb0e32152c695d4145))
* **ts:** try reset imports ([e851dc0](https://github.com/phodal/chapi/commit/e851dc0d4cae7a1d5bbb5f856850defa19c930db))
* **ts:** try to make function call ([691f7d6](https://github.com/phodal/chapi/commit/691f7d64e50d4f6e40862f77ddc6f47276d8f8d2))
* **ts:** type annotation for objectLiterl genearateMethod ([39dbaca](https://github.com/phodal/chapi/commit/39dbaca7e4a73f19130cf85063bcd2e6c4a7effc))
* upgrade lexer and parser ([9b490d6](https://github.com/phodal/chapi/commit/9b490d67fd38588e4ab30849c525286022c42dd9))



## [0.0.7](https://github.com/phodal/chapi/compare/v0.0.6...v0.0.7) (2022-02-23)



## [0.0.6](https://github.com/phodal/chapi/compare/v0.0.5...v0.0.6) (2022-02-23)


### Bug Fixes

* <c> fix function pointer paramater name parse ([2ff39b1](https://github.com/phodal/chapi/commit/2ff39b1607b7f8bd11961edcefd2f502125afe98))
* <typescript> fix parameter emptyissue ([e122f79](https://github.com/phodal/chapi/commit/e122f79bfa197aa83c0c0c30cd61a5922d3e3916))
* fix align issue ([4d07b69](https://github.com/phodal/chapi/commit/4d07b69bca456485ccc1d4d1feadb1ef2e004f86))
* fix annotation issue ([2c50e33](https://github.com/phodal/chapi/commit/2c50e334a45f0fb91d44d3e6f6afde17e214edd0))
* fix call chain support ([1e7038b](https://github.com/phodal/chapi/commit/1e7038b859b6ab1327285cceebbc5e95e3ba907b))
* fix cd naming issue ([02367fa](https://github.com/phodal/chapi/commit/02367fad7175d860258bef7c44dd26379c687c3f))
* fix decl issue ([03ebe08](https://github.com/phodal/chapi/commit/03ebe085ddcc9a24ae54308c613165ee355518a1))
* fix default items not path issue ([3bd55c6](https://github.com/phodal/chapi/commit/3bd55c63cff0306ba725e9a61a856b2c7ab36008))
* fix for parse lodash issue ([26993cd](https://github.com/phodal/chapi/commit/26993cd65e9194998d4f1242c434f9cfe9a53e4f))
* fix parameter issues for new grammar ([48d16f5](https://github.com/phodal/chapi/commit/48d16f52de8e0332db37962c47480b4f52be6e12))
* fix prop issues ([5db8439](https://github.com/phodal/chapi/commit/5db8439d0b42235c14321ca1182e795f36a0f6cd))
* fix py test error issue ([659e7ad](https://github.com/phodal/chapi/commit/659e7adc736867c86e4e81e38539a3d6766bb454))
* fix repo config issue ([c8e51a3](https://github.com/phodal/chapi/commit/c8e51a385d06432dd9102eedd6948cd36773c108))
* fix some tests issues ([7b892a9](https://github.com/phodal/chapi/commit/7b892a902c29b22aa997e12a7bfc223c71d2c418))
* fix tests ([b2742f7](https://github.com/phodal/chapi/commit/b2742f7fcf21e1153db4bb28816a93a0dd1e8cf5))
* fix ts align issue ([8bd13ce](https://github.com/phodal/chapi/commit/8bd13ce51c1649d861b89def2d4300222d57b414))
* fix typo ([5efb35e](https://github.com/phodal/chapi/commit/5efb35e7e871b57765ad01736f7d435e1d0fc7a3))
* fix typo ([bba8232](https://github.com/phodal/chapi/commit/bba82321c1e19393293310fd4f337913e2e8d877))
* fix typo ([e63a5c7](https://github.com/phodal/chapi/commit/e63a5c73d50c8d0c12597fe4802a481def849ad1))
* fix typo ([dc2b7e0](https://github.com/phodal/chapi/commit/dc2b7e050803761967e10ae31f3e1f513142d85d))
* fix value size issue ([e7ab8a1](https://github.com/phodal/chapi/commit/e7ab8a1388e0482317e6c8f80acb4a44e3fbbc35))
* make publish works ([d784c26](https://github.com/phodal/chapi/commit/d784c26ad12befef0afa3067b9b61a578442d607))
* revert comment code ([b7bbb0b](https://github.com/phodal/chapi/commit/b7bbb0b6eef8646b4b65a1c9af496c4bc04b8a1b))
* update local antlr ([875fb09](https://github.com/phodal/chapi/commit/875fb09242b952ccba1d5348190d1aeb0f63debd))


### Features

* <c> add basic function name and paramaters support ([2172f76](https://github.com/phodal/chapi/commit/2172f765ec8df62989a27351bf0acb098d2f629e))
* <CPP> add basic function name support ([ef643c5](https://github.com/phodal/chapi/commit/ef643c54df14d62be7cbcf5548179cea7a5b5ba5))
* <CPP> add basic function return type ([4942a39](https://github.com/phodal/chapi/commit/4942a399354400aea453047298ff5f775e13e69a))
* <CPP> add function basic parameter type support ([a1574ba](https://github.com/phodal/chapi/commit/a1574ba4d140463626c654087501c26d35caacc2))
* <CPP> add function parameter type value ([a98d211](https://github.com/phodal/chapi/commit/a98d2111c252395369fc725d382a906dbc2b8836))
* <go> add basic analysis test ([2f09eba](https://github.com/phodal/chapi/commit/2f09eba17d33ef51069c8570f889bdc43f73e510))
* <kotlin> make it return container ([00ebf56](https://github.com/phodal/chapi/commit/00ebf56fe368f0f0c9719ba99b4af0c7cf0e7a66))
* <kotlin> thinking in kotlin script ([a9c9127](https://github.com/phodal/chapi/commit/a9c912714ae3b08ea3457f69a345592b69a26133))
* <python> add basic builder call size suport ([bd1a23b](https://github.com/phodal/chapi/commit/bd1a23b24d3b1a06128155c4ec874ce2339511dc))
* <python> add basic function call support ([f74ffcc](https://github.com/phodal/chapi/commit/f74ffccac1f0a5d53718426441b3b1b7bfcf3990))
* <python> add basic local vars support ([cf50e98](https://github.com/phodal/chapi/commit/cf50e98a841eddaa366fabe8dc34e59bc8ac1e68))
* <python> add builder caller name suport ([210ff80](https://github.com/phodal/chapi/commit/210ff80aab2038533b8a7f64d06437edf95aa231))
* <python> try to add func call ([3503bda](https://github.com/phodal/chapi/commit/3503bdaed4702fa247358eae2cd2ec2b6ef82ce5))
* <scala> add kotlin all in one test ([9efb19c](https://github.com/phodal/chapi/commit/9efb19c62fc5874e6cbe935ba3429407d935cd95))
* <scala> add pacakgeName ([b0b5dda](https://github.com/phodal/chapi/commit/b0b5dda985787250908e463049f090da24b1a177))
* <typescript> fix system call issue ([9b918ad](https://github.com/phodal/chapi/commit/9b918adc38c8175387402eb75f37fa30862f90f5))
* add annotation support for ts ([c0424a6](https://github.com/phodal/chapi/commit/c0424a67b7594ccb3a04f4817bee1cdec04d54c6))
* add basic call for sinple await call ([e7844f4](https://github.com/phodal/chapi/commit/e7844f4a8f99a25d66b025c14804937b6a655606))
* add basic trait issue ([b825f86](https://github.com/phodal/chapi/commit/b825f86b215e27cee4b1b5cb778d4d8603682be3))
* add basic typescript call support ([6484c6f](https://github.com/phodal/chapi/commit/6484c6fe98ab1751b17b27a5d0a674ee225ed552))
* add filter rule for chapi config ([853fe59](https://github.com/phodal/chapi/commit/853fe590a2e6d1bb5f327ddda2e0ebbcfbfdff24))
* add global field support ([ee5c64a](https://github.com/phodal/chapi/commit/ee5c64aa35f630354a402e721a539999265d0086))
* add ignore test for typescript ([c90d7b7](https://github.com/phodal/chapi/commit/c90d7b7c85d5f894fc9f82b660bfdf97f78806dd))
* **kotlin:** add ident for classname ([c1f32da](https://github.com/phodal/chapi/commit/c1f32da38cdf3f2dabb250d7ec0de53c59971b09))
* make application main ([00dcb5b](https://github.com/phodal/chapi/commit/00dcb5b5a3cd66df5785f44294af0165d83e91dc))
* thinking in code expr ([904fa19](https://github.com/phodal/chapi/commit/904fa19680ef7b41c1a4c48a10e2def254097356))
* **ts:** try parse tsx ([3b0751c](https://github.com/phodal/chapi/commit/3b0751c43e64e2c2b668062a3f161c686ddca8ac))



## [0.0.5](https://github.com/phodal/chapi/compare/v0.0.3...v0.0.5) (2020-02-18)


### Bug Fixes

* fix target ttype issue ([cc0c77e](https://github.com/phodal/chapi/commit/cc0c77ea10f5ccbdfe708cfa97df1791d2f405eb))


### Features

* <app> add basic multiple language support ([cd24a18](https://github.com/phodal/chapi/commit/cd24a18ec66fca26e0aaba737dc3539df098d6ec))
* <app> add more content ([d13377f](https://github.com/phodal/chapi/commit/d13377f3e5d457fb74239fdb623f09f74e04c4cd))
* <app> add more languages ([a8a0250](https://github.com/phodal/chapi/commit/a8a02505967952ea5631d91e63ae8d2cabedfbef))
* <go> add const decl for localvars for [#1](https://github.com/phodal/chapi/issues/1) ([c4ff3ea](https://github.com/phodal/chapi/commit/c4ff3ea66dbc7b627ee421f0a80ba3f687712a83))
* <go> add short decl to localvars supoprt for [#1](https://github.com/phodal/chapi/issues/1) ([ced0906](https://github.com/phodal/chapi/commit/ced09066580911a1b930c980247ef15ae2752191))
* <go> add var decl to local vars support ([258ade1](https://github.com/phodal/chapi/commit/258ade1de14576e8295043d6ae025fbccdf64883))
* <java> add local vars to function for [#1](https://github.com/phodal/chapi/issues/1) ([f35b143](https://github.com/phodal/chapi/commit/f35b14324b470832b2449a065f155b93ff9ad6e2))



## [0.0.3](https://github.com/phodal/chapi/compare/v0.0.1...v0.0.3) (2020-02-17)


### Bug Fixes

* fix refactor issue ([217d040](https://github.com/phodal/chapi/commit/217d040899447794c3def60a9075f969f50df223))
* fix rename issue ([0033afc](https://github.com/phodal/chapi/commit/0033afc360473884a2700465c7015c8c83ab057e))


### Features

* <C#> add basic import support ([5a43504](https://github.com/phodal/chapi/commit/5a43504da96641dd9c2f5632b4076fbc329cfdeb))
* <c#> add basic namespace support ([e65afed](https://github.com/phodal/chapi/commit/e65afed0d9f308aee87e5a8604ee5ad210789263))
* <C#> add basic parameters support ([c97f5b3](https://github.com/phodal/chapi/commit/c97f5b39765a9483efe982d0c4f7c3f1ae010e0b))
* <C#> add class function modifier support ([f8ea7c2](https://github.com/phodal/chapi/commit/f8ea7c247c3b22ca79561ad8463997dab3e37ff0))
* <C#> add class function name support ([94bcf52](https://github.com/phodal/chapi/commit/94bcf525752bcc52a4700aa00420090a7a3ceb88))
* <C#> add class int namespcae in namespcae support ([0e010e7](https://github.com/phodal/chapi/commit/0e010e75965804e95f5fdee324920f89fc999b36))
* <C#> add className support ([9cb7a37](https://github.com/phodal/chapi/commit/9cb7a37926ee2d39b4983652de08964f46a07d32))
* <C#> add compile all testing for not exception ([f032f95](https://github.com/phodal/chapi/commit/f032f9550974c710cebce5860779ac3ffecb196f))
* <C#> add import as support ([256570c](https://github.com/phodal/chapi/commit/256570c7e32f18452893189753088c0994b686ac))
* <C#> add multiple class in same file support ([b36f839](https://github.com/phodal/chapi/commit/b36f83983c95e8d5f42572a563309901fcef9aa1))
* <C#> add namespcae as container support ([9844b97](https://github.com/phodal/chapi/commit/9844b971f45e6f33ec913ae990220d03580ebe57))
* <C#> add namespcae in namespace support ([4b4d33b](https://github.com/phodal/chapi/commit/4b4d33b0c7f2ef08b735455ec168a44001329933))
* <C#> add testing for namespace import ([29e9e65](https://github.com/phodal/chapi/commit/29e9e65573ccae50b49f240e2619d983de6cda8f))
* <C#> add void return type support ([c00cc42](https://github.com/phodal/chapi/commit/c00cc42858150cb823ca27e9a39b2826d76a0785))
* <C#> thiking in namespace ([0860886](https://github.com/phodal/chapi/commit/0860886b18df4414bbef29544465729aff52da13))
* <core> thinking in multiple package in files ([4a0f83d](https://github.com/phodal/chapi/commit/4a0f83d2164da7ca74d29e3bd1ab189714b2f893))
* <domain> add abstract class type ([27bf3f8](https://github.com/phodal/chapi/commit/27bf3f887d4397d051a1badfef04816a1767b2ec))
* <domain> add containers for C# ([7643fbc](https://github.com/phodal/chapi/commit/7643fbc63ffe2e54f6f9dc979ba06352dcd01a3e))
* <domain> add struct type for python ([3f7647d](https://github.com/phodal/chapi/commit/3f7647db165d0c6c0f12a3e06bafcdabaff29e45))
* <domain> change type to enum type ([1b10fe4](https://github.com/phodal/chapi/commit/1b10fe4dd9f59a7bb4f63f25eeae70f4bbb08720))
* <domain> remove unused ImportName ([0e98bf3](https://github.com/phodal/chapi/commit/0e98bf31be543536ca92b2914455e45efc184c3c))
* <scala> add class name support ([80b02e5](https://github.com/phodal/chapi/commit/80b02e52a5b27ce6288db12d9ea405ffa1c65c2d))
* <scala> add class parameter support ([fb65773](https://github.com/phodal/chapi/commit/fb657736ef7f26749b7ddf7f38b28a51d2e94867))
* <scala> add extend support ([0ecdbde](https://github.com/phodal/chapi/commit/0ecdbde9cafcfc75ae3e11ee536b9a4501625e63))
* <scala> add inner object support ([cde2f0d](https://github.com/phodal/chapi/commit/cde2f0dc20545d66a2cb5debe88872505d0956f0))
* <SCALA> add object name support ([7a3850e](https://github.com/phodal/chapi/commit/7a3850e37b22b31a4e0c6c6668d2bacaf568e9cf))
* <scala> add object type for project ([1582c7a](https://github.com/phodal/chapi/commit/1582c7a940458aceafac23d2654dd6fb3198ddd3))
* <SCALA> add parameters for class for scala ([6431e34](https://github.com/phodal/chapi/commit/6431e34cfcb6efa4ed28d572f70140de697ac1e0))
* <scala> add some dsl use case ([c9b7427](https://github.com/phodal/chapi/commit/c9b74275ab55b86cd9097f69267c8cf3ddab0a56))
* <scala> init code analyser ([62bb42f](https://github.com/phodal/chapi/commit/62bb42f577d64a02330c8aa575e589af1a98c025))
* <scala> init for function programming ([6733a89](https://github.com/phodal/chapi/commit/6733a8977b3d3ad4f0894dabfd91109edef55c5d))



## [0.0.1](https://github.com/phodal/chapi/compare/17fc44ba833ba64a567d2008b913952fb5a9cbeb...v0.0.1) (2020-02-13)


### Bug Fixes

* <java> fix call chain issue ([b2f24d7](https://github.com/phodal/chapi/commit/b2f24d719b1f855708e574fb3dfff3753b4842a9))
* <java> fix creator method not get issues ([e93b79d](https://github.com/phodal/chapi/commit/e93b79d27f9f6942e950466010a3c0d604121f4d))
* <java> fix ds import issue ([425f67a](https://github.com/phodal/chapi/commit/425f67a164b1bebc15d576632b64f3dd3da4c600))
* <java> fix ds lost file path ([8c08bb8](https://github.com/phodal/chapi/commit/8c08bb8b2a5d0f4b592de4092ea09ca48170e9ba))
* <java> fix ident map package lost issues ([46b85e9](https://github.com/phodal/chapi/commit/46b85e9c377f7577dcd079a2092159da9ae0eaf0))
* <java> thinking in field call ([7277c42](https://github.com/phodal/chapi/commit/7277c42f448452b9a0543674f8681ca671ad19be))
* <java> try to fix inner ds issues ([8a2b19c](https://github.com/phodal/chapi/commit/8a2b19c101f17d47ecd7b56c92a8814b7180de58))
* <ts> add lost basic arrow function & express function identify ([3385d48](https://github.com/phodal/chapi/commit/3385d488f35af1332492b41e863f3821dd7dac92))
* <ts> fix compile error issues ([ceb5c7a](https://github.com/phodal/chapi/commit/ceb5c7ab278c253615faae7e10cf1d401c104fbd))
* <ts> fix error func number issue ([c765edf](https://github.com/phodal/chapi/commit/c765edf6ba607843115b7df59cc0be5d05786dbc))
* fix application source code error issue ([57e29ce](https://github.com/phodal/chapi/commit/57e29ce869219010f25e869d5698e68660b9bbe0))
* fix attributes issues ([4386d87](https://github.com/phodal/chapi/commit/4386d87e029b44a8ee1ca3db3036b748ace4ac7c))
* fix build issues ([d4332d1](https://github.com/phodal/chapi/commit/d4332d11cbd056f0a89a73107f4eab6a26a8ce87))
* fix class issue ([87d6e45](https://github.com/phodal/chapi/commit/87d6e45e7e1dbbd476ff471e7066145617494d11))
* fix patth issue ([2b4d78d](https://github.com/phodal/chapi/commit/2b4d78d4405736d71988908b2eaca41ea2bf525c))
* fix python defaultNode placeholer issue ([1d105c7](https://github.com/phodal/chapi/commit/1d105c7fb7063c79053b93da8760677e80fcf6ae))
* fix test issues ([2e37e0e](https://github.com/phodal/chapi/commit/2e37e0e38d9ec630128df8e11bcceae1aea1ecdf))
* fix ts naming issues ([f1d2bf4](https://github.com/phodal/chapi/commit/f1d2bf4f605742ab894dffd12d4f58c2e31d8868))
* fix typ typo ([14603bc](https://github.com/phodal/chapi/commit/14603bcbc11789969f627223d33c2264c5bee0b1))
* fix typo ([0d6bb4a](https://github.com/phodal/chapi/commit/0d6bb4a7535e3a021810ad9a3dd3a24c306e9b20))
* remove unused comments ast ([9f5761d](https://github.com/phodal/chapi/commit/9f5761d4c48107f198c4de6ef366f1fdc9bf3b68))
* remove unused log ([df15cef](https://github.com/phodal/chapi/commit/df15cefab10170def1e3c2f2d47e426547e576db))


### Features

* <app> add basic dir support ([d1c34a5](https://github.com/phodal/chapi/commit/d1c34a5abe253b01cfa1580d67464c242c84f5c6))
* <C#> init app ([ec46257](https://github.com/phodal/chapi/commit/ec4625751cb977694b99cebd7e9452faa1ef10b7))
* <c> add basic datastruct field support ([6f77298](https://github.com/phodal/chapi/commit/6f7729845ba568271faece85ea141d9d06452bd6))
* <c> add data struct name support ([dceb972](https://github.com/phodal/chapi/commit/dceb9726e06013fc49d5e8d840e9f25ce178b54f))
* <c> support include decl ([f105aa8](https://github.com/phodal/chapi/commit/f105aa8eb284e216e3bb29bf44c1252549ebf15d))
* <core> add basic typescript grammar ([52cb283](https://github.com/phodal/chapi/commit/52cb28325fcee4f7d5eaeb522f53479cc1bcc222))
* <core> add code call build full name ([7d33989](https://github.com/phodal/chapi/commit/7d3398942a919d67df117ee9e94d57551114e2c5))
* <core> add extension support ([9981e50](https://github.com/phodal/chapi/commit/9981e50d0dfbf2db37d2f6810eafa94cbc03105d))
* <core> add file & memeber ([4a95d73](https://github.com/phodal/chapi/commit/4a95d7389b3c7516b72a53904f181cab84b9ded7))
* <core> add function test ([efb00ca](https://github.com/phodal/chapi/commit/efb00ca2d7bc187b0003e786a58b0130f602857d))
* <core> add memeber functions ([b1be5fb](https://github.com/phodal/chapi/commit/b1be5fbec12ec73793aad6fbcccc3e24480fb450))
* <core> add method override ([c929c22](https://github.com/phodal/chapi/commit/c929c22b7a8d367fd3d8213f2629bfbb68da5608))
* <core> add more members ([670ea3f](https://github.com/phodal/chapi/commit/670ea3fa814149b5f2fba29ac1b127b31d5ae7ff))
* <core> add package to function for class-first languages ([86b1041](https://github.com/phodal/chapi/commit/86b104195e9f03d8eaae9569d4858ac5caac789d))
* <core> change paramValue -> defaultValue ([68e7e8a](https://github.com/phodal/chapi/commit/68e7e8a23caa349c0e3bf8b74968b9edfcdba1d5))
* <core> init code data struct ([14bc85d](https://github.com/phodal/chapi/commit/14bc85d996761b1a56c69b123ab3dcf3dfcd20d4))
* <core> init code function ([3d68bb7](https://github.com/phodal/chapi/commit/3d68bb784c9fb477efa0210dce45503ce6c0d9f9))
* <core> migrate call test ([b6840a9](https://github.com/phodal/chapi/commit/b6840a9b22da5e0cdf9994c44096dcf4d6d1cdff))
* <core> migrate some domain object ([d4408ac](https://github.com/phodal/chapi/commit/d4408acf71ab34e7695aae3a37d52b61e4e06b6a))
* <core> setup c ident ([1678a24](https://github.com/phodal/chapi/commit/1678a24ee6f5771e611db1b579faa7dc7694df81))
* <core> setup go lang ([37882b7](https://github.com/phodal/chapi/commit/37882b79a817bcdb2e995dec126e735a912393e4))
* <domain> add file & property to json ([b6daa90](https://github.com/phodal/chapi/commit/b6daa90510f159fef3c79938aa268379801095ab))
* <go> add basic funcname support ([0c26503](https://github.com/phodal/chapi/commit/0c265037e8d4330e178375a19567ef3bff8b7da7))
* <go> add basic function call support ([d988c39](https://github.com/phodal/chapi/commit/d988c395ef16e3c118389d2da27c65b937ce066f))
* <go> add basic import support ([7c89843](https://github.com/phodal/chapi/commit/7c8984388642a0d948cd56310a7fbcc046ca6dd0))
* <go> add basic return type support ([457648d](https://github.com/phodal/chapi/commit/457648d828d6e1fdaaaf91925df6b03edc280533))
* <go> add basic struct func call support ([f2fc942](https://github.com/phodal/chapi/commit/f2fc9427c7de0943de20b2d0d32534e8892481b3))
* <go> add basic struct function support ([eeed117](https://github.com/phodal/chapi/commit/eeed117a56c250e2047fd72d0a34d7bbface36bf))
* <go> add basic struct support ([80dabad](https://github.com/phodal/chapi/commit/80dabad951237a5a56c37ca290adc2a3ab97701a))
* <go> add file path to ds ([5ca923d](https://github.com/phodal/chapi/commit/5ca923d528b95f886536652ba6bcb6954c61b498))
* <go> add function multiple returnType support ([5a03bb4](https://github.com/phodal/chapi/commit/5a03bb4bcbacb14c8a56db92bbf5d85dae6c2772))
* <go> add function parameters support ([9c97991](https://github.com/phodal/chapi/commit/9c97991c117f96279c6bd66b7e3a5554a947d41b))
* <go> add lost package name ([88557dc](https://github.com/phodal/chapi/commit/88557dcad4e99a9ae209c28311977a0822f2fd40))
* <go> add multiple import together support ([d02af53](https://github.com/phodal/chapi/commit/d02af539068ef7b01b4df7fc03010af614edd96d))
* <go> add multipleline support ([318d9e1](https://github.com/phodal/chapi/commit/318d9e1f9fc9214fd6698311d39bd111480a67b2))
* <go> add packagename support ([c3b5d74](https://github.com/phodal/chapi/commit/c3b5d747053daacd8fd54ffee72f38a7cd3ad0e2))
* <go> remove unused double quote ([0b49fca](https://github.com/phodal/chapi/commit/0b49fcafd5644bbcddfadd8b35d23562d7e4dba5))
* <grammars> add basic comment todo support ([c4095e4](https://github.com/phodal/chapi/commit/c4095e46ca8e7b09a52d7a541f5306bf393b189f))
* <grammars> add c g4 ([c40c71b](https://github.com/phodal/chapi/commit/c40c71b27ceabdb69639716c99af85c66d77e2f1))
* <grammars> init kotlin ([0b29dc3](https://github.com/phodal/chapi/commit/0b29dc386a0e80fb79c0629d4878d03e9dbd81e1))
* <grammars> init python & go grammars ([7cf686f](https://github.com/phodal/chapi/commit/7cf686f6a7a55e705f5cefbf52543309d1499ab4))
* <java> add baisc ident listener ([172955b](https://github.com/phodal/chapi/commit/172955b08a78d050f67ff435faf99c34929bc9a4))
* <java> add basic chain call handler ([345c04d](https://github.com/phodal/chapi/commit/345c04d882d8c4ae50ecb0f60577b3be11ded187))
* <java> add basic class support ([700b462](https://github.com/phodal/chapi/commit/700b462d6dc0b434763c895000fe647a185fe1b9))
* <java> add basic creator class support ([73bdf19](https://github.com/phodal/chapi/commit/73bdf19532adeb2b436e3a600662cadcff177bda))
* <java> add basic extend support ([b54e774](https://github.com/phodal/chapi/commit/b54e7744613c17ea7e68608e3783a8c5d5c2dd4b))
* <java> add basic ident class support ([3164a7f](https://github.com/phodal/chapi/commit/3164a7f648cbe101d446c79657787c9fb9c8d946))
* <java> add basic identify constructor ([9a824db](https://github.com/phodal/chapi/commit/9a824db460507d03a28134e7b914c96747b616f2))
* <java> add basic interface method support ([2b2bf8b](https://github.com/phodal/chapi/commit/2b2bf8b9b2568410c67173706c01cef245bdf6ba))
* <java> add call for same package call ([ef88f88](https://github.com/phodal/chapi/commit/ef88f88f531e758d99a5f913109904adbeccff9f))
* <java> add chain call support ([f8b705d](https://github.com/phodal/chapi/commit/f8b705db90e9d361b74073451493b82dda30ef4a))
* <java> add class annotaion support ([f184d28](https://github.com/phodal/chapi/commit/f184d28378626fffbb5f5b78ad1ec96c05124ee7))
* <java> add constructor method support ([156b137](https://github.com/phodal/chapi/commit/156b137065e3cfd0f97b27f04c25db494b042baf))
* <java> add creator call support ([3fa0c8d](https://github.com/phodal/chapi/commit/3fa0c8db133bf282c23c26e0983f047c9a0988d7))
* <java> add enter method decl support ([976c3ae](https://github.com/phodal/chapi/commit/976c3aebc75a5cd8b77599d47238d6dd0f260a37))
* <java> add expr call ([0225c31](https://github.com/phodal/chapi/commit/0225c3162d83760547058d3aff64720d62f6054e))
* <java> add extends support ([aa09a26](https://github.com/phodal/chapi/commit/aa09a26670f04c76d18d8dd350c9039988f0dd7e))
* <java> add field support ([10c7ebe](https://github.com/phodal/chapi/commit/10c7ebe29727367820b32fffd62b0f0da6da0a55))
* <java> add field type support ([e585d33](https://github.com/phodal/chapi/commit/e585d337b30f48b9eee6c0d058f057e0135bc1a8))
* <java> add formal parameter call test ([d798e47](https://github.com/phodal/chapi/commit/d798e47c7ca110edd844006da22a4c024c855297))
* <java> add fun decl name support ([3b71e24](https://github.com/phodal/chapi/commit/3b71e24dc322d172e1af3f0dc836a9f2056c55d8))
* <java> add function call support ([af13620](https://github.com/phodal/chapi/commit/af13620aabe8d218beb3249acf7a519be1bf0551))
* <java> add function parameter support ([2301c2e](https://github.com/phodal/chapi/commit/2301c2edc7c3980403afa5a20e9a4b738839edfb))
* <java> add get parameter support ([652f9f5](https://github.com/phodal/chapi/commit/652f9f5cb6e2e7cc9155ffc0c6ea8ad34d410004))
* <java> add ident basic app name support ([eec01de](https://github.com/phodal/chapi/commit/eec01de88194e9a939a93ebe77886d8a72da01fe))
* <java> add implment api supportt ([f4ba9e7](https://github.com/phodal/chapi/commit/f4ba9e7e8f8e61a571d1eb6d6ca533dea9f289a0))
* <java> add inner class struct supporT ([40a7eef](https://github.com/phodal/chapi/commit/40a7eef672e19985607c2043668d706d04a635c0))
* <java> add inner struct usage ([6716d2a](https://github.com/phodal/chapi/commit/6716d2a3bfcc468fccea770808841fe8399cd8f4))
* <java> add interface method supporT ([056bc52](https://github.com/phodal/chapi/commit/056bc5238cea566557fe1e9f562db076cefe30d6))
* <java> add interface support ([398256d](https://github.com/phodal/chapi/commit/398256d7853486281c828b517b65b30234db1cb8))
* <java> add local var call ([fab1891](https://github.com/phodal/chapi/commit/fab1891948d4d80502da617548e69f56b0fc0caa))
* <java> add method annotation support ([df28705](https://github.com/phodal/chapi/commit/df28705791c56e1bcfc18308febda92c829ade10))
* <java> add package & import support ([c6c9961](https://github.com/phodal/chapi/commit/c6c99612a93b062e217ce5bc438b91eb56b3951f))
* <java> add stop line position ([1640e82](https://github.com/phodal/chapi/commit/1640e823c2309d1319af1026db223fb752b56f2c))
* <java> add todo support ([18a2927](https://github.com/phodal/chapi/commit/18a2927b127d30df4cadeff10821c8e300fae3ec))
* <java> fix creator migration issues ([d4eed28](https://github.com/phodal/chapi/commit/d4eed285f6678dbd132fb15e4e699758ec2c1a77))
* <java> fix formal parameter package error issues ([14ee63f](https://github.com/phodal/chapi/commit/14ee63fc083b70e943e5155f01f20565fc56a79a))
* <java> local formal support ([001dc1b](https://github.com/phodal/chapi/commit/001dc1ba41f4fd555b24f136928828c700beba62))
* <java> make creator parent class identify function ([ccf1b5e](https://github.com/phodal/chapi/commit/ccf1b5e80ea77d60d374481a80608e6174dbd933))
* <java> make creator works ([e6366e1](https://github.com/phodal/chapi/commit/e6366e18f0c19860f33dd4521c1d8107d9ca4ead))
* <java> make inner struct ([b485772](https://github.com/phodal/chapi/commit/b485772e883b45eecc56629c4ef435ac96af37dd))
* <java> make return codefile ([3b43527](https://github.com/phodal/chapi/commit/3b43527210402a8a4261134d16b487abc10c0e57))
* <java> pass basic node info to full node info ([fff374b](https://github.com/phodal/chapi/commit/fff374b54d7695cb092f229d37a31a3dc969cd3f))
* <java> try to add inner ds support ([096690e](https://github.com/phodal/chapi/commit/096690eea0db9be0fcb12b3d9a0d122f9f1de83f))
* <kotlin> init listener ([3a4c463](https://github.com/phodal/chapi/commit/3a4c463a390726001f7696428d8b90d39ae263a3))
* <python> add annotation key value support ([937a950](https://github.com/phodal/chapi/commit/937a95068fdf814a1e5cda2cb9971712d821730c))
* <python> add async support ([c5b420c](https://github.com/phodal/chapi/commit/c5b420cc0a5840fa473687f1f4a2b4aada950c9e))
* <python> add basic annotation name support ([ccead4d](https://github.com/phodal/chapi/commit/ccead4d4753dc7fd5a1d252ddeffeadcca0084a9))
* <python> add basic data struct support ([5be1b82](https://github.com/phodal/chapi/commit/5be1b826f4f16f57376d82d60caab1ca3bf47b36))
* <python> add basic from import supportt ([05d3961](https://github.com/phodal/chapi/commit/05d3961ec50b1415c246617929d4eb4a104fb541))
* <python> add basic func paramters support ([349c6e9](https://github.com/phodal/chapi/commit/349c6e97fbbe39fe80a2dc73aba62dc6b3bdec1e))
* <python> add basic inheritance ([268cfe7](https://github.com/phodal/chapi/commit/268cfe731ad7acf66e70ffa3caca1d018acd8e5f))
* <python> add class func support ([20a2d0c](https://github.com/phodal/chapi/commit/20a2d0cd1e4900dca783b38a228c0e5d84a80393))
* <python> add default node support ([d06ed8f](https://github.com/phodal/chapi/commit/d06ed8fade6add634d6ddd264366db42e5ae8935))
* <python> add default value support ([b0515c6](https://github.com/phodal/chapi/commit/b0515c617938cf73876b3e2fc7caf3175db77572))
* <python> add dot source support ([2e99592](https://github.com/phodal/chapi/commit/2e9959290618dbf2a8d212aa1bb863f773eefd57))
* <python> add func annotation support ([74b9394](https://github.com/phodal/chapi/commit/74b9394f67d38d56423e43610a7d2225685443e3))
* <python> add import as name support ([2647699](https://github.com/phodal/chapi/commit/2647699bdeeff1f941bdc120fb85dcebd143e036))
* <python> add import as support ([a2599a8](https://github.com/phodal/chapi/commit/a2599a8e1b33d015a40a377aedf620683d0d4624))
* <python> add import stmt support ([9c06331](https://github.com/phodal/chapi/commit/9c063310a099a260a0d708f0e82ca8a617f6ed06))
* <python> add lost file path for ds ([bbc96d5](https://github.com/phodal/chapi/commit/bbc96d58bf4383a603054977cb4d0f5dcf3ea4b6))
* <python> add multiple annotation ([2a84471](https://github.com/phodal/chapi/commit/2a84471c898ea5723502d2eb5b3a5bda822b99d4))
* <python> add multiple parameter support ([9472e5c](https://github.com/phodal/chapi/commit/9472e5cdf22c1c5020203872afbec0d06037957b))
* <python> init app & listener ([81eeff1](https://github.com/phodal/chapi/commit/81eeff10568dabc041c96e2cd74e9210085f30e7))
* <python> update grammar for import dot ellipsis ([71c6573](https://github.com/phodal/chapi/commit/71c6573dfd0a4389df87ed2021f3bef562128ec6))
* <ts> add arrow func name support ([593b54a](https://github.com/phodal/chapi/commit/593b54ac5e856fad2fde0d54f3445e72d0ba6154))
* <ts> add arrow func paramters & return type support ([aea26c0](https://github.com/phodal/chapi/commit/aea26c0b3415ebcf1c99a7a5abb310afc31f66c3))
* <ts> add basic function call support ([1fcb0e7](https://github.com/phodal/chapi/commit/1fcb0e74edf9043300c78bbd1d503cd4a52c82cc))
* <ts> add basic function name support ([c59aba8](https://github.com/phodal/chapi/commit/c59aba89f3c8090aab15b2b7bfa335a0bdb74c06))
* <ts> add basic function supporT ([c857361](https://github.com/phodal/chapi/commit/c85736180811bc3309c97e76a103c155610bab05))
* <ts> add basic identify nodename ([cf8363e](https://github.com/phodal/chapi/commit/cf8363ec54a7da63bf294d671861cd6a1a16c54b))
* <ts> add basic import from source identify support ([29cdca8](https://github.com/phodal/chapi/commit/29cdca8c95ff616c9470e8c0448fa4425432ce29))
* <ts> add basic interface ([bc859cb](https://github.com/phodal/chapi/commit/bc859cbbd93befbc487c4f54d8e8bb9ed79716d7))
* <ts> add basic ts class ([2c2e004](https://github.com/phodal/chapi/commit/2c2e004e8ef4df69ce89d6681177314162fdd9d2))
* <ts> add class method return type support ([596963f](https://github.com/phodal/chapi/commit/596963f8c45b6c93aa6bcc4c572697a8379e9e9d))
* <ts> add constructor methtod support ([baabf46](https://github.com/phodal/chapi/commit/baabf468a0a2f81aea0f6ebc7367e7d50cdb8bc5))
* <ts> add constructor parameter support ([1cb916b](https://github.com/phodal/chapi/commit/1cb916bd983733a761d65a92f4338e3022c086cf))
* <ts> add deps ([923dc81](https://github.com/phodal/chapi/commit/923dc815cd9eff3920eda268f2bcc2372c891781))
* <ts> add extend support ([33f9c75](https://github.com/phodal/chapi/commit/33f9c75ba175c21b5c8f33f03dc137386d45adc0))
* <ts> add field support ([b71a635](https://github.com/phodal/chapi/commit/b71a635901165d2c80a9679e443e361021d4c78b))
* <ts> add funcExprfun support ([1ab306d](https://github.com/phodal/chapi/commit/1ab306d1174f38182534063421422f3f41e682f1))
* <ts> add function return type support ([6fc783e](https://github.com/phodal/chapi/commit/6fc783e6a951cd42a308e845702ef3bade166af6))
* <ts> add implement support ([68ddb7f](https://github.com/phodal/chapi/commit/68ddb7f3338f47de8ec530d0068ab78da5751683))
* <ts> add import all support ([6126c4d](https://github.com/phodal/chapi/commit/6126c4dba8f09acdb0c81de7b428d535bee7ade8))
* <ts> add import as support ([364a98d](https://github.com/phodal/chapi/commit/364a98d7293a1dd2771968a486210f8d57eab0f0))
* <ts> add import require support ([ccae94c](https://github.com/phodal/chapi/commit/ccae94c4b86808390cc6a5dbb81d739abb841c21))
* <ts> add interface extend suport ([da9db66](https://github.com/phodal/chapi/commit/da9db6614cf7e355322ec51719abc073adc309c2))
* <ts> add interface method support ([7b239c4](https://github.com/phodal/chapi/commit/7b239c4b1eb179d1b6176ac314c804340181908f))
* <ts> add interface struct field support ([d86941c](https://github.com/phodal/chapi/commit/d86941cbb132ad1027893ea0b46ecfd898fac1bb))
* <ts> add multiple class node support ([fd6a540](https://github.com/phodal/chapi/commit/fd6a540ed5069b60178a3acffc0e78e178c57ba1))
* <ts> add multiple usage support ([ccd4ad6](https://github.com/phodal/chapi/commit/ccd4ad631d1a69a77253cc91dfc0b78e95cb97f3))
* <ts> add namespace as packagename support ([a38a124](https://github.com/phodal/chapi/commit/a38a12472bc6272d55e6ae7d7adb61dafa997113))
* <ts> add sepcific symbol support ([31238fc](https://github.com/phodal/chapi/commit/31238fccf92391dfe42f95ba6ae5bb488e4601c2))
* <ts> add usage name support ([7b0af15](https://github.com/phodal/chapi/commit/7b0af15fd62548749a16f072ce33bede266d5dc7))
* <ts> grammar add jquery & lodash support ([64a7b61](https://github.com/phodal/chapi/commit/64a7b615f5c2b5eb7ecad3b6323e093040bec0f1))
* <ts> make call show origin name ([0fb4491](https://github.com/phodal/chapi/commit/0fb449108cbd59be94b41fcf45564182c3f7a22b))
* <ts> try to migrate java logic ([dcf2bf9](https://github.com/phodal/chapi/commit/dcf2bf9786dab3a5e7672a212f81e81280897af4))
* <typescript> add lost file path for ds support ([3069f8e](https://github.com/phodal/chapi/commit/3069f8ea21b64176ffa0f10bb1afcdc2de1436d8))
* add basic application parse for examples ([3971908](https://github.com/phodal/chapi/commit/39719086a49d5d407f6158bcba9eaa1bb7460775))
* add kotlin seriral to json ([1e9fcdc](https://github.com/phodal/chapi/commit/1e9fcdc9c6a7c2f3cbdf6e8a91687a722090746a))
* init code annotaion domain ([17fc44b](https://github.com/phodal/chapi/commit/17fc44ba833ba64a567d2008b913952fb5a9cbeb))
* init java boilerplate ([fb6b9a5](https://github.com/phodal/chapi/commit/fb6b9a517034850d0596be5a4a4791f7490d1da7))
* move domain to domain repository ([662ab3c](https://github.com/phodal/chapi/commit/662ab3c7c8b67a535266d204de8454850df1791c))
* rename default infra ([f2f5ad0](https://github.com/phodal/chapi/commit/f2f5ad00a3a0db3b734cf5f9e52bd0672caf6a46))



