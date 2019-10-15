import angular from 'angular';
import uiRouter from 'angular-ui-router';
import UnidadeFederativaComponent from './unidadeFederativa.component';
import UnidadeFederativaService from './unidadeFederativa.service';
import UnidadeFederativaForm from './unidadeFederativa-form';
import UnidadeFederativaList  from './unidadeFederativa-list';

const unidadeFederativa = angular
  .module('unidadeFederativa', [
    uiRouter,
    UnidadeFederativaForm,
    UnidadeFederativaList
  ])
  .component('unidadeFederativa', UnidadeFederativaComponent)
  .service('UnidadeFederativaService', UnidadeFederativaService)
  .config(($stateProvider, $urlRouterProvider) => {
    $stateProvider
      .state('unidadeFederativas', {
        url: '/unidadeFederativas',
        component: 'unidadeFederativa',
        resolve: {
          unidadeFederativaData: UnidadeFederativaService => UnidadeFederativaService.getUnidadeFederativas()
        }
      })
    $urlRouterProvider.otherwise('/');
  })
  .name;

export default unidadeFederativa;