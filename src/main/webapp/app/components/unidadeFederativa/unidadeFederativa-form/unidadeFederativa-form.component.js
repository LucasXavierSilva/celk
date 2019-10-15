import controller from './unidadeFederativa-form.controller';

const UnidadeFederativaFormComponent = {
  bindings: {
    unidadeFederativa: '<',
    onAddUnidadeFederativa: '&'
  },
  controller,
  template: `
    <form name="unidadeFederativaForm" ng-submit="$ctrl.onSubmit();">
      <input type="text" ng-model="$ctrl.unidadeFederativa.title">
      <button type="submit">Submit</button>
    </form>
  `
};

export default UnidadeFederativaFormComponent;