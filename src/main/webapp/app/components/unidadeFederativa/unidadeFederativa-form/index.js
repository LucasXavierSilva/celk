/* ----- unidadeFederativa/unidadeFederativa-form/index.js ----- */
import angular from 'angular';
import UnidadeFederativaFormComponent from './unidadeFederativa-form.component';

const unidadeFederativaForm = angular
  .module('unidadeFederativa.form', [])
  .component('unidadeFederativaForm', UnidadeFederativaFormComponent)
  .value('EventEmitter', payload => ({ $event: payload}))
  .name;

export default unidadeFederativaForm;