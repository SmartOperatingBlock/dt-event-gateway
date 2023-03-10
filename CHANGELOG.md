## [1.5.0](https://github.com/SmartOperatingBlock/dt-event-gateway/compare/1.4.1...1.5.0) (2023-03-10)


### Features

* make the signalr connection persistent ([e57cb70](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/e57cb703acc36a9d9daa2c52a4026e9141f3df77))


### Bug Fixes

* change property name due to serialization bug ([04de8ef](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/04de8ef56b70633991ac4b347ce590f58435b3e9))

## [1.4.1](https://github.com/SmartOperatingBlock/dt-event-gateway/compare/1.4.0...1.4.1) (2023-03-09)


### Bug Fixes

* change type of event key in events schema ([06494b8](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/06494b8edb223512db0d2d355acf08e09b26b95e))


### Dependency updates

* **deps:** update node.js to 18.15 ([3d2179f](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/3d2179f020cd08dd4a17df13676f7e58dc5f04ff))


### Refactoring

* move event key enum in entity package ([f10aa15](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/f10aa157db7fe6fc345270067ccf2685e5870656))

## [1.4.0](https://github.com/SmartOperatingBlock/dt-event-gateway/compare/1.3.2...1.4.0) (2023-03-07)


### Features

* **events:** use different event keys for kafka events ([d82987b](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/d82987be342bbf085664dde851b65d48d324096e))

## [1.3.2](https://github.com/SmartOperatingBlock/dt-event-gateway/compare/1.3.1...1.3.2) (2023-03-06)


### Dependency updates

* **deps:** update dependency gradle to v8.0.2 ([2904423](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/2904423781fbe9159a5f3ba8eb166e8a7ad214d2))
* **deps:** update plugin com.gradle.enterprise to v3.12.4 ([7474ecd](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/7474ecd133b2cfe058c8bcaa53e75d11aed93fb3))
* **deps:** update plugin kotlin-qa to v0.35.0 ([7ebecd7](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/7ebecd7ad1336e8d9e9fbe04c4c4c2074603658b))
* **deps:** update plugin kotlin-qa to v0.36.0 ([a1b1936](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/a1b1936c1435ce2071c6c8df2b842c884b8093eb))
* **deps:** update plugin kotlin-qa to v0.36.1 ([95a222f](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/95a222f1e5b20091cbe629d26316e4f4295d33ec))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.5 ([5e581e3](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/5e581e32d98026f4a098ec8561eb4e98c547f769))


### Documentation

* **deps:** update plugin dokka to v1.8.10 ([f73a7b9](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/f73a7b95b06fb1e847493a4ab9c68b077c70626d))

## [1.3.1](https://github.com/SmartOperatingBlock/dt-event-gateway/compare/1.3.0...1.3.1) (2023-03-02)


### Documentation

* **asyncapi:** add documentation for medical technology usage event ([344f871](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/344f871545343363e511d15f9cdfd285206eb58f))

## [1.3.0](https://github.com/SmartOperatingBlock/dt-event-gateway/compare/1.2.1...1.3.0) (2023-03-02)


### Features

* add medical technology usage event ([9ca07b2](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/9ca07b2c67ab0239368b2ea0262a66a2887ec9ab))


### General maintenance

* update readme with sonarcloud badges and usage section ([6bb8256](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/6bb8256dfba49a89a90682caab3e176e1d90245a))

## [1.2.1](https://github.com/SmartOperatingBlock/dt-event-gateway/compare/1.2.0...1.2.1) (2023-03-01)


### Dependency updates

* **deps:** update confluent to v7.3.2 ([bf65a94](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/bf65a940a1058c739ad7b78d001f618f66fb3ebf))
* **deps:** update plugin kotlin-qa to v0.34.2 ([0451068](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/0451068f1526a9a8302d6f63d4d1de9b4c93746a))


### Documentation

* **asyncapi:** add events documentation with async api standard ([54b7ba3](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/54b7ba32cd4d20dc652bd63231ff30faa19ec69e))

## [1.2.0](https://github.com/SmartOperatingBlock/dt-event-gateway/compare/1.1.0...1.2.0) (2023-02-23)


### Features

* create parser for digital twin lifecycle events ([eaeeada](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/eaeeadada9117e3434a4e08c7847643943573d5e))
* create surgery booking data ([8bf9f0e](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/8bf9f0e4d75afa8dac79726514464f25831f06d0))
* create surgery booking event ([7755d3e](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/7755d3e408ed4b872154d463cf72d35c70b87660))


### Tests

* **architecture:** fix test on clean architecture layers ([1bc6e34](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/1bc6e345b0dd0b9b4498e808f6ded7951c5e979c))


### Build and continuous integration

* change workflow for new release custom action ([b000d7c](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/b000d7c3bc07349a2f92bb011018654e5c2d5d00))
* **deps:** update gradle/wrapper-validation-action action to v1.0.6 ([680563c](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/680563c725fd073704c1e83f5853cee3473b5ddc))


### Dependency updates

* **deps:** update dependency gradle to v8.0.1 ([a6a035c](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/a6a035c66f3d10582230c7794b387218462fcda5))
* **deps:** update plugin kotlin-qa to v0.34.0 ([32afc44](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/32afc4406323e75b32f8db049d2465a854d27f5e))
* **deps:** update plugin kotlin-qa to v0.34.1 ([b8ede40](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/b8ede40e7ad235572648a02ea1305a73adb73295))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.3 ([03843bb](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/03843bb8b3c76658d1a73207423c2e90106bead7))


### General maintenance

* add parser to event parser ([781fe29](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/781fe29b5c3966e78d89ccc0f5972d9ec7f47f52))
* add surgery booking events topic to publisher ([ece20bd](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/ece20bd8bc6f4c0f2036fa06cae6f92173b522e4))
* add surgery booking model to enum ([627f7c9](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/627f7c94d3900df0f5a05bfdbd6f9c34bb4e4f0c))
* change type of lifecycle events data ([ba5c2a7](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/ba5c2a7b29ef78eee40ef11e38c8bf01f01a71f5))
* update README with new documentation links ([ad297dd](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/ad297dd4a2783571ebd882e72e81c0bd47e51830))

## [1.1.0](https://github.com/SmartOperatingBlock/dt-event-gateway/compare/1.0.0...1.1.0) (2023-02-16)


### Features

* change action to generate and deploy documentation ([14ae279](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/14ae279e08adb6ddee22ab2cfd0e57ead652e8aa))


### General maintenance

* renamed asyncapi file ([0be59a5](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/0be59a51850e0021922f5a063f92ca9c3cc21133))

## 1.0.0 (2023-02-15)


### ??? BREAKING CHANGES

* **release:** [skip ci] 1.0.0 released

### Features

* **app-service:** create event service with event flowable ([839d18e](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/839d18eccbe4024e99f9ff5ad86da506637433bf))
* **azure-dt:** add some model of azure digital twins events ([ca50c2f](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/ca50c2f90c890dc2f772972b09b4cb9af981d028))
* create digital twin event parser ([6cf0c16](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/6cf0c16e8e655787daac81a464df419a0878fb99))
* create event consumer interface ([c722847](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/c72284777d875fdce1c9d0a46f2c3ed3a520ad16))
* create event interface ([2294769](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/2294769324344a04505220aa39b66ee5643091bf))
* create event parser interface ([0ae4043](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/0ae404347466c3cc124f992c7d317b80d12da1de))
* create event publisher interface ([d68adc0](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/d68adc07aafca34bcd9c6a8c7bba80e1722ce23e))
* create humidity value object ([aa0ff7c](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/aa0ff7cd3ede9fdd4506d1c928937d30e8cff2ba))
* create kafka producer ([bcec1a2](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/bcec1a23d45a99235d37d6378f1a388a05384bf2))
* create luminosity value object ([88c4992](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/88c499278e1ff566227ef8cb66e6bf32013b3f44))
* create medical device value object ([c96b003](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/c96b003e228afe003de4ccc3ab428ba20ce4a236))
* create parser for digital twin relationships events ([9622822](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/962282203a740b783f645ade0a64070556cdd82d))
* create parser for digital twin update events ([307af9f](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/307af9f9192730ab62397322d0b6cc30927ca6cc))
* create person tracked value object ([d120739](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/d1207395189d6b970e86938bc1cbb73d1c926aaf))
* create presence value object ([24b680a](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/24b680a55c7d48cad7dee5d08d21b77a128a4777))
* create process state value object ([7f4bfcd](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/7f4bfcda7d864af9b74dcaefa31000243c501831))
* create signalR client ([7a49c0e](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/7a49c0ea5c7b36f3f73dd7b73570638f3f6bf09a))
* create temperature value object ([3de1ae3](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/3de1ae323889ad1e6e74c26e52514280ebaf5a22))
* **events:** create process event ([bae7326](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/bae73260ec25a285f931a03810a8803d531d5aae))
* **events:** create room event ([8a033c2](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/8a033c26cbe61b3c6d9066695ce5c0280b6b88bb))
* **events:** create tracking event ([61dfb21](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/61dfb21ce574e18f4a7368988dc8706bbfb4d92e))


### Bug Fixes

* **deps:** correct signalr deps ([bc9b8f3](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/bc9b8f34c10b169299a5ac2b4caef66c31c8144a))


### Documentation

* add sample asyncapi documentation file ([d1b8503](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/d1b8503e614cceda70ca5fcf96088bcaf0143af9))


### Build and continuous integration

* add asyncapi validation job ([1c0373e](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/1c0373e45049ef3b7cf722827a2a6497907e7b76))
* add job to generate and deploy asyncapi documentation ([4eeba69](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/4eeba69c90b30b2e670fd5d607541a24203b2419))
* add runner to async api deploy job ([dd5b42c](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/dd5b42cbebb567ad59a3aa73fa9a524c87be9720))
* modify documentation job to publish in kdoc subdirectory ([250c069](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/250c069e5070f8cc569bac0682761dd74277b0eb))
* remove async api validation job and correct path ([6dcac6d](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/6dcac6d158fa4292dc7e145537bc7c30bf9f37b8))


### Style improvements

* adjust kafka publisher style ([5742879](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/57428798de141e75705c0a3b6e0b67b79283661e))


### Refactoring

* move update and relationship events to dedicated parser ([a0f02ca](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/a0f02ca8f2354b1275d317a88080ae9081f76cb5))
* refactor code for respect style conventions ([7343d5a](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/7343d5aff66d8f8a17112c0fbe20bf5842ec3549))


### Dependency updates

* **deps:** add archunit dependency ([3455e03](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/3455e03310b4c2c81416296bb1f56caf709b4c0a))
* **deps:** add kafka dependencies to gradle build file ([3548452](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/3548452a0862347d124bbdcbf8ba34a081022bb1))
* **deps:** add kafka dependencies to gradle catalog ([598da2a](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/598da2a5e0491230ee81047c0fdbe4852e40f306))
* **deps:** add reactivex and jackson lib to gradle build file ([6df48c5](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/6df48c5638b97b6e21b06a833e8d9cc15bdb3c9f))
* **deps:** add signalr deps to gradle build file ([84a7763](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/84a7763273c0f218d0e0c07dec1a091e906c161a))
* **deps:** add signalr deps to gradle catalog ([025410c](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/025410c1ec2cafc89cd5d6627c7574b65bb5c82f))
* **deps:** update dependency com.microsoft.signalr:signalr to v7.0.2 ([c9f5e54](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/c9f5e5464c0205148a7412a296f743146dc5c76d))
* **deps:** update dependency com.microsoft.signalr:signalr to v7.0.3 ([e6f2710](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/e6f2710eee4814890b0c7b50651b23ffd5a6eb2b))
* **deps:** update dependency gradle to v8 ([25583fa](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/25583fa2f70a4c5945f5ba481d056c281cf5f35b))
* **deps:** update kafka to v3.4.0 ([49deed0](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/49deed053085494781ba191e19787012d5a1a43b))


### Tests

* **architecture:** add archunit tests to enforce the following of clean architecture principles ([e3f790a](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/e3f790a99b7cd00f7aaf6b3689ef06031dcaf5e1))
* **parser:** add parser tests ([6e18782](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/6e18782f7629b6eb85ea8bc76b7507838e7e048f))


### General maintenance

* add datetime property to event ([bd16b78](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/bd16b784ae6e693805fb5c5a89925b6583633651))
* add measure unit to temperature and luminosity ([1a938af](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/1a938afeb25d60b35515118462466bb92b42542c))
* add process id to process event ([c0b9332](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/c0b9332b541cd84eac9782b87b70e2a2778e5a6f))
* add process info data for process events ([8c10108](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/8c101083e62b8dcbbbee61c533b46de1db8fadc5))
* add reactivex lib to gradle catalog ([a81e30b](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/a81e30b16585f8ed74846c64caf8f0aac5ef82ba))
* add sample asyncAPI document ([5c31226](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/5c312261621cefbd667543367e7afd09c7a96869))
* adjust import for new package parser ([67a0e3c](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/67a0e3cd41c21c73f5b8fd07e315c3d9737f78b1))
* adjust import for new package parser ([4af8f34](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/4af8f3489bf7476f293b19f71259c11cb829e9d7))
* arrange import in alphabetical order ([8db40e6](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/8db40e693de5fe792b147f5cf4ae5452e4e6cf31))
* change kafka producer due to new event publisher type ([ee3c5b9](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/ee3c5b9b557e968b4430fc1f23acee138a4a3fd0))
* change launcher with new event publisher type ([e2801c3](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/e2801c3c7d8739c2fa06de763c6fdfda8a86c6d9))
* change project name ([db9008d](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/db9008d2100181d3e83ded9f6d828c918bf1f640))
* change type of event publisher ([9676605](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/9676605988beedf2599100b9e98edb648f4311fd))
* create application launcher ([ccee1d8](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/ccee1d83b57a66995db1e92d537a0e6fcb270050))
* create empty event ([dd52695](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/dd526958debda388bffa44b71f15e815840d293c))
* create enum class for twin properties ([45d4592](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/45d4592962a57e2f15ba2e2ec8848e633d47df36))
* create model for lifecyle digital twins events ([666405e](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/666405e686a2c79d365d5ba8d98b95a467455122))
* create model for relationship digital twins events ([4e3028f](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/4e3028f01f81caf1e5f8833110fd4d5932203716))
* create model for relationship digital twins events ([ca1929b](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/ca1929b337f5b082775f47cd17509f77ffc6ae6e))
* create patient data ([89cccf0](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/89cccf0ffa1f0077b7863c59f522033899f4bffa))
* delete template test class ([2a1b120](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/2a1b120dc86f1c584ba52ecd9b6b5e858c2722b5))
* delete useless tracking data ([88f6cd9](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/88f6cd9f11b3ac4bb5ed3ef118b5b1e8fa808960))
* **docker:** add run gradle task to dockerfile ([25a6afe](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/25a6afe09990c092762df7ed99226acfa478ec07))
* **docs:** change asyncapi version ([589da31](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/589da316f5b73ab6b40cb76e620951fb522a8f71))
* modify type in event interface ([b04a1ee](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/b04a1ee2e5b648303ee91c1ab8d1f8da4de9fee4))
* **release:** [skip ci] 1.0.0 released ([f48fd5c](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/f48fd5cabbe5f6e66a2f177b88e88681082c2933))
* send events only if necessary ([9dd1f4a](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/9dd1f4a96293c2ac2be52a16adef161d68250cb2))
* **test:** add some resource for event tests" ([5bd6f0e](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/5bd6f0e83bc8565fb39c823396f8c3988388c80c))
* update README ([b55f4d3](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/b55f4d3b9c49e133b0e214c1feec20477c3ae6db))
* update README with schema and documentation link ([127f392](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/127f3928238c7649ef7b9a0a2d49fbb9152e1ca0))

## 1.0.0 (2023-02-14)


### Bug Fixes

* **deps:** correct signalr deps ([bc9b8f3](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/bc9b8f34c10b169299a5ac2b4caef66c31c8144a))


### Documentation

* add sample asyncapi documentation file ([d1b8503](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/d1b8503e614cceda70ca5fcf96088bcaf0143af9))


### Build and continuous integration

* add asyncapi validation job ([1c0373e](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/1c0373e45049ef3b7cf722827a2a6497907e7b76))
* add job to generate and deploy asyncapi documentation ([4eeba69](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/4eeba69c90b30b2e670fd5d607541a24203b2419))
* add runner to async api deploy job ([dd5b42c](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/dd5b42cbebb567ad59a3aa73fa9a524c87be9720))
* modify documentation job to publish in kdoc subdirectory ([250c069](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/250c069e5070f8cc569bac0682761dd74277b0eb))
* remove async api validation job and correct path ([6dcac6d](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/6dcac6d158fa4292dc7e145537bc7c30bf9f37b8))


### General maintenance

* add sample asyncAPI document ([5c31226](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/5c312261621cefbd667543367e7afd09c7a96869))
* change project name ([db9008d](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/db9008d2100181d3e83ded9f6d828c918bf1f640))
* **docs:** change asyncapi version ([589da31](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/589da316f5b73ab6b40cb76e620951fb522a8f71))
* update README ([b55f4d3](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/b55f4d3b9c49e133b0e214c1feec20477c3ae6db))
* update README with schema and documentation link ([127f392](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/127f3928238c7649ef7b9a0a2d49fbb9152e1ca0))


### Dependency updates

* **deps:** add kafka dependencies to gradle build file ([3548452](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/3548452a0862347d124bbdcbf8ba34a081022bb1))
* **deps:** add kafka dependencies to gradle catalog ([598da2a](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/598da2a5e0491230ee81047c0fdbe4852e40f306))
* **deps:** add signalr deps to gradle build file ([84a7763](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/84a7763273c0f218d0e0c07dec1a091e906c161a))
* **deps:** add signalr deps to gradle catalog ([025410c](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/025410c1ec2cafc89cd5d6627c7574b65bb5c82f))
* **deps:** update dependency com.microsoft.signalr:signalr to v7.0.2 ([c9f5e54](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/c9f5e5464c0205148a7412a296f743146dc5c76d))
* **deps:** update dependency com.microsoft.signalr:signalr to v7.0.3 ([e6f2710](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/e6f2710eee4814890b0c7b50651b23ffd5a6eb2b))
* **deps:** update kafka to v3.4.0 ([49deed0](https://github.com/SmartOperatingBlock/dt-event-gateway/commit/49deed053085494781ba191e19787012d5a1a43b))

## [0.1.1](https://github.com/SmartOperatingBlock/kotlin-template-project/compare/0.1.0...0.1.1) (2023-02-06)


### General maintenance

* activate publish on github pages by semantic release plugin ([8a9001c](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/8a9001cea81ea319a19af37f6545a0bc7a86a31d))
* add Dockerfile ([2a36c9f](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/2a36c9f6b542ffb6d59fe8b3a915f15b83dae755))
* add plugin for publish documentation to github pages ([99eb3c8](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/99eb3c8e3fd98388f268fc1443e6f8186e44606e))
* change plugin for publish documentation to github pages ([ced9b0a](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/ced9b0ab4d85184eb7cca15726c1e156e82bff7d))
* configure semantic release to deploy documentation on github pages ([683e53f](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/683e53f6383286a7ee51a2a4d9d5d6cac8221e2c))
* ensure ci success before merging pull request ([4c124f4](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/4c124f4ab5dc3533f343fb84c3261bdd82ebf8e3))
* update gitignore ([d1d1ba3](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/d1d1ba3a8d1ed41c8fdbc6e68a1fa48121bb8500))
* update gitignore with checkstyle-idea file ([5065596](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/506559626d185616be0b497f828b3954a6a7639c))
* update README ([f9800e0](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/f9800e04b39a1ae2826adbff26592f08fba534cd))


### Build and continuous integration

* add codecov action to generate coverage from jacoco report ([e0365aa](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/e0365aa1d2b767c1d773106f74f00489a461c544))
* add docker image auto delivery ([05f996d](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/05f996d993fd29f7dfb9f8f268d8d1cca365fab2))
* add docs generation step ([6073bda](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/6073bdaa781bf7679de69ffa711b7af8834b7f36))
* **deps:** update docker/build-push-action action to v3.3.1 ([a19985a](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/a19985a3d47ce45d4c1133527c89314eeb3257fe))
* **deps:** update docker/build-push-action action to v4 ([2f667d7](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/2f667d7835f9c55f6de1cc5f808de51d973b645d))
* export version number from semantic release ([922a212](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/922a2125cb81b830026737608e7d0bd04cab57bc))
* make image name lowercase ([3e34d6d](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/3e34d6d37b2ad7b682b0418ff2c2e6ed6f690327))
* modify condition for documentation deploy ([76fcef6](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/76fcef6b274f8489ce642c2d49c77ae2cd572a16))
* modify release concurrency group ([9002f26](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/9002f2625f0e6d1ad758b0ddb906c6c1af985a49))


### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin:kotlin-stdlib to v1.8.10 ([d637f2e](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/d637f2ebc93c686311057c0790cb17a8db6af3e5))
* **deps:** update node.js to 18.14 ([e7105c5](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/e7105c5c6d3192852b8d79056385e94bf6937264))
* **deps:** update plugin com.gradle.enterprise to v3.12 ([ccce09d](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/ccce09d55f5b0a2ced1aefb6d0db386e47d1bc81))
* **deps:** update plugin com.gradle.enterprise to v3.12.1 ([bf28ba4](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/bf28ba43df7a82e7cbcb8e44d2fa874f533da2de))
* **deps:** update plugin com.gradle.enterprise to v3.12.2 ([5a11c72](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/5a11c72463d7d37f9f46070b429fa5973a5d4aa8))
* **deps:** update plugin com.gradle.enterprise to v3.12.3 ([18e6393](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/18e63935ef61344e5079600d0f8adaa1a6283b28))
* **deps:** update plugin kotlin-qa to v0.32.0 ([43155c8](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/43155c8a0fe2c07c3add9beeb42017822d2d0062))
* **deps:** update plugin kotlin-qa to v0.33.0 ([7e80e6f](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/7e80e6f763899189951763d01d3cfc6daa554bce))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.1 ([920e201](https://github.com/SmartOperatingBlock/kotlin-template-project/commit/920e201193df0f1cbe0a8c6f4104293ce0d99a3c))
