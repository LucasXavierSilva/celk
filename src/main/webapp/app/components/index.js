import angular from 'angular';
import UnidadeFederativa from './unidadeFederativa';

const components = angular
  .module('app.components', [
    UnidadeFederativa
  ])
  .name;

export default components;