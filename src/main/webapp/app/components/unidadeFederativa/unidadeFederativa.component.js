import controller from './unidadeFederativa.controller';

const UnidadeFederativaComponent = { 
  bindings: {
    unidadeFederativaData: '<'
  },
  controller,
  template: `
    <div class="unidadeFederativa">
      <unidadeFederativa-form
        unidadeFederativa="$ctrl.newUnidadeFederativa"
        on-add-unidadeFederativa="$ctrl.addUnidadeFederativa($event);">
      </unidadeFederativa-form>
      <unidadeFederativa-list
        unidadeFederativas="$ctrl.unidadeFederativas"></unidadeFederativa-list>
    </div>
  `
};

export default UnidadeFederativaComponent;