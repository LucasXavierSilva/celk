/* ----- unidadeFederativaunidadeFederativa-list/index.js ----- */
import angular from 'angular';
import UnidadeFederativaListComponent from './unidadeFederativa-list.component';

const unidadeFederativaList = angular
  .module('unidadeFederativa.list', [])
  .component('unidadeFederativaList', UnidadeFederativaListComponent)
  .name;

export default unidadeFederativaList;