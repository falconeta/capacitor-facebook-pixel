import { registerPlugin } from '@capacitor/core';

import type { CapacitorFacebookPixelPlugin } from './definitions';

const CapacitorFacebookPixel = registerPlugin<CapacitorFacebookPixelPlugin>(
  'CapacitorFacebookPixel',
  {
    web: () => import('./web').then(m => new m.CapacitorFacebookPixelWeb()),
  },
);

export * from './definitions';
export { CapacitorFacebookPixel };
