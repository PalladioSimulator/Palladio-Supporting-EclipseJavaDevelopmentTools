module SimpleNormalModule {
	exports pkg2;
	uses pkg2.SimpleInterfaceWithDefaultMethods;
	exports simplepackage;
	requires transitive java.desktop;
}
