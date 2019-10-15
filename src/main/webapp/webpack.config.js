var path = require('path');
var webpack = require('webpack');
module.exports = {
	optimization : {
		minimize : false
	},	
	module : {
		rules : [
				{
					test : /\.html$/,
					loader : 'ngtemplate?relativeTo='
							+ (path.resolve(__dirname)) + '/app/!html'
				}, {
					test : /\.js?$/,
					exclude : /(node_modules|bower_components)/,
					loader : 'babel-loader', // 'babel-loader' is also a
												// legal name to reference
					query : {
						presets : [ '@babel/preset-env' ],
						cacheDirectory : true
					}
				} ]
	},
	context : __dirname,
	entry : "./app/index.js",
	output : {
		path : path.join(__dirname, "dist"),
		filename : "bundle.js"
	},
	devtool : "source-map"
}
