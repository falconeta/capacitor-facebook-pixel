import { WebPlugin } from '@capacitor/core';

import type { CapacitorFacebookPixelPlugin } from './definitions';

export class CapacitorFacebookPixelWeb
  extends WebPlugin
  implements CapacitorFacebookPixelPlugin
{
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
