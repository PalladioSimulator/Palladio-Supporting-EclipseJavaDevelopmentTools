module SimpleNormalModule {
	exports pkg2;
	uses pkg2.SimpleInterfaceWithDefaultMethods;
	exports simplepackage;
	requires transitive java.desktop;
	provides pkg2.SimpleInterfaceWithDefaultMethods with pkg2.SimpleInterfaceWithDefaultMethods.Implementation;
	opens pkg2 to java.base;
}
